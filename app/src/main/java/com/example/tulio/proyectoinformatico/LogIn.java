package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class LogIn extends AppCompatActivity {

    Button btnconsultar, btnRegistrarse, btnIngresar;
    String name, id;
    EditText etide, etNombres, etTelefono, etContrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // btnconsultar = (Button)findViewById(R.id.btnConsultar);
        //  btnGuardar = (Button)findViewById(R.id.btnGuardar);
        //   etide = (EditText)findViewById(R.id.etid);
        etNombres = (EditText)findViewById(R.id.etNombres);
        etContrasena = (EditText)findViewById(R.id.txtPass);
        btnRegistrarse = (Button)findViewById(R.id.btnRegistrar);
        //  etTelefono = (EditText)findViewById(R.id.etTelefono);
        btnIngresar = (Button)findViewById(R.id.btnContinuar);


    /*    btnconsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ConsultarDatos().execute("http://192.168.0.9/android/consulta.php?id="+etId.getText().toString());

            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new CargarDatos().execute("http://192.168.0.9/android/registro.php?nombres="+etNombres.getText().toString()+"&tel="+etTelefono.getText().toString());

            }
        });*/


        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(LogIn.this,Registro.class);
                startActivity(pantalla);
                finish();
            }
        });



        //listener o escuchador para activar el boton de conectarse y saltar a la pantalla principal
        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //   new ConsultarDatos().execute("http://192.168.0.18/android/consulta.php?nombre="+etNombres.getText().toString()+"&pass="+etContrasena.getText().toString());
                // new ConsultarDatos().execute("http://192.168.0.9/android/consulta.php?nombre="+etNombres.getText().toString()+"&pass="+etContrasena.getText().toString());
                // Intent pantalla = new Intent(MainActivity.this,Registro.class);


                Intent pantalla = new Intent(LogIn.this, MainActivity.class);

                startActivity(pantalla);
                finish();




            /*  if(id != null){

                    startActivity(pantalla);
                    finish();
                }

                else{
                    Toast.makeText(getApplicationContext(), "Hubo un error de autenticación", Toast.LENGTH_LONG).show();

                }*/




            }
        });
    }

    private class CargarDatos extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            // params comes from the execute() call: params[0] is the url.
            try {
                return downloadUrl(urls[0]);
            } catch (IOException e) {
                return "Unable to retrieve web page. URL may be invalid.";
            }
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

            Toast.makeText(getApplicationContext(), "Se almacenaron los datos correctamente", Toast.LENGTH_LONG).show();

        }
    }


    private class ConsultarDatos extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            // params comes from the execute() call: params[0] is the url.
            try {
                return downloadUrl(urls[0]);
            } catch (IOException e) {
                return "Unable to retrieve web page. URL may be invalid.";
            }
        }



        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

            JSONArray ja = null;
            try {
                ja = new JSONArray(result);
                id = ja.getString(0);
                //   etide.setText(ja.getString(0));


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }




    private String downloadUrl(String myurl) throws IOException {
        Log.i("URL",""+myurl);
        myurl = myurl.replace(" ","%20");
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500;

        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            // Starts the query
            conn.connect();
            int response = conn.getResponseCode();
            Log.d("respuesta", "The response is: " + response);
            is = conn.getInputStream();

            // Convert the InputStream into a string
            String contentAsString = readIt(is, len);
            return contentAsString;

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public String readIt(InputStream stream, int len) throws IOException, UnsupportedEncodingException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }
}
