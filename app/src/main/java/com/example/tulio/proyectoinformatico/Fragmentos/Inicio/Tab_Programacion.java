package com.example.tulio.proyectoinformatico.Fragmentos.Inicio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Adaptadores.FechasAdapter;
import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.fechas_partidos;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Programacion extends Fragment implements Callback<ArrayList<fechas_partidos>>  {

    private FechasAdapter mAdapter;
    private RecyclerView prueba;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.programacion, container, false);

        prueba = (RecyclerView) rootView.findViewById(R.id.fechasbd);
        prueba.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new FechasAdapter();
        prueba.setAdapter(mAdapter);

        Call<ArrayList<fechas_partidos>> call = PruebaApiAdapter.getApiService().getFechasPriDivFut();
        call.enqueue( this);

        return rootView;
    }

    @Override
    public void onResponse(Call<ArrayList<fechas_partidos>> call, Response<ArrayList<fechas_partidos>> response) {
        if(response.isSuccessful()){

            ArrayList<fechas_partidos> respuesta = response.body();
            Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
            mAdapter.setmDataSet(respuesta);

        }
    }

    @Override
    public void onFailure(Call<ArrayList<fechas_partidos>> call, Throwable t) {
        Log.i("ERRRORRRRR!!!",t.getMessage());

    }
}