package com.example.tulio.proyectoinformatico.Fragmentos.Futbol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tulio.proyectoinformatico.Adaptadores.NoticiaAdapter;
import com.example.tulio.proyectoinformatico.Adaptadores.TablaAdapter;
import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.Noticia;
import com.example.tulio.proyectoinformatico.Model.TablaPos;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Tabla_Futbol extends Fragment implements Callback<ArrayList<TablaPos>> {


    private RecyclerView primeradiv,segundadiv,champing;
    private TablaAdapter pd, sd, cham;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.futbol_tabla, container, false);

        primeradiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieTabla);
        segundadiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieTablaseg);
        champing = (RecyclerView) rootView.findViewById(R.id.recyvleVieTablachamp);


        primeradiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        segundadiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        champing.setLayoutManager(new LinearLayoutManager(getActivity()));

        pd = new TablaAdapter();
        sd = new TablaAdapter();
        cham = new TablaAdapter();

        primeradiv.setAdapter(pd);
        segundadiv.setAdapter(sd);
        champing.setAdapter(cham);




        Call<ArrayList<TablaPos>> call = PruebaApiAdapter.getApiService().getTabla1DivFutbol();
        call.enqueue(new Callback<ArrayList<TablaPos>>() {
            @Override
            public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> response) {
                if (response.isSuccessful()){
                    ArrayList<TablaPos> respuesta = response.body();
                    Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
                    pd.setmDataSet(respuesta);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<TablaPos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });



        Call<ArrayList<TablaPos>> calls = PruebaApiAdapter.getApiService().getTabla2DivFutbol();
        calls.enqueue(new Callback<ArrayList<TablaPos>>() {
            @Override
            public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> responses) {
                ArrayList<TablaPos> respuestas = responses.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuestas.size());
                sd.setmDataSet(respuestas);
            }

            @Override
            public void onFailure(Call<ArrayList<TablaPos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });


        Call<ArrayList<TablaPos>> callt = PruebaApiAdapter.getApiService().getTablaChampIng();
        callt.enqueue(new Callback<ArrayList<TablaPos>>() {
            @Override
            public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> response) {
                ArrayList<TablaPos> respuesta3 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta3.size());
                cham.setmDataSet(respuesta3);
            }

            @Override
            public void onFailure(Call<ArrayList<TablaPos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });

        return rootView;
    }


    @Override
    public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> response) {

    }

    @Override
    public void onFailure(Call<ArrayList<TablaPos>> call, Throwable t) {

    }
}
