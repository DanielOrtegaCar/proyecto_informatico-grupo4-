package com.example.tulio.proyectoinformatico.Fragmentos.Futbol;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Data.TabViewPagerAdapter;
import com.example.tulio.proyectoinformatico.R;

public class pestanas_futbol extends Fragment {
    private ViewPager mViewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView= inflater.inflate(R.layout.activity_pestanas_futbol, container, false);
        setHasOptionsMenu(true);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) rootView.findViewById(R.id.container);


        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        setupViewPage(mViewPager);


        return rootView;
    }

    private View setupViewPage(ViewPager viewPager) {
        TabViewPagerAdapter adapter= new TabViewPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new Tab_Tabla_Futbol(), "Tabla");
        adapter.addFragment(new Tab_Programacion_Futbol(), "Programacion");
        adapter.addFragment(new Tab_Estadisticas_Futbol(), "Estadisticas");
        adapter.addFragment(new Tab_Reglamento_Futbol(), "Reglamento");

        viewPager.setAdapter(adapter);
        return viewPager;

    }

}
