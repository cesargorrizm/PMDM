package com.cesar.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1- Agregamos los ids a los elementos
        EditText pripernum =findViewById(R.id.EdPrimerNum);
        EditText segunnum = findViewById(R.id.EdSegundoNum);
        EditText resultado = findViewById(R.id.Resultado);
        Button sumar = findViewById(R.id.btnSumar);
        Button restar= findViewById(R.id.btnRestar);
        Button multiplicar= findViewById(R.id.btnMultiplicar);
        Button dividir= findViewById(R.id.btnDividir);
        //programamos los botones


        sumar.setOnClickListener(view -> {
            if (pripernum != null && segunnum!= null){
                String primero = pripernum.getText().toString();
                int primernum = Integer.parseInt(primero);
                String segundo = segunnum.getText().toString();
                int segundonum = Integer.parseInt(segundo);
                int resul = primernum +segundonum;
                resultado.setText(resul);
            }


        });
        restar.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {
                String primero = pripernum.getText().toString();
                int primernum = Integer.parseInt(primero);
                String segundo = segunnum.getText().toString();
                int segundonum = Integer.parseInt(segundo);
                int resul = primernum - segundonum;
                resultado.setText(resul);
            }
        });
        multiplicar.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {
                String primero = pripernum.getText().toString();
                int primernum = Integer.parseInt(primero);
                String segundo = segunnum.getText().toString();
                int segundonum = Integer.parseInt(segundo);
                int resul = primernum * segundonum;
                resultado.setText(resul);
            }
        });
        restar.setOnClickListener(view -> {
            if (pripernum != null && segunnum != null) {
                String primero = pripernum.getText().toString();
                Double primernum =Double.parseDouble(primero);
                String segundo = segunnum.getText().toString();
                Double segundonum = Double.parseDouble(segundo);
                Double result = primernum / segundonum;
                resultado.setText(result.toString());
            }
        });
    }
}