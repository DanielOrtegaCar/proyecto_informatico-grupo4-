package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bsqt;

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

    }
}
