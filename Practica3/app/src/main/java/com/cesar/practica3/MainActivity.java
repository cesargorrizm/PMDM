package com.cesar.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int i = 1;
public boolean bien;
    @SuppressLint("SetTextI18n")
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

        extracted(i,numeroPreg, pregunta, ecuacion, primerares, segundares);
        btnvalidar.setOnClickListener(view -> {
            Intent irSecond = new Intent(this,SecondActivity.class);

            if (i ==1){
                if (primerares.isChecked()==true) {
                 bien= true;
                 irSecond.putExtra("bien",bien);
                 irSecond.putExtra("i",i);
                 i++;
                 extracted(i,numeroPreg, pregunta, ecuacion, primerares, segundares);
                 startActivity(irSecond);

                }else if (segundares.isChecked()==true){
                    bien= false;
                    irSecond.putExtra("bien",bien);
                    irSecond.putExtra("i",i);
                    startActivity(irSecond);
                }else if (!primerares.isChecked()==true && !segundares.isChecked()==true){
                    Toast.makeText(this, "No has marcdo ningun campo",
                            Toast.LENGTH_SHORT).show();
                }
            }else if (i==2){
                if (primerares.isChecked()==true) {
                    bien= false;
                    irSecond.putExtra("bien",bien);
                    irSecond.putExtra("i",i);
                    startActivity(irSecond);

                }else if (segundares.isChecked()==true){
                    bien= true;
                    irSecond.putExtra("bien",bien);
                    irSecond.putExtra("i",i);
                    startActivity(irSecond);
                    i++;
                    extracted(i,numeroPreg, pregunta, ecuacion, primerares, segundares);
                }else if (!primerares.isChecked()==true && !segundares.isChecked()==true){
                    Toast.makeText(this, "No has marcdo ningun campo",
                            Toast.LENGTH_SHORT).show();
                }
            }else if (i==3){
                if (primerares.isChecked()==true) {
                    bien= true;
                    irSecond.putExtra("bien",bien);
                    irSecond.putExtra("i",i);
                    i=1;
                    extracted(i,numeroPreg, pregunta, ecuacion, primerares, segundares);
                    startActivity(irSecond);

                }else if (segundares.isChecked()==true){
                    bien= false;
                    irSecond.putExtra("bien",bien);
                    irSecond.putExtra("i",i);
                    startActivity(irSecond);
                }else if (!primerares.isChecked()==true && !segundares.isChecked()==true){
                    Toast.makeText(this, "No has marcdo ningun campo",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void extracted(int i,TextView numeroPreg, TextView pregunta, TextView ecuacion, RadioButton primerares, RadioButton segundares) {
        if (i==0||i == 1)
        {

            numeroPreg.setText(i+getString(R.string.NumeroPregunta));
            pregunta.setText(R.string.Pregunta);
            ecuacion.setText(R.string.Ecuacion1);
            primerares.setText(R.string.Res1de1);
            segundares.setText(R.string.Res2de1);

        }
        else if (i == 2)
        {

            numeroPreg.setText(i+getString(R.string.NumeroPregunta));
            pregunta.setText(R.string.Pregunta);
            ecuacion.setText(R.string.Ecuacion2);
            primerares.setText(R.string.Res1de2);
            segundares.setText(R.string.Res2de2);

        }
        else if (i == 3)
        {

            numeroPreg.setText(i+getString(R.string.NumeroPregunta));
            pregunta.setText(R.string.Pregunta);
            ecuacion.setText(R.string.Ecuacion3);
            primerares.setText(R.string.Res1de3);
            segundares.setText(R.string.Res2de3);

        }
    }
}