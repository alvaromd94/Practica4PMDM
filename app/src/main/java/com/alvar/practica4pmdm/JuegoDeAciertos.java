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
    RadioButton radioButtonOporto;
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
        radioButtonOporto = findViewById(R.id.radioButtonOporto);
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
                if(radioButtonSpain.isChecked())  textViewPais.setText("España");
                if(radioButtonFrancia.isChecked()) textViewPais.setText("Francia");
                if(radioButtonItalia.isChecked()) textViewPais.setText("Italia");
                if(radioButtonPortugal.isChecked()) textViewPais.setText("Portugal");
                if(radioButtonBrasil.isChecked()) textViewPais.setText("Brasil");
                if(radioButtonAlemania.isChecked()) textViewPais.setText("Alemania");
                if(radioButtonRusia.isChecked()) textViewPais.setText("Rusia");
                if(radioButtonChina.isChecked()) textViewPais.setText("China");
                if(radioButtonJapon.isChecked()) textViewPais.setText("Japón");
                if(radioButtonIndia.isChecked()) textViewPais.setText("India");

            }
        });
        radioGroupCapitales.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButtonMadrid.isChecked())  textViewCapital.setText("Madrid");
                if(radioButtonParis.isChecked()) textViewCapital.setText("Paris");
                if(radioButtonRoma.isChecked()) textViewCapital.setText("Roma");
                if(radioButtonOporto.isChecked()) textViewCapital.setText("Oporto");
                if(radioButtonBrasilia.isChecked()) textViewCapital.setText("Brasilia");
                if(radioButtonBerlin.isChecked()) textViewCapital.setText("Berlin");
                if(radioButtonMoscu.isChecked()) textViewCapital.setText("Moscú");
                if(radioButtonTokio.isChecked()) textViewCapital.setText("Tokio");
                if(radioButtonPekin.isChecked()) textViewCapital.setText("Pekín");
                if(radioButtonNuevaDelhi.isChecked()) textViewCapital.setText("Nueva Delhi");

            }
        });

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pais=textViewPais.getText().toString();
                capital=textViewCapital.getText().toString();

                if(pais.equals("España") && capital.equals("Madrid") || pais.equals("Francia") && capital.equals("París") ||
                        pais.equals("Italia") && capital.equals("Roma") || pais.equals("Portugal") && capital.equals("Oporto") ||
                        pais.equals("Alemania") && capital.equals("Berlín") || pais.equals("Rusia") && capital.equals("Moscú") ||
                        pais.equals("Japón") && capital.equals("Tokio") || pais.equals("Brasil") && capital.equals("Brasilia") ||
                        pais.equals("China") && capital.equals("Pekín") ||
                        pais.equals("India") && capital.equals("Nueva Delhi"))
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
