package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Reglamentos extends Fragment {

    private ViewPager mViewPager;
    private TabLayout tabLayout;
    Button reg1;
    Button reg2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView= inflater.inflate(R.layout.fragment_reglamentos, container, false);

        reg1= (Button) rootView.findViewById(R.id.buttonreg1);
        reg2= (Button) rootView.findViewById(R.id.buttonreg2);

        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/1t6yNt7IhNUpkJduYNKolzZUBU7Y0r9gWDIc2qH68g70/edit");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/1ool2hwphHAuNmVcviUsJAhEc8gkRZk-VJkAD1WLhImQ/edit");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        return rootView;
    }

    public void onReg1(){


    }



}