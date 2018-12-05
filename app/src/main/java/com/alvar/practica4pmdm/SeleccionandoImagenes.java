package com.alvar.practica4pmdm;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeleccionandoImagenes extends AppCompatActivity implements View.OnClickListener {

    Button buttonTulipan;
    Button buttonRosa;
    Button buttonAzahar;
    Button buttonCerezo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        FragmentFlor1 fragmentoTulipan = new FragmentFlor1();

        getSupportFragmentManager().beginTransaction().add(R.id.frame, fragmentoTulipan).commit();

        buttonTulipan =  findViewById(R.id.buttonTulipan);
        buttonRosa =  findViewById(R.id.buttonRosa);
        buttonAzahar = findViewById(R.id.buttonAzahar);
        buttonCerezo = findViewById(R.id.buttonCerezo);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        switch (v.getId()){

            case R.id.buttonTulipan:
                FragmentFlor1 fragmentoTulipan = new FragmentFlor1();
                transition.replace(R.id.frame, fragmentoTulipan);
                transition.commit();

                break;

            case R.id.buttonRosa:
                FragmentFlor2 fragmentoRosa = new FragmentFlor2();
                transition.replace(R.id.frame, fragmentoRosa);
                transition.commit();

                break;

            case R.id.buttonAzahar:
                FragmentFlor3 fragmentoAzahar = new FragmentFlor3();
                transition.replace(R.id.frame, fragmentoAzahar);
                transition.commit();

                break;

            case R.id.buttonCerezo:
                FragmentFlor4 fragmentoCerezo = new FragmentFlor4();
                transition.replace(R.id.frame, fragmentoCerezo);
                transition.commit();

                break;
        }
    }
}
