package com.example.tulio.proyectoinformatico.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tulio.proyectoinformatico.Model.Goleadores;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

public class GoleadoresAdapter extends RecyclerView.Adapter<GoleadoresAdapter.ViewHolder> {
        private ArrayList<Goleadores> mDataSet;

        // Obtener referencias de los componentes visuales para cada elemento
        // Es decir, referencias de los EditText, TextViews, Buttons
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // en este ejemplo cada elemento consta solo de un título
            public TextView textView;
            public ViewHolder(TextView tv) {
                super(tv);
                textView = tv;
            }
        }

        // Este es nuestro constructor (puede variar según lo que queremos mostrar)
    public GoleadoresAdapter() {

            mDataSet = new ArrayList<Goleadores>();

        }

        public void setmDataSet(ArrayList<Goleadores> mDataSet) {
            this.mDataSet = mDataSet;
            notifyDataSetChanged();
        }

        // El layout manager invoca este método
        // para renderizar cada elemento del RecyclerView
        @Override
        public GoleadoresAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
        int viewType) {
            // Creamos una nueva vista
            TextView v = (TextView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.prueba_view, parent, false);

            // Aquí podemos definir tamaños, márgenes, paddings
            // ...

            GoleadoresAdapter.ViewHolder vh = new GoleadoresAdapter.ViewHolder(v);
            return vh;
        }

        // Este método reemplaza el contenido de cada view,
        // para cada elemento de la lista (nótese el argumento position)
        @Override
        public void onBindViewHolder(GoleadoresAdapter.ViewHolder holder, int position) {
            // - obtenemos un elemento del dataset según su posición
            // - reemplazamos el contenido de los views según tales datos

            holder.textView.setText(mDataSet.get(position).toString());
        }

        // Método que define la cantidad de elementos del RecyclerView
        // Puede ser más complejo en RecyclerViews que implementar filtros o búsquedas
        @Override
        public int getItemCount() {
            return mDataSet.size();
        }
    }

