package com.example.tulio.proyectoinformatico.Data.Api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    public static Retrofit getInstance() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://proyectoinfor.000webhostapp.com")
                //.baseUrl("http://10.0.2.2:8000")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static String parseMessage(Response response) {
        try {
            String json = response.errorBody().string();
            return new JsonParser().parse(json).getAsJsonObject().get("message").getAsString();
        } catch (IOException e) {
            return "Ocurrió un error en la respuesta";
        }
    }
}
