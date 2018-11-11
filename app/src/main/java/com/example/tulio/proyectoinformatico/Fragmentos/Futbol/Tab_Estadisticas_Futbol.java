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
import com.example.tulio.proyectoinformatico.Data.Model.TablaGoleador;
import com.example.tulio.proyectoinformatico.R;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Estadisticas_Futbol extends Fragment {
    //generico
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.futbol_estadisticas, container, false);

        mRecyclerView = rootView.findViewById(R.id.lista_goleador); // cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<TablaGoleador>> call = client.getTabla_goleador(2); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new Callback<List<TablaGoleador>>() {
            @Override
            public void onResponse(Call<List<TablaGoleador>> call, Response<List<TablaGoleador>> response) {
                TablaGoleador[] equipos = new TablaGoleador[response.body().size()];
                mAdapter = new AdapterGoleador(response.body().toArray(equipos));
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<List<TablaGoleador>> call, Throwable t) {

            }
        });
        return rootView;
    }

}
class AdapterGoleador extends RecyclerView.Adapter<AdapterGoleador.ElementoTablas> {
    private TablaGoleador[] mDataset;

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
public static class ElementoTablas extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView equipo, jugador, goles; //para el layout de un elemento
    public ElementoTablas(View v) {
        super(v);
        equipo = v.findViewById(R.id.equipo);
        jugador = v.findViewById(R.id.jugador);
        goles = v.findViewById(R.id.goles);
    }
}

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterGoleador(TablaGoleador[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdapterGoleador.ElementoTablas onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemento_goleador, parent, false);

        ElementoTablas vh = new ElementoTablas(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    // rellena la vista con los datos del elemento en la posicion del arreglo
    public void onBindViewHolder(ElementoTablas holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.equipo.setText(mDataset[position].getEquipo());
        holder.jugador.setText(mDataset[position].getJugador());
        holder.goles.setText(mDataset[position].getGoles());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
