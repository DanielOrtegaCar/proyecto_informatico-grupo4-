package com.example.tulio.proyectoinformatico.Fragmentos.Futbol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tulio.proyectoinformatico.Data.Api.RestClient;
import com.example.tulio.proyectoinformatico.Data.Api.RetrofitUtils;
import com.example.tulio.proyectoinformatico.Data.Model.Equipos;
import com.example.tulio.proyectoinformatico.R;

import java.util.List;
import retrofit2.Call;

public class Tab_Tabla_Futbol extends Fragment {
    //generico
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.futbol_tabla, container, false); // R.layout. completo del fragment, distinto al elemento que quiero acceder

            //copiar
        mRecyclerView = rootView.findViewById(R.id.lista); // cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<Equipos>> call = client.getData(); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new retrofit2.Callback<List<Equipos>>() { // List<Equipos>
            @Override
            public void onResponse(Call<List<Equipos>> call, retrofit2.Response<List<Equipos>> response) {
                /* cambios solo tipo de modelo */
                Equipos[] equipos = new Equipos[response.body().size()];
                mAdapter = new AdapterTablaFutbole(response.body().toArray(equipos));
                mRecyclerView.setAdapter(mAdapter);
                Log.d("RESPUESTA", "entro");

            }

            @Override
            public void onFailure(Call<List<Equipos>> call, Throwable t) {
                Log.e("ERROR", t.toString());

            }
        });
        return rootView;

    }
}

class AdapterTablaFutbole extends RecyclerView.Adapter<AdapterTablaFutbole.ElementoTabla> {
        private Equipos[] mDataset;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class ElementoTabla extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public TextView nombre, facultad, carrera; //para el layout de un elemento
            public ElementoTabla(View v) {
                super(v);
                nombre = v.findViewById(R.id.nombre);
                facultad = v.findViewById(R.id.facultad);
                carrera = v.findViewById(R.id.carrera);

            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterTablaFutbole(Equipos[] myDataset) {
            mDataset = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        // crea la vista
        public AdapterTablaFutbole.ElementoTabla onCreateViewHolder(ViewGroup parent,
        int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.listar_equipos, parent, false);

            ElementoTabla vh = new ElementoTabla(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        // rellena la vista con los datos del elemento en la posicion del arreglo
        public void onBindViewHolder(ElementoTabla holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
           holder.nombre.setText(mDataset[position].getNombre());
           holder.carrera.setText(mDataset[position].getCarrera());
           holder.facultad.setText(mDataset[position].getFacultad());

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }
