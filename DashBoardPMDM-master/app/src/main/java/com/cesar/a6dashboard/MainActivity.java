package com.cesar.a6dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.cesar.a6dashboard.activities.Amigos_Activity;
import com.cesar.a6dashboard.activities.Calculadora_Activity;
import com.cesar.a6dashboard.activities.EdadCanina_Activity;
import com.cesar.a6dashboard.activities.Galaria_Activity;
import com.cesar.a6dashboard.activities.Mapas_Activity;
import com.cesar.a6dashboard.activities.Quizzes_Activity;
import com.cesar.a6dashboard.activities.Restaurantes_Activity;
import com.cesar.a6dashboard.activities.Settings_Activity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_calculadora,rellay_amigos,rellay_perrete,rellay_quizzes,rellay_galeria,rellay_mapas,rellay_restaurante,rellay_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rellay_calculadora= findViewById(R.id.rellay_calculadora);
        rellay_amigos= findViewById(R.id.rellay_friends);
        rellay_perrete= findViewById(R.id.rellay_perrete);
        rellay_quizzes= findViewById(R.id.rellay_quizzes);
        rellay_galeria= findViewById(R.id.rellay_galeri);
        rellay_mapas= findViewById(R.id.rellay_mapas);
        rellay_restaurante= findViewById(R.id.rellay_restaurantes);
        rellay_settings= findViewById(R.id.rellay_Herramientas);

        rellay_calculadora.setOnClickListener(view -> {
            Intent inten= new Intent(this, Calculadora_Activity.class);
            startActivity(inten);
        });
        rellay_amigos.setOnClickListener(view -> {
            Intent inten= new Intent(this, Amigos_Activity.class);
            startActivity(inten);
        });
        rellay_perrete.setOnClickListener(view -> {
            Intent inten= new Intent(this, EdadCanina_Activity.class);
            startActivity(inten);
        });
        rellay_quizzes.setOnClickListener(view -> {
            Intent inten= new Intent(this, Quizzes_Activity.class);
            startActivity(inten);
        });
        rellay_galeria.setOnClickListener(view -> {
            Intent inten= new Intent(this, Galaria_Activity.class);
            startActivity(inten);
        });
        rellay_mapas.setOnClickListener(view -> {
            Intent inten= new Intent(this, Mapas_Activity.class);
            startActivity(inten);
        });
        rellay_restaurante.setOnClickListener(view -> {
            Intent inten= new Intent(this, Restaurantes_Activity.class);
            startActivity(inten);
        });
        rellay_settings.setOnClickListener(view -> {
            Intent inten= new Intent(this, Settings_Activity.class);
            startActivity(inten);
        });

    }
}