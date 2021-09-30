package com.cesar.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1- Agregamos los ids a los elementos
        TextView Primernum =findViewById(R.id.PrimerNum);
        EditText Segunnum = findViewById(R.id.SegundoNum);
        TextView resultado = findViewById(R.id.Resultado);
        Button sumar = findViewById(R.id.btnSumar);
        Button restar= findViewById(R.id.btnRestar);
        Button multiplicar= findViewById(R.id.btnMultiplicar);
        Button dividir= findViewById(R.id.btnDividir);
        //programamos los botones

        String primero = Primernum.getText().toString();


        String segundo = Segunnum.getText().toString();

        sumar.setOnClickListener(view -> {
            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
            Double resul = primernum + segundonum;
            String rstFinal = "El resultado es : "+ resul.toString();
            resultado.setText(rstFinal);
        });

        restar.setOnClickListener(view -> {

            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
            double resul = primernum - segundonum;
            String rstFinal = "El resultado es : "+ resul;
            resultado.setText(rstFinal);

        });
        multiplicar.setOnClickListener(view -> {

            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
            Double resul=primernum * segundonum;
            String rstFinal = "El resultado es : "+ resul;
            resultado.setText(rstFinal);

        });
        dividir.setOnClickListener(view -> {

            Double segundonum = Double.parseDouble(segundo);
            Double primernum =Double.parseDouble(primero);
            Double resul = primernum / segundonum;
            String rstFinal = "El resultado es : "+ resul;
            resultado.setText(rstFinal);

        });
    }
}