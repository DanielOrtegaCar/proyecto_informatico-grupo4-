package com.example.tulio.proyectoinformatico;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Adaptadores.TabViewPagerAdapter;
import com.example.tulio.proyectoinformatico.Model.fechas;

import com.example.tulio.proyectoinformatico.Fragmentos.Tab_Noticias;
import com.example.tulio.proyectoinformatico.Fragmentos.Tab_Programacion;
import com.example.tulio.proyectoinformatico.Fragmentos.Tab_Suscritos;

import java.util.ArrayList;
import java.util.List;

public class pestanas_inicio extends Fragment {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    //private Pestanas.SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView= inflater.inflate(R.layout.activity_pestanas_inicio, container, false);
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
        adapter.addFragment(new Tab_Noticias(), "Noticias");
        adapter.addFragment(new Tab_Programacion(), "Programacion");
        adapter.addFragment(new Tab_Suscritos(), "Suscritos");
        viewPager.setAdapter(adapter);
        return viewPager;

    }


}