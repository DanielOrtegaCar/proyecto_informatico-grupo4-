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
import com.example.tulio.proyectoinformatico.Data.Model.TablaEquipo;
import com.example.tulio.proyectoinformatico.R;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Tabla_Futbol extends Fragment {
    //generico
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.futbol_tabla, container, false); // R.layout. completo del fragment, distinto al elemento que quiero acceder

            //copiar
        mRecyclerView = rootView.findViewById(R.id.lista_puntuacion); // cambiar id reciccler view R.id.lista
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        RestClient client = RetrofitUtils.getInstance().create(RestClient.class);
        Call<List<TablaEquipo>> call = client.getTabla_equipos(1); // cambiar List<Equipos> acomoodar con modelo que quiero llamar
        call.enqueue(new Callback<List<TablaEquipo>>() {
            @Override
            public void onResponse(Call<List<TablaEquipo>> call, Response<List<TablaEquipo>> response) {
                TablaEquipo[] tabla = new TablaEquipo[response.body().size()];
                mAdapter = new AdapterPosiciones(response.body().toArray(tabla));
                mRecyclerView.setAdapter(mAdapter);

            }

            @Override
            public void onFailure(Call<List<TablaEquipo>> call, Throwable t) {

            }
        });
        return rootView;

    }
}

class AdapterPosiciones extends RecyclerView.Adapter<AdapterPosiciones.ElementoTabla> {
        private TablaEquipo[] mDataset;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class ElementoTabla extends RecyclerView.ViewHolder {
            // each data item is just a string in this case

            public TextView equipo, pJ, pG, pP, gF, gC, diff; //para el layout de un elemento
            public ElementoTabla(View v) {
                super(v);
                equipo = v.findViewById(R.id.Equipo);
                pJ = v.findViewById(R.id.PJ);
                pG = v.findViewById(R.id.PG);
                pP = v.findViewById(R.id.PP);
                gF = v.findViewById(R.id.GF);
                gC = v.findViewById(R.id.GC);
                diff= v.findViewById(R.id.Diff);

            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterPosiciones(TablaEquipo[] myDataset) {
            mDataset = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        // crea la vista
        public AdapterPosiciones.ElementoTabla onCreateViewHolder(ViewGroup parent,
        int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.tabla_puntuacion_row, parent, false);

            ElementoTabla vh = new ElementoTabla(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        // rellena la vista con los datos del elemento en la posicion del arreglo
        public void onBindViewHolder(ElementoTabla holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.equipo.setText(mDataset[position].getEquipo());
            holder.pP.setText(mDataset[position].getPp());
            holder.pG.setText(mDataset[position].getPg());
            holder.pJ.setText(mDataset[position].getPj());
            holder.gC.setText(mDataset[position].getGc());
            holder.gF.setText(mDataset[position].getGf());
            holder.diff.setText(mDataset[position].getDifgoles());


        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }
