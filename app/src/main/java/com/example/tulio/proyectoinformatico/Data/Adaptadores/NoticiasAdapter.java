package com.example.tulio.proyectoinformatico.Data.Adaptadores;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder>{


    private List<DevelopersList> developersLists;
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

// Inside this class, we’ll have another class for the ViewHolder thus

    Public class ViewHolder extends RecyclerView.ViewHolder{

    }

}