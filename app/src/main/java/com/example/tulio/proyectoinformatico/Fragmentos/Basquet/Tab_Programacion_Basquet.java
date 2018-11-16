package com.example.tulio.proyectoinformatico.Fragmentos.Basquet;

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

public class Tab_Programacion_Basquet extends Fragment implements Callback<ArrayList<fechas_partidos>> {

    private FechasAdapter prograpidiv, prograsediv, prograchdiv;
    private RecyclerView ppd,psd,pch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.basquet_programacion, container, false);

        ppd = (RecyclerView) rootView.findViewById(R.id.recyvleVieProga);
        psd = (RecyclerView) rootView.findViewById(R.id.recyvleViePrograseg);
        pch = (RecyclerView) rootView.findViewById(R.id.recyvleVieProgaTer);

        ppd.setLayoutManager(new LinearLayoutManager(getActivity()));
        psd.setLayoutManager(new LinearLayoutManager(getActivity()));
        pch.setLayoutManager(new LinearLayoutManager(getActivity()));

        prograpidiv = new FechasAdapter();
        prograsediv = new FechasAdapter();
        prograchdiv = new FechasAdapter();

        ppd.setAdapter(prograpidiv);
        psd.setAdapter(prograsediv);
        pch.setAdapter(prograchdiv);

        Call<ArrayList<fechas_partidos>> call = PruebaApiAdapter.getApiService().getFechasPriDivBas();
        call.enqueue(new Callback<ArrayList<fechas_partidos>>() {
            @Override
            public void onResponse(Call<ArrayList<fechas_partidos>> call, Response<ArrayList<fechas_partidos>> response) {
                if (response.isSuccessful()){
                    ArrayList<fechas_partidos> respuesta = response.body();
                    Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
                    prograpidiv.setmDataSet(respuesta);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<fechas_partidos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });



        Call<ArrayList<fechas_partidos>> calls = PruebaApiAdapter.getApiService().getFechasSeDivBas();
        calls.enqueue(new Callback<ArrayList<fechas_partidos>>() {
            @Override
            public void onResponse(Call<ArrayList<fechas_partidos>> call, Response<ArrayList<fechas_partidos>> responses) {
                ArrayList<fechas_partidos> respuestas = responses.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuestas.size());
                prograsediv.setmDataSet(respuestas);
            }

            @Override
            public void onFailure(Call<ArrayList<fechas_partidos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });


        Call<ArrayList<fechas_partidos>> callt = PruebaApiAdapter.getApiService().getFechasTerDivBas();
        callt.enqueue(new Callback<ArrayList<fechas_partidos>>() {
            @Override
            public void onResponse(Call<ArrayList<fechas_partidos>> call, Response<ArrayList<fechas_partidos>> response) {
                ArrayList<fechas_partidos> respuesta3 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta3.size());
                prograchdiv.setmDataSet(respuesta3);
            }

            @Override
            public void onFailure(Call<ArrayList<fechas_partidos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });

        return rootView;
    }


    @Override
    public void onResponse(Call<ArrayList<fechas_partidos>> call, Response<ArrayList<fechas_partidos>> response) {

    }

    @Override
    public void onFailure(Call<ArrayList<fechas_partidos>> call, Throwable t) {

    }
}
