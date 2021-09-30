package com.cesar.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1- Agregamos los ids a los elementos
        EditText Primernum =findViewById(R.id.PrimerNum);
        EditText Segunnum = findViewById(R.id.SegundoNum);
        TextView resultado = findViewById(R.id.Resultado);
        Button sumar = findViewById(R.id.btnSumar);
        Button restar= findViewById(R.id.btnRestar);
        Button multiplicar= findViewById(R.id.btnMultiplicar);
        Button dividir= findViewById(R.id.btnDividir);
        //programamos los botones



    sumar.setOnClickListener(view -> {
        String primero = Primernum.getText().toString();
        String segundo = Segunnum.getText().toString();
        if (!primero.isEmpty() && !segundo.isEmpty() ) {

            Double segundonum = Double.parseDouble(segundo);
            Double primernum = Double.parseDouble(primero);
            Double resul = primernum + segundonum;
            String rstFinal = getString(R.string.resul) + " " + resul;
            resultado.setText(rstFinal);
        }else {Toast.makeText(this,
                R.string.campoVacio,
                Toast.LENGTH_SHORT).show();             }
         });

        restar.setOnClickListener(view -> {
            String primero = Primernum.getText().toString();
            String segundo = Segunnum.getText().toString();
            if (!primero.isEmpty() && !segundo.isEmpty() ) {
            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
                double resul = primernum - segundonum;
                String rstFinal = getString(R.string.resul)+ " "+resul;
                resultado.setText(rstFinal);
            }else {Toast.makeText(this,
                    R.string.campoVacio,
                    Toast.LENGTH_SHORT).show();             }


        });
        multiplicar.setOnClickListener(view -> {
            String primero = Primernum.getText().toString();
            String segundo = Segunnum.getText().toString();
            if (!primero.isEmpty() && !segundo.isEmpty() ) {
            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
                Double resul=primernum * segundonum;
                String rstFinal = getString(R.string.resul)+ " "+resul;
                resultado.setText(rstFinal);
            }else {Toast.makeText(this,
                R.string.campoVacio,
                Toast.LENGTH_SHORT).show();             }
             });


        dividir.setOnClickListener(view -> {
            String primero = Primernum.getText().toString();
            String segundo = Segunnum.getText().toString();
            if (!primero.isEmpty() && !segundo.isEmpty() ) {
            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
                Double resul = primernum / segundonum;
                String rstFinal = getString(R.string.resul)+" "+ resul;
                resultado.setText(rstFinal);
            }else {Toast.makeText(this,
                    R.string.campoVacio,
                    Toast.LENGTH_SHORT).show();             }
             });

    }
}