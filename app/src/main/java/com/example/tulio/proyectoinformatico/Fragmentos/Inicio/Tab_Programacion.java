package com.example.tulio.proyectoinformatico.Fragmentos.Inicio;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.net.Uri;
import android.widget.ProgressBar;
//import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.fechas;
import com.example.tulio.proyectoinformatico.Adaptadores.MyAdapter;
import com.example.tulio.proyectoinformatico.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab_Programacion extends Fragment implements Callback<ArrayList<fechas>> {

    private MyAdapter mAdapter;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
            View rootView= inflater.inflate(R.layout.programacion, container, false);

            RecyclerView prueba = (RecyclerView) rootView.findViewById(R.id.pruebabd);
            /*
            final ProgressBar circulo= (ProgressBar) rootView.findViewById(R.id.CargaFechas);
            prueba.setHasFixedSize(true);
            final Handler handler= new Handler();
            final Runnable runnable;
            Timer timer;
*/

            prueba.setLayoutManager(new LinearLayoutManager(getActivity()));

            mAdapter = new MyAdapter();
            prueba.setAdapter(mAdapter);

            //Call<ArrayList<fechas>> call = PruebaApiAdapter.getApiService().getPrueba();
  //          call.enqueue( this);
/*
            runnable= new Runnable() {
                @Override
                public void run() {
                    circulo.setVisibility(View.INVISIBLE);
                }
            };

            timer= new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(runnable);
                }
            },10000,900);

*/


        return rootView;
    }

    @Override
    public void onResponse(Call<ArrayList<fechas>> call, Response<ArrayList<fechas>> response) {
        if(response.isSuccessful()){

            ArrayList<fechas> respuesta = response.body();
            Log.d("Respuesta de bd", "tamaño del arreglo =>" + respuesta.size());
            mAdapter.setmDataSet(respuesta);

        }
    }

    @Override
    public void onFailure(Call<ArrayList<fechas>> call, Throwable t) {
        Log.i("ERRRORRRRR!!!",t.getMessage());

    }

}
