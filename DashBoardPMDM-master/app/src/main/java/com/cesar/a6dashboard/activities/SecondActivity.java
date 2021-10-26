package com.cesar.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.cesar.a6dashboard.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txtoPrincipal = findViewById(R.id.twTextoPrincipal);
        Button boton = findViewById(R.id.btnSig);
        Bundle extras = getIntent().getExtras();
        //Recogemos lo que le pasamos del Bundle
        boolean bien = extras.getBoolean("bien");
        int i = extras.getInt("i");
        Intent pan1 = new Intent(this,Quizzes_Activity.class);
        //Y depende lo que le pasemos comprobamos si ha hacertado muestra que es correcta
        //si ha fallado muestra que es incorrecta
        //si es correcta y lleva 3 le mostramos que ha ganado
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