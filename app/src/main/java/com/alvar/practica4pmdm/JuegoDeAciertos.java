package com.alvar.practica4pmdm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JuegoDeAciertos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        UnoFragment unoFragemnt = new UnoFragment();
        SegundoFragment segundoFragment = new SegundoFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.juegoAciertos, unoFragemnt, null);
        fragmentTransaction.add(R.id.juegoAciertos,segundoFragment, null);
        fragmentTransaction.commit();
    }
}
