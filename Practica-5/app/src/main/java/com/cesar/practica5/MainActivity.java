package com.cesar.practica5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int iLocal =0;
private  int iVis = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //Recogemos los elementos
        TextView PuntosLocal = findViewById(R.id.tvLocalRes);
        Button btnRestarLocal = findViewById(R.id.btnLocalRestar);
        Button btnSumarUnoLocal = findViewById(R.id.btnMas1Local);
        Button btnSumarDosLocal = findViewById(R.id.btnMas2Local);
        Button btnSumarTresLocal = findViewById(R.id.btnMas3Local);
        TextView PuntosVis = findViewById(R.id.tvPuntosVis);
        Button btnRestarVis = findViewById(R.id.btnVisRestar);
        Button btnSumarUnoVis = findViewById(R.id.btnMas1Vis);
        Button btnSumarDosVis = findViewById(R.id.btnMas2Vis);
        Button btnSumarTresVis= findViewById(R.id.btnMas3Vis);
        Button btnRestablecer= findViewById(R.id.btnRestablecerMarcador);
        Button btnResultadoFinal = findViewById(R.id.btnRsulFinal);

        btnRestarLocal.setOnClickListener(view -> {
                    if (iLocal >0) {
                        iLocal --;
                        String a = String.valueOf(iLocal);
                        PuntosLocal.setText(a);
                    }else {
                        Toast.makeText(this ,"No se puede restar al cero",Toast.LENGTH_SHORT).show();
                    }

        });
        btnSumarUnoLocal.setOnClickListener(view -> {
            iLocal=iLocal+1;
            String a = String.valueOf(iLocal);
            PuntosLocal.setText(a);
        });
        btnSumarDosLocal.setOnClickListener(view -> {
            iLocal=iLocal+2;
            String a = String.valueOf(iLocal);
            PuntosLocal.setText(a);
        });
        btnSumarTresLocal.setOnClickListener(view -> {
            iLocal=iLocal+3;
            String a = String.valueOf(iLocal);
            PuntosLocal.setText(a);
            Toast.makeText(this ,"Triplazo",Toast.LENGTH_SHORT).show();
        });
        btnRestablecer.setOnClickListener(view -> {
            iLocal=0;
            String a = String.valueOf(iLocal);
            iVis =0 ;
            String aV= String.valueOf(iVis);
            PuntosLocal.setText(a);
            PuntosVis.setText(aV);
        });
        btnRestarVis.setOnClickListener(view -> {
            if (iVis >0) {
                iVis --;
                String a = String.valueOf(iVis);
                PuntosVis.setText(a);
            }else {
                Toast.makeText(this ,"No se puede restar al cero",Toast.LENGTH_SHORT).show();
            }
        });
        btnSumarUnoVis.setOnClickListener(view -> {
            iVis=iVis+1;
            String a = String.valueOf(iVis);
            PuntosVis.setText(a);
        });
        btnSumarDosVis.setOnClickListener(view -> {
            iVis=iVis+2;
            String a = String.valueOf(iVis);
            PuntosVis.setText(a);
        });
        btnSumarTresVis.setOnClickListener(View ->{
            iVis=iVis+3;
            String a = String.valueOf(iVis);
            PuntosVis.setText(a);
            Toast.makeText(this ,"Triplazo",Toast.LENGTH_SHORT).show();
        });

    }
}