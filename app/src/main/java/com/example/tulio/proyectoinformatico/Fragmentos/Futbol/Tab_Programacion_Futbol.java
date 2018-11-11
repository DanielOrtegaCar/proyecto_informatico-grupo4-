package com.example.tulio.proyectoinformatico.Fragmentos.Futbol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.tulio.proyectoinformatico.Data.Api.RestClient;
import com.example.tulio.proyectoinformatico.Data.Api.RetrofitUtils;
import com.example.tulio.proyectoinformatico.Data.Model.FechaPartido;
import com.example.tulio.proyectoinformatico.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Programacion_Futbol extends Fragment {

    //generico
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.futbol_programacion, container, false);

        mRecyclerView = rootView.findViewById(R.id.lista_partido); // cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<FechaPartido>> call = client.getTabla_partidos(1); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new Callback<List<FechaPartido>>() {

            public void onResponse(Call<List<FechaPartido>> call, Response<List<FechaPartido>> response) {
                FechaPartido[] equipos = new FechaPartido[response.body().size()];
                mAdapter = new AdapterPartidos(response.body().toArray(equipos));
                mRecyclerView.setAdapter(mAdapter);
            }
            @Override
            public void onFailure(Call<List<FechaPartido>> call, Throwable t) {

            }
        });

        return rootView;
    }



}
class AdapterPartidos extends RecyclerView.Adapter<AdapterPartidos.ElementoTabla> {
    private FechaPartido[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ElementoTabla extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView equipo1, equipo2, fecha, hora, lugar; //para el layout de un elemento
        public ElementoTabla(View v) {
            super(v);
            equipo1 = v.findViewById(R.id.Equipo1);
            equipo2 = v.findViewById(R.id.Equipo2);
            fecha = v.findViewById(R.id.fecha);
            hora = v.findViewById(R.id.hora);
            lugar = v.findViewById(R.id.lugar);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterPartidos(FechaPartido[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    // crea la vista
    public AdapterPartidos.ElementoTabla onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemento_programacion, parent, false);

        ElementoTabla vh = new ElementoTabla(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    // rellena la vista con los datos del elemento en la posicion del arreglo
    public void onBindViewHolder(ElementoTabla holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.equipo1.setText(mDataset[position].getEquipo1());
        holder.equipo2.setText(mDataset[position].getEquipo2());
        holder.fecha.setText(mDataset[position].getFecha());
        holder.hora.setText(mDataset[position].getHora());
        holder.lugar.setText(mDataset[position].getLugarId());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
