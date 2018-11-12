package com.example.tulio.proyectoinformatico.Fragmentos.Inicio;

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
import com.example.tulio.proyectoinformatico.Data.Model.Noticias;
import com.example.tulio.proyectoinformatico.R;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Noticias extends Fragment {
    //generico
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.noticias, container, false); // R.layout. completo del fragment, distinto al elemento que quiero acceder

        //copiar
        mRecyclerView = rootView.findViewById(R.id.lista_noticias); // cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<Noticias>> call = client.getNoticias(); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new Callback<List<Noticias>>() {
            @Override
            public void onResponse(Call<List<Noticias>> call, Response<List<Noticias>> response) {
                Noticias[] notice = new Noticias[response.body().size()];
                mAdapter = new AdapterNoticias(response.body().toArray(notice));
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<List<Noticias>> call, Throwable t) {

            }
        });
        return rootView;

    }
}

class AdapterNoticias extends RecyclerView.Adapter<AdapterNoticias.ElementoTabla> {
    private Noticias[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ElementoTabla extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public TextView titulo,texto; //para el layout de un elemento
        public ElementoTabla(View v) {
            super(v);
            titulo = v.findViewById(R.id.titulo);
            texto= v.findViewById(R.id.texto);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterNoticias(Noticias[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    // crea la vista
    public AdapterNoticias.ElementoTabla onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemento_noticia, parent, false);

        ElementoTabla vh = new ElementoTabla(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    // rellena la vista con los datos del elemento en la posicion del arreglo
    public void onBindViewHolder(ElementoTabla holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.titulo.setText(mDataset[position].getTitulo());
        holder.texto.setText(mDataset[position].getTexto());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
