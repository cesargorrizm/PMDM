package com.cesar.practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvMensajefinal = findViewById(R.id.tvMensajeFinal);
        Button btnewPartido = findViewById(R.id.btnNewGame);
        Bundle extras = getIntent().getExtras();

         int iLocal = extras.getInt("iLocal");
         int iVis = extras.getInt("iVis");
         btnewPartido.setOnClickListener(view -> {
             finish();
         });
         if (iLocal > iVis){
             tvMensajefinal.setText("¡Ganó el equipo local!");
         }else if (iVis> iLocal){
             tvMensajefinal.setText("¡Ganaron los visitantes!");
         }else if (iLocal==iVis){
             tvMensajefinal.setText("Fue un empate");
         }

    }
}