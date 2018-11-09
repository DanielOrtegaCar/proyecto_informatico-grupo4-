package com.example.tulio.proyectoinformatico.Fragmentos.Inicio;

import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD:app/src/main/java/com/example/tulio/proyectoinformatico/Fragmentos/Inicio/pestanas_inicio.java
import com.example.tulio.proyectoinformatico.Adaptadores.TabViewPagerAdapter;
=======
import com.example.tulio.proyectoinformatico.Model.fechas;
>>>>>>> parent of 6a07820... Se integro la pantalla LogIn y Registro:app/src/main/java/com/example/tulio/proyectoinformatico/pestanas_inicio.java

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
        //setContentView(R.layout.activity_pestanas_inicio);
        View rootView= inflater.inflate(R.layout.activity_pestanas_inicio, container, false);
        setHasOptionsMenu(true);

       // Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
       // ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
       // mSectionsPagerAdapter = new SectionsPagerAdapter(((AppCompatActivity)getActivity()).getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) rootView.findViewById(R.id.container);
      //  mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        setupViewPage(mViewPager);

    //    mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
     //   tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

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

    public class TabViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public TabViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}