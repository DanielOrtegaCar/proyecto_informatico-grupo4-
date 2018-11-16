package com.example.tulio.proyectoinformatico.Fragmentos.Basquet;

import android.content.Context;
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


public class Tab_Tabla_Basquet  extends Fragment implements Callback<ArrayList<TablaPos>> {


    private RecyclerView primeradiv,segundadiv,terdiv;
    private TablaAdapter pd, sd, ter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.basquet_tabla, container, false);

        primeradiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieTabla);
        segundadiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieTablaseg);
        terdiv = (RecyclerView) rootView.findViewById(R.id.recyvleVieTablater);


        primeradiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        segundadiv.setLayoutManager(new LinearLayoutManager(getActivity()));
        terdiv.setLayoutManager(new LinearLayoutManager(getActivity()));

        pd = new TablaAdapter();
        sd = new TablaAdapter();
        ter = new TablaAdapter();

        primeradiv.setAdapter(pd);
        segundadiv.setAdapter(sd);
        terdiv.setAdapter(ter);

        Call<ArrayList<TablaPos>> call = PruebaApiAdapter.getApiService().getTabla1DivBasquet();
        Call<ArrayList<TablaPos>> calld = PruebaApiAdapter.getApiService().getTabla2DivBasquet();
        Call<ArrayList<TablaPos>> callt = PruebaApiAdapter.getApiService().getTabla3DivBasquet();

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


        calld.enqueue(new Callback<ArrayList<TablaPos>>() {
            @Override
            public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> response) {
                ArrayList<TablaPos> respuesta2 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta2.size());
                sd.setmDataSet(respuesta2);
            }

            @Override
            public void onFailure(Call<ArrayList<TablaPos>> call, Throwable t) {
                Log.i("ERRRORRRRR!!!",t.getMessage());
            }
        });


        callt.enqueue(new Callback<ArrayList<TablaPos>>() {
            @Override
            public void onResponse(Call<ArrayList<TablaPos>> call, Response<ArrayList<TablaPos>> response) {
                ArrayList<TablaPos> respuesta3 = response.body();
                Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta3.size());
                ter.setmDataSet(respuesta3);
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

