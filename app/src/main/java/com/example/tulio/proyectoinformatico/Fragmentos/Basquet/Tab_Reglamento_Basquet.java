package com.example.tulio.proyectoinformatico.Fragmentos.Basquet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tulio.proyectoinformatico.Data.Api.RestClient;
import com.example.tulio.proyectoinformatico.Data.Api.RetrofitUtils;
import com.example.tulio.proyectoinformatico.Data.Model.Reglamento;
import com.example.tulio.proyectoinformatico.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Reglamento_Basquet extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.reglamentof, container, false);
        mRecyclerView = rootView.findViewById(R.id.lista_reglamentob) ;// cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<Reglamento>> call = client.getReglamento(3); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new Callback<List<Reglamento>>() {
            @Override
            public void onResponse(Call<List<Reglamento>> call, Response<List<Reglamento>> response) {
                Reglamento[] reglamentos = new Reglamento[response.body().size()];
                mAdapter = new AdapterReglamento(response.body().toArray(reglamentos));
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<List<Reglamento>> call, Throwable t) {

            }
        });
        return rootView;
    }
}

class AdapterReglamento extends RecyclerView.Adapter<AdapterReglamento.ElementoTabla> {
    private Reglamento[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ElementoTabla extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView nombre,link; //para el layout de un elemento
        public ElementoTabla(View v) {
            super(v);
            nombre = v.findViewById(R.id.nombre);
            link = v.findViewById(R.id.link);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterReglamento(Reglamento[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    // crea la vista
    public AdapterReglamento.ElementoTabla onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.basquet_reglamento, parent, false);

        AdapterReglamento.ElementoTabla vh = new AdapterReglamento.ElementoTabla(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterReglamento.ElementoTabla holder, int posición) {

        holder.nombre.setText(mDataset[posición].getNombre());
        holder.link.setText(mDataset[posición].getReglamento());
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}





