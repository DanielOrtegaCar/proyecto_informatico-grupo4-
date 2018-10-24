package com.example.tulio.proyectoinformatico.Fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.R;

public class Tab_Noticias extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View rootView= inflater.inflate(R.layout.noticias, container, false);
        return rootView;
    }


}
