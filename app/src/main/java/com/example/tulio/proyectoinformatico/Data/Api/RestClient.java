package com.example.tulio.proyectoinformatico.Data.Api;

import com.example.tulio.proyectoinformatico.Data.Model.Equipos;
import com.example.tulio.proyectoinformatico.Data.Model.FechaPartido;
import com.example.tulio.proyectoinformatico.Data.Model.TablaEquipo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RestClient {
    @GET("/equipos")
    Call<List<Equipos>> getData();

//debo cambiar el nombre del metodo, no deben ser iguales
    @GET("/tabla_equipos/{divisionid}")
    Call<List<TablaEquipo>> getTabla_equipo(@retrofit2.http.Path("divisionid") int divisionid);

    @GET("/tabla_partido/1")
    Call<List<TablaEquipo>> getTabla_equipo();

     @GET("fechas_partidos/{id}")
    Call<List<FechaPartido>> getTabla_partidos(@retrofit2.http.Path("id") int id);
}
