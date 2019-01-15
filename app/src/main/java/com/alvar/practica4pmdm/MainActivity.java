package com.alvar.practica4pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                    Button button1 = findViewById(R.id.button1);
                    button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent (v.getContext(), NumerosPrimos.class);
                        startActivityForResult(intent, 0);
                    }
                    });


                    Button button2 = findViewById(R.id.button2);
                     button2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(v.getContext(), JuegoDeAciertos.class);
                       startActivityForResult(intent, 0);
                   }
                     });

                    Button button3 = findViewById(R.id.button3);
                    button3.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent (v.getContext(), DesplazandoImagenes.class);
                            startActivityForResult(intent, 0);
                        }
                    }));

                    Button button4 = findViewById(R.id.button4);
                    button4.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent (v.getContext(), SeleccionandoImagenes.class);
                            startActivityForResult(intent, 0);
                        }
                    }));
                    }
}
