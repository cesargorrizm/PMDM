package com.cesar.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numeroPreg = findViewById(R.id.tvNumPre);
        TextView pregunta = findViewById(R.id.tvPregunta);
        TextView ecuacion = findViewById(R.id.tvEcuacion);
        RadioButton primerares = findViewById(R.id.rbRespuesta1);
        RadioButton segundares= findViewById(R.id.rbRespuesta2);
        Button btnvalidar = findViewById(R.id.btnValidar);


        btnvalidar.setOnClickListener(view -> {

            if (i ==0){
                if (primerares.isSelected()) {
                 i++;
                }else if (segundares.isSelected()){

                }else if (!primerares.isSelected() && !segundares.isSelected()){

                }
            }
        });
    }
}