package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.tulio.proyectoinformatico.Adaptadores.MyAdapter;
import com.example.tulio.proyectoinformatico.IO.PruebaApiAdapter;
import com.example.tulio.proyectoinformatico.Model.fechas;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Prueba extends AppCompatActivity implements Callback<ArrayList<fechas>> {


    private MyAdapter mAdapter;
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        RecyclerView prueba = (RecyclerView) findViewById(R.id.pruebabd);
        volver = (Button) findViewById(R.id.button);

        prueba.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        prueba.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter();
        prueba.setAdapter(mAdapter);


        Call<ArrayList<fechas>> call = PruebaApiAdapter.getApiService().getPrueba();
        call.enqueue(this);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(Prueba.this,MainActivity.class);
                finish();
            }
        });

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
