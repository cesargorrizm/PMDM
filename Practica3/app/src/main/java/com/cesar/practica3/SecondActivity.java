package com.cesar.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txtoPrincipal = findViewById(R.id.twTextoPrincipal);
        Button boton = findViewById(R.id.btnSig);
        Bundle extras = getIntent().getExtras();
        boolean bien = extras.getBoolean("bien");
        int i = extras.getInt("i");
        Intent pan1 = new Intent(this,MainActivity.class);
        if (i== 1&&bien==true){
            txtoPrincipal.setText(R.string.Corrcta);
            boton.setText(R.string.siguientePreg);

        }else if (i == 1 && bien== false){
            txtoPrincipal.setText(R.string.Incorrecto);
            boton.setText(R.string.btnVolveraIntentar);
        }else if (i== 2&&bien==true){
            txtoPrincipal.setText(R.string.Corrcta);
            boton.setText(R.string.siguientePreg);

        }else if (i == 2 && bien== false){
            txtoPrincipal.setText(R.string.Incorrecto);
            boton.setText(R.string.btnVolveraIntentar);
        }else if (i== 3&&bien==true){
            txtoPrincipal.setText(R.string.TetoFinal);
            boton.setText(R.string.btnVolveraEmpezar);

        }else if (i == 3 && bien== false){
            txtoPrincipal.setText(R.string.Incorrecto);
            boton.setText(R.string.btnVolveraIntentar);
        }


        boton.setOnClickListener(view -> {
            finish();
        });



    }
}