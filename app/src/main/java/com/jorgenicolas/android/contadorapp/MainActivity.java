package com.jorgenicolas.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoContadorApp;
    private Button botonContar;
    private Button botonReiniciar;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoContadorApp = (EditText) findViewById(R.id.campo_contadorapp);
        botonContar = (Button) findViewById(R.id.boton_contar);
        botonReiniciar = (Button) findViewById(R.id.boton_reiniciar);

        botonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                campoContadorApp.setText(""+contador);
            }
        });



        botonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = 0;
                campoContadorApp.setText(""+contador);
            }
        });
    }
}
