package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.tulio.proyectoinformatico.Model.modelo;
import com.example.tulio.proyectoinformatico.Modelos.Usuario;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    ImageButton bsqt;
    Retrofit cliente;
    ApiService apiService;
    Usuario usuario;
    List<Usuario> listaUsuarios;
    FragmentTransaction ft;
    FragmentManager fm;


    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsqt= (ImageButton)findViewById(R.id.BotonBasquetbol);

        bsqt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(MainActivity.this,basquet_activity.class);
                startActivity(pantalla);
                finish();
            }
        });
*/
        /////

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            // Fragment
/*
            Fragment fragment;
            fragment= new fragmento();
            fm= getSupportFragmentManager();
            ft= fm.beginTransaction();
            fragment = fm.findFragmentById(R.id.frafCont);
            ft.replace(R.id.frafCont,fragment,"Demo");
            ft.addToBackStack(null);
            ft.commit();
*/
            // End fragment

            // Lista Adaptador








            cliente= new Retrofit.Builder().baseUrl(ApiService.URL).addConverterFactory(GsonConverterFactory.create()).build();
            apiService=cliente.create(ApiService.class);
            apiService.listaUsuarios().enqueue(new Callback<List<Usuario>>() {
                @Override
                public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                    Log.i("Cliente","Cliente Android");
                    if (response.isSuccessful()){
                        listaUsuarios = response.body();
                        for (Usuario usuario:listaUsuarios){
                            Log.i("TEXTO!!!",usuario.toString());
                        }
                    }
                }
                @Override
                public void onFailure(Call<List<Usuario>> call, Throwable t) {
                    Log.i("ERRRORRRRR!!!",t.getMessage());

                }
            });

            bsqt= (ImageButton)findViewById(R.id.BotonBasquetbol);

            bsqt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent pantalla = new Intent(MainActivity.this, Prueba.class);
                    startActivity(pantalla);
                    finish();
                }
            });


        }


    }

