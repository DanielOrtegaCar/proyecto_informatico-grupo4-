package com.example.tulio.proyectoinformatico;


import com.example.tulio.proyectoinformatico.Modelos.Usuario;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


/***
 *
 * Daniel Ortega Carcamo
 */
// http://proyecto-informatico.000webhostapp.com/usuarios

public interface ApiService {
     String URL="http://proyecto-informatico.000webhostapp.com/";

    @GET("usuarios")
   Call<List<Usuario>>listaUsuarios();
}