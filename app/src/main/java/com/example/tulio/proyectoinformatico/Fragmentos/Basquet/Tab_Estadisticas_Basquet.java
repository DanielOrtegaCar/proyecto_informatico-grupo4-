package com.example.tulio.proyectoinformatico.Fragmentos.Basquet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.R;


//fragmento tab de la vista (fragmento padre) pestanas_basquet
public class Tab_Estadisticas_Basquet extends Fragment{

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
            View rootView= inflater.inflate(R.layout.basquet_estadisticas, container, false);
            return rootView;
        }

}
