package com.example.tulio.proyectoinformatico.Data.Api;

import com.example.tulio.proyectoinformatico.Data.Model.Equipos;
import com.example.tulio.proyectoinformatico.Data.Model.FechaPartido;
import com.example.tulio.proyectoinformatico.Data.Model.Login;
import com.example.tulio.proyectoinformatico.Data.Model.Noticias;
import com.example.tulio.proyectoinformatico.Data.Model.ProximosPartido;
import com.example.tulio.proyectoinformatico.Data.Model.Reglamento;
import com.example.tulio.proyectoinformatico.Data.Model.TablaEquipo;
import com.example.tulio.proyectoinformatico.Data.Model.TablaGoleador;
import com.example.tulio.proyectoinformatico.Data.Model.TablaSancione;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;




/*
*  Clase que define los metodos get y post del webservice, para este proyecto solo se ocupan metodos get
*  ya que principalmente queremos obtener informacion del webservice.
*  Ademas de la peticion de informacion, la informacion obtenida es mapeada a un objeto que tiene el modelo
*  de la respuesta obtenida en json, para poder ser utilizado, si se obtiene mas de un objeto por respuesta esto debe ser una lista
*
*
* */

public interface RestClient {

    //listos
    //ocupado en futbol -> tabla
    @GET("/equipos")
    Call<List<Equipos>> getData();
    //ocupado en inicio -> programacion
    @GET("/fechas_partidos/{id}")
    Call<List<FechaPartido>> getTabla_partidos(@retrofit2.http.Path("id") int id);
    
    @GET("/login/{id}")
    Call<List<Login>> getUser(@retrofit2.http.Path("id") int id);

    @GET("/noticias")
    Call<List<Noticias>> getNoticias();
    //faltantes
    @GET("/tabla_goleador/{id}")
    Call<List<TablaGoleador>> getTabla_goleador(@retrofit2.http.Path("id") int id);

    @GET("/tabla_equipos/{id}")
    Call<List<TablaEquipo>> getTabla_equipos(@retrofit2.http.Path("id") int id);

    @GET("/tabla_sanciones/{id}")
    Call<List<TablaSancione>> getTabla_sanciones(@retrofit2.http.Path("id") int id);

    @GET("/reglamento/{id}")
    Call<List<Reglamento>> getReglamento(@retrofit2.http.Path("id") int id);

    @GET("/proximos")
    Call<List<ProximosPartido>> getProximos();



}
