package com.alvar.practica4pmdm;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DesplazandoImagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);


        TerceroFragment fragment3 = new TerceroFragment();
        CuartoFragment fragment4 = new CuartoFragment();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.imagenes,fragment3,null);
        fragmentTransaction.add(R.id.imagenes,fragment4,null);

        fragmentTransaction.commit();

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerDesplazandoImagenes(getSupportFragmentManager()));

    }
}
