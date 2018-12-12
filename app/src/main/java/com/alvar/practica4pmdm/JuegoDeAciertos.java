package com.alvar.practica4pmdm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class JuegoDeAciertos extends AppCompatActivity {

    RadioGroup radioGroupPaises;
    RadioButton radioButtonSpain;
    RadioButton radioButtonFrancia;
    RadioButton radioButtonItalia;
    RadioButton radioButtonPortugal;
    RadioButton radioButtonBrasil;
    RadioButton radioButtonAlemania;
    RadioButton radioButtonRusia;
    RadioButton radioButtonChina;
    RadioButton radioButtonJapon;
    RadioButton radioButtonIndia;

    RadioGroup radioGroupCapitales;
    RadioButton radioButtonMadrid;
    RadioButton radioButtonParis;
    RadioButton radioButtonRoma;
    RadioButton radioButtonLisboa;
    RadioButton radioButtonBrasilia;
    RadioButton radioButtonBerlin;
    RadioButton radioButtonMoscu;
    RadioButton radioButtonPekin;
    RadioButton radioButtonTokio;
    RadioButton radioButtonNuevaDelhi;

    String pais,capital;
    ImageView imageViewAcierto, imageViewError;
    Button buttonVerificar;
    TextView textViewCapital, textViewPais;

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

        radioGroupPaises = findViewById(R.id.radioGroupPaises);
        radioButtonSpain = findViewById(R.id.radioButtonSpain);
        radioButtonFrancia = findViewById(R.id.radioButtonFrancia);
        radioButtonItalia = findViewById(R.id.radioButtonItalia);
        radioButtonPortugal = findViewById(R.id.radioButtonPortugal);
        radioButtonBrasil = findViewById(R.id.radioButtonBrasil);
        radioButtonAlemania = findViewById(R.id.radioButtonAlemania);
        radioButtonRusia = findViewById(R.id.radioButtonRusia);
        radioButtonChina = findViewById(R.id.radioButtonChina);
        radioButtonJapon = findViewById(R.id.radioButtonJapon);
        radioButtonIndia = findViewById(R.id.radioButtonIndia);

        radioGroupCapitales = findViewById(R.id.radioGroupCapitales);
        radioButtonMadrid = findViewById(R.id.radioButtonMadrid);
        radioButtonParis = findViewById(R.id.radioButtonParis);
        radioButtonRoma = findViewById(R.id.radioButtonRoma);
        radioButtonLisboa = findViewById(R.id.radioButtonLisboa);
        radioButtonBerlin = findViewById(R.id.radioButtonBerlin);
        radioButtonMoscu = findViewById(R.id.radioButtonMoscu);
        radioButtonTokio = findViewById(R.id.radioButtonTokio);
        radioButtonPekin = findViewById(R.id.radioButtonPekin);
        radioButtonBrasilia = findViewById(R.id.radioButtonBrasilia);
        radioButtonNuevaDelhi = findViewById(R.id.radioButtonNuevaDelhi);

        imageViewAcierto =findViewById(R.id.imageViewAcierto);
        imageViewError =findViewById(R.id.imageViewError);

        textViewCapital=findViewById(R.id.textViewCapital);
        textViewPais=findViewById(R.id.textViewPais);

        buttonVerificar=findViewById(R.id.buttonVerificar);

        radioGroupPaises.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButtonSpain.isChecked())  textViewPais.setText(getResources().getString(R.string.spain));
                if(radioButtonFrancia.isChecked()) textViewPais.setText(getResources().getString(R.string.francia));
                if(radioButtonItalia.isChecked()) textViewPais.setText(getResources().getString(R.string.italia));
                if(radioButtonPortugal.isChecked()) textViewPais.setText(getResources().getString(R.string.portugal));
                if(radioButtonBrasil.isChecked()) textViewPais.setText(getResources().getString(R.string.brasil));
                if(radioButtonAlemania.isChecked()) textViewPais.setText(getResources().getString(R.string.alemania));
                if(radioButtonRusia.isChecked()) textViewPais.setText(getResources().getString(R.string.rusia));
                if(radioButtonChina.isChecked()) textViewPais.setText(getResources().getString(R.string.china));
                if(radioButtonJapon.isChecked()) textViewPais.setText(getResources().getString(R.string.japon));
                if(radioButtonIndia.isChecked()) textViewPais.setText(getResources().getString(R.string.india));

            }
        });
        radioGroupCapitales.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButtonMadrid.isChecked())  textViewCapital.setText(getResources().getString(R.string.madrid));
                if(radioButtonParis.isChecked()) textViewCapital.setText(getResources().getString(R.string.paris));
                if(radioButtonRoma.isChecked()) textViewCapital.setText(getResources().getString(R.string.roma));
                if(radioButtonLisboa.isChecked()) textViewCapital.setText(getResources().getString(R.string.lisboa));
                if(radioButtonBrasilia.isChecked()) textViewCapital.setText(getResources().getString(R.string.brasilia));
                if(radioButtonBerlin.isChecked()) textViewCapital.setText(getResources().getString(R.string.berlin));
                if(radioButtonMoscu.isChecked()) textViewCapital.setText(getResources().getString(R.string.moscu));
                if(radioButtonTokio.isChecked()) textViewCapital.setText(getResources().getString(R.string.tokio));
                if(radioButtonPekin.isChecked()) textViewCapital.setText(getResources().getString(R.string.pekin));
                if(radioButtonNuevaDelhi.isChecked()) textViewCapital.setText(getResources().getString(R.string.delhi));

            }
        });

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pais=textViewPais.getText().toString();
                capital=textViewCapital.getText().toString();

                if(pais.equals(getResources().getString(R.string.spain)) && capital.equals(getResources().getString(R.string.madrid)) ||
                        pais.equals(getResources().getString(R.string.francia)) && capital.equals(getResources().getString(R.string.paris)) ||
                        pais.equals(getResources().getString(R.string.italia)) && capital.equals(getResources().getString(R.string.roma)) ||
                        pais.equals(getResources().getString(R.string.portugal)) && capital.equals(getResources().getString(R.string.lisboa)) ||
                        pais.equals(getResources().getString(R.string.alemania)) && capital.equals(getResources().getString(R.string.berlin)) ||
                        pais.equals(getResources().getString(R.string.rusia)) && capital.equals(getResources().getString(R.string.moscu)) ||
                        pais.equals(getResources().getString(R.string.japon)) && capital.equals(getResources().getString(R.string.tokio)) ||
                        pais.equals(getResources().getString(R.string.brasil)) && capital.equals(getResources().getString(R.string.brasilia)) ||
                        pais.equals(getResources().getString(R.string.china)) && capital.equals(getResources().getString(R.string.pekin)) ||
                        pais.equals(getResources().getString(R.string.india)) && capital.equals(getResources().getString(R.string.delhi)))
                {
                    imageViewAcierto.setVisibility(View.VISIBLE);
                    imageViewError.setVisibility(View.INVISIBLE);
                }
                else
                {
                    imageViewAcierto.setVisibility(View.INVISIBLE);
                    imageViewError.setVisibility(View.VISIBLE);

                }

            }
        });
    }
}
