package com.example.tulio.proyectoinformatico.Fragmentos.Basquet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Adaptadores.SancionesAdapter;
import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.Sancionados;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Sancionados_Basquet extends Fragment implements Callback<ArrayList<Sancionados>> {

    private RecyclerView primeradiv,segundadiv,champing;
    private SancionesAdapter pd, sd, cham;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.basquet_sanciones, container, false);

        primeradiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieSan);
        segundadiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieSanseg);
        champing = (RecyclerView) rootView.findViewById(R.id.recyvleVieSanchamp);


        primeradiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        segundadiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        champing.setLayoutManager(new LinearLayoutManager(getActivity()));

        pd = new SancionesAdapter();
        sd = new SancionesAdapter();
        cham = new SancionesAdapter();

        primeradiv.setAdapter(pd);
        segundadiv.setAdapter(sd);
        champing.setAdapter(cham);


        Call<ArrayList<Sancionados>> call = PruebaApiAdapter.getApiService().getTablaSanciones1DivBasq();
        call.enqueue(new Callback<ArrayList<Sancionados>>() {
            @Override
            public void onResponse(Call<ArrayList<Sancionados>> call, Response<ArrayList<Sancionados>> response) {
                if (response.isSuccessful()){
                    ArrayList<Sancionados> respuesta = response.body();
                    Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
                    pd.setmDataSet(respuesta);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Sancionados>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });



        Call<ArrayList<Sancionados>> calls = PruebaApiAdapter.getApiService().getTablaSanciones2DivBasq();
        calls.enqueue(new Callback<ArrayList<Sancionados>>() {
            @Override
            public void onResponse(Call<ArrayList<Sancionados>> call, Response<ArrayList<Sancionados>> responses) {
                ArrayList<Sancionados> respuestas = responses.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuestas.size());
                sd.setmDataSet(respuestas);
            }

            @Override
            public void onFailure(Call<ArrayList<Sancionados>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });


        Call<ArrayList<Sancionados>> callt = PruebaApiAdapter.getApiService().getTablaSanciones3DivBasq();
        callt.enqueue(new Callback<ArrayList<Sancionados>>() {
            @Override
            public void onResponse(Call<ArrayList<Sancionados>> call, Response<ArrayList<Sancionados>> response) {
                ArrayList<Sancionados> respuesta3 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta3.size());
                cham.setmDataSet(respuesta3);
            }

            @Override
            public void onFailure(Call<ArrayList<Sancionados>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });

        return rootView;
    }


    @Override
    public void onResponse(Call<ArrayList<Sancionados>> call, Response<ArrayList<Sancionados>> response) {

    }

    @Override
    public void onFailure(Call<ArrayList<Sancionados>> call, Throwable t) {

    }
}
