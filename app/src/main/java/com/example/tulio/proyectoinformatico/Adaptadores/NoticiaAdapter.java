package com.example.tulio.proyectoinformatico.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tulio.proyectoinformatico.Model.Noticia;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

public class NoticiaAdapter extends RecyclerView.Adapter<NoticiaAdapter.ViewHolder> {
    private ArrayList<Noticia> mDataSet;

    // Obtener referencias de los componentes visuales para cada elemento
    // Es decir, referencias de los EditText, TextViews, Buttons
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // en este ejemplo cada elemento consta solo de un título
        public TextView titulo,texto;
        public ViewHolder(View v) {
            super(v);
            titulo=(TextView) v.findViewById(R.id.Titulo_noticia);
            texto= (TextView) v.findViewById(R.id.Cuerpo_Noticia);
        }
    }

    // Este es nuestro constructor (puede variar según lo que queremos mostrar)
    public NoticiaAdapter() {

        mDataSet = new ArrayList<Noticia>();

    }

    public void setmDataSet(ArrayList<Noticia> mDataSet) {
        this.mDataSet = mDataSet;
        notifyDataSetChanged();
    }

    // El layout manager invoca este método
    // para renderizar cada elemento del RecyclerView
    @Override
    public NoticiaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // Creamos una nueva vista
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.noticia_adapt, parent, false);

        // Aquí podemos definir tamaños, márgenes, paddings
        // ...

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Este método reemplaza el contenido de cada view,
    // para cada elemento de la lista (nótese el argumento position)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido de los views según tales datos

        holder.titulo.setText(mDataSet.get(position).getTitulo());
        holder.texto.setText(mDataSet.get(position).getTexto());
    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo en RecyclerViews que implementar filtros o búsquedas
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
