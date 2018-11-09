package com.example.tulio.proyectoinformatico.Fragmentos.Inicio;

import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulio.proyectoinformatico.Adaptadores.TabViewPagerAdapter;

import com.example.tulio.proyectoinformatico.R;

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