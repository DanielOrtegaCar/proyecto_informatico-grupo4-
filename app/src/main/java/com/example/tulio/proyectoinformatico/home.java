package com.example.tulio.proyectoinformatico;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.tulio.proyectoinformatico.Fragmentos.Tab_Noticias;

public class home extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;
    private FrameLayout frameLayout;
    BottomNavigationView navigation;
    private  pestanas_inicio home;
    private Algo algo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //mTextMessage = (TextView) findViewById(R.id.message);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        frameLayout= (FrameLayout) findViewById(R.id.cont_layout);
        home= new pestanas_inicio();
        algo= new Algo();



        mOnNavigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                       // mTextMessage.setText(R.string.title_home);

                        setFragment(home);
                        return true;
                    case R.id.navigation_dashboard:
                       // mTextMessage.setText("Deportes");
                        setFragment(algo);
                        return true;
                    case R.id.navigation_notifications:
//                        mTextMessage.setText(R.string.title_notifications);
                        return true;
                    case R.id.nav_usuario:

                        return true;
                }
                return false;
            }
        };

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(home);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.cont_layout, fragment);
        fragmentTransaction.commit();
    }


}
