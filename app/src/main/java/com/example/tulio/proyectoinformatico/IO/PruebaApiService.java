package com.example.tulio.proyectoinformatico.IO;



import com.example.tulio.proyectoinformatico.Model.fechas;
import com.example.tulio.proyectoinformatico.Model.modelo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PruebaApiService {

    @GET("futbol")
    Call<ArrayList<fechas>> getPrueba();


}