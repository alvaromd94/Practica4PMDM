package com.alvar.practica4pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {

    EditText editText;

    Button btnCalcular;
    TextView textViewResultado;

    int numero;
    int i;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);
   editText = findViewById(R.id.editText);
   textViewResultado=findViewById(R.id.textViewResultado);
   btnCalcular=findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero=Integer.parseInt(editText.getText().toString());
                contador=0;

                for(i = 1; i <= numero; i++)
                {
                    if((numero % i) == 0)
                    {
                        contador++;
                    }
                }
                if(contador <= 2)
                {
                    textViewResultado.setText("Este número es primo");
                }
                else
                {
                    textViewResultado.setText("Este número no es primo");
                }
            }
        });
    }
}