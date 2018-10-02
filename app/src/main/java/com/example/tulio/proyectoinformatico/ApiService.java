package com.example.tulio.proyectoinformatico;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by daortega 
 */

// http://proyecto-informatico.000webhostapp.com/usuarios

public interface ApiService {
    public static final String URL="http://proyecto-informatico.000webhostapp.com/";

    @GET("usuarios")
   Call<List<Usuario>>listaUsuarios();
}