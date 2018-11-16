package com.example.tulio.proyectoinformatico.IO;



import com.example.tulio.proyectoinformatico.Model.Equipos;
import com.example.tulio.proyectoinformatico.Model.Goleadores;
import com.example.tulio.proyectoinformatico.Model.Noticia;
import com.example.tulio.proyectoinformatico.Model.Sancionados;
import com.example.tulio.proyectoinformatico.Model.TablaPos;
import com.example.tulio.proyectoinformatico.Model.fechas_partidos;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PruebaApiService {

    @GET("noticias")
    Call<ArrayList<Noticia>> getNoticia();

    @GET("fechas_partidos/1")
    Call<ArrayList<fechas_partidos>> getFechasPriDivFut();

    @GET("fechas_partidos/2")
    Call<ArrayList<fechas_partidos>> getFechasSeDivFut();

    @GET("fechas_partidos/3")
    Call<ArrayList<fechas_partidos>> getFechasPriDivBas();

    @GET("fechas_partidos/4")
    Call<ArrayList<fechas_partidos>> getFechasSeDivBas();

    @GET("fechas_partidos/5")
    Call<ArrayList<fechas_partidos>> getFechasTerDivBas();

    @GET("fechas_partidos/6")
    Call<ArrayList<fechas_partidos>> getFechasChIng();

    @GET("equipos")
    Call<ArrayList<Equipos>> getEquipos();

    @GET("tabla_equipos/1")
    Call<ArrayList<TablaPos>> getTabla1DivFutbol();

    @GET("tabla_equipos/2")
    Call<ArrayList<TablaPos>> getTabla2DivFutbol();

    @GET("tabla_equipos/3")
    Call<ArrayList<TablaPos>> getTabla1DivBasquet();

    @GET("tabla_equipos/4")
    Call<ArrayList<TablaPos>> getTabla2DivBasquet();

    @GET("tabla_equipos/5")
    Call<ArrayList<TablaPos>> getTabla3DivBasquet();

    @GET("tabla_equipos/6")
    Call<ArrayList<TablaPos>> getTablaChampIng();

    @GET("tabla_sanciones/1")
    Call<ArrayList<Sancionados>> getTablaSanciones1DivFut();

    @GET("tabla_sanciones/2")
    Call<ArrayList<Sancionados>> getTablaSanciones2DivFut();

    @GET("tabla_sanciones/3")
    Call<ArrayList<Sancionados>> getTablaSanciones1DivBasq();

    @GET("tabla_sanciones/4")
    Call<ArrayList<Sancionados>> getTablaSanciones2DivBasq();

    @GET("tabla_sanciones/5")
    Call<ArrayList<Sancionados>> getTablaSanciones3DivBasq();

    @GET("tabla_sanciones/6")
    Call<ArrayList<Sancionados>> getTablaSancionesChamp();

    @GET("tabla_goleador/1")
    Call<ArrayList<Goleadores>> getTablaGoleadores1DivFut();

    @GET("tabla_goleador/2")
    Call<ArrayList<Goleadores>> getTablaGoleadores2DivFut();

    @GET("tabla_goleador/3")
    Call<ArrayList<Goleadores>> getTablaGoleadores1DivBasq();

    @GET("tabla_goleador/4")
    Call<ArrayList<Goleadores>> getTablaGoleadoreswDivBasq();

    @GET("tabla_goleador/5")
    Call<ArrayList<Goleadores>> getTablaGoleadores3DivBasq();

    @GET("tabla_goleador/6")
    Call<ArrayList<Goleadores>> getTablaGoleadores1Champ();

}