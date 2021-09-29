package com.cesar.practica1;

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
        EditText pripernum =findViewById(R.id.PrimerNum);
        EditText segunnum = findViewById(R.id.SegundoNum);
        TextView resultado = findViewById(R.id.Resultado);
        Button sumar = findViewById(R.id.btnSumar);
        Button restar= findViewById(R.id.btnRestar);
        Button multiplicar= findViewById(R.id.btnMultiplicar);
        Button dividir= findViewById(R.id.btnDividir);
        //programamos los botones

        String primero = pripernum.getText().toString();
        Double primernum =Double.parseDouble(primero);

        String segundo = segunnum.getText().toString();
        Double segundonum = Double.parseDouble(segundo);

        sumar.setOnClickListener(view -> {
            if (pripernum != null && segunnum!= null){

                Double resul = primernum +segundonum;
                String rstFinal = "El resultado es : "+ resul;
                resultado.setText(rstFinal);
            }


        });
        restar.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {

                double resul = primernum - segundonum;
                String rstFinal = "El resultado es : "+ resul;
                resultado.setText(rstFinal);
            }
        });
        multiplicar.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {

                Double resul=primernum * segundonum;
                String rstFinal = "El resultado es : "+ resul;
                resultado.setText(rstFinal);
            }
        });
        dividir.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {

                Double resul = primernum / segundonum;
                String rstFinal = "El resultado es : "+ resul;
                resultado.setText(rstFinal);
            }
        });
    }
}