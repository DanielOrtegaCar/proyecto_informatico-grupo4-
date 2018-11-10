package com.example.tulio.proyectoinformatico.Data.Api;

import com.example.tulio.proyectoinformatico.Data.Model.Equipos;

import retrofit2.Call;
import retrofit2.http.GET;
public interface RestClient {
    @GET("usuarios")
    Call<Equipos> getData();


   // @GET("fechas_partidos/{id}")
    //Call<FechaPartido> getDataAbility(@Path("id") int id);
}
