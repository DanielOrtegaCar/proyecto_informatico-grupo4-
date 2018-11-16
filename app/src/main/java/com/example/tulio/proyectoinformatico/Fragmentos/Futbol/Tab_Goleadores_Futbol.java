package com.example.tulio.proyectoinformatico.Fragmentos.Futbol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Adaptadores.GoleadoresAdapter;
import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.Goleadores;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Goleadores_Futbol extends Fragment implements Callback<ArrayList<Goleadores>> {

    private RecyclerView primeradiv,segundadiv,champing;
    private GoleadoresAdapter pd, sd, cham;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.futbol_goleadores, container, false);

        primeradiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieSan);
        segundadiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieSanseg);
        champing = (RecyclerView) rootView.findViewById(R.id.recyvleVieSanchamp);


        primeradiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        segundadiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        champing.setLayoutManager(new LinearLayoutManager(getActivity()));

        pd = new GoleadoresAdapter();
        sd = new GoleadoresAdapter();
        cham = new GoleadoresAdapter();

        primeradiv.setAdapter(pd);
        segundadiv.setAdapter(sd);
        champing.setAdapter(cham);




        Call<ArrayList<Goleadores>> call = PruebaApiAdapter.getApiService().getTablaGoleadores1DivFut();
        call.enqueue(new Callback<ArrayList<Goleadores>>() {
            @Override
            public void onResponse(Call<ArrayList<Goleadores>> call, Response<ArrayList<Goleadores>> response) {
                if (response.isSuccessful()){
                    ArrayList<Goleadores> respuesta = response.body();
                    Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
                    pd.setmDataSet(respuesta);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Goleadores>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });



        Call<ArrayList<Goleadores>> calls = PruebaApiAdapter.getApiService().getTablaGoleadores2DivFut();
        calls.enqueue(new Callback<ArrayList<Goleadores>>() {
            @Override
            public void onResponse(Call<ArrayList<Goleadores>> call, Response<ArrayList<Goleadores>> responses) {
                ArrayList<Goleadores> respuestas = responses.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuestas.size());
                sd.setmDataSet(respuestas);
            }

            @Override
            public void onFailure(Call<ArrayList<Goleadores>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });


        Call<ArrayList<Goleadores>> callt = PruebaApiAdapter.getApiService().getTablaGoleadores1Champ();
        callt.enqueue(new Callback<ArrayList<Goleadores>>() {
            @Override
            public void onResponse(Call<ArrayList<Goleadores>> call, Response<ArrayList<Goleadores>> response) {
                ArrayList<Goleadores> respuesta3 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta3.size());
                cham.setmDataSet(respuesta3);
            }

            @Override
            public void onFailure(Call<ArrayList<Goleadores>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });

        return rootView;
    }


    @Override
    public void onResponse(Call<ArrayList<Goleadores>> call, Response<ArrayList<Goleadores>> response) {

    }

    @Override
    public void onFailure(Call<ArrayList<Goleadores>> call, Throwable t) {

    }
}

