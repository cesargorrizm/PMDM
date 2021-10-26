package com.cesar.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cesar.a6dashboard.R;

public class EdadCanina_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad_canina);

        //1- Agregamos los ids a los elementos
        EditText edadEdit = findViewById(R.id.edad_et);
        TextView resultadosText = findViewById(R.id.resultado_tv);
        Button boton = findViewById(R.id.button_btn);
        //Log.v("MainActivity", "La actividad se ha creado");
        //Log.i("MainActivity", "La actividad se ha creado");
        //Log.w("MainActivity", "La actividad se ha creado");
        //Log.e("MainActivity", "La actividad se ha creado");
        Log.d("MainActivity", "La actividad se ha creado");

        //2- Darle actividad al boton que pulsamos
        boton. setOnClickListener(view -> {
            //3- recogemos el texto en el EditText
            String edad = edadEdit.getText().toString();
            if (!edad.isEmpty()){
                //4- Lo comvertimos a entero
                int edadInt = Integer.parseInt(edad);
                //5-Claculamos la edad canina
                int res = edadInt * 7 ;
                //6 - Creamos el texto que vamos a mostrar
                String resString = getString(R.string.TextoResultado,res);
                resultadosText.setText(resString);
            }else {
                Log.d("MainActivity","Has introducido un campo vacio");
                Toast.makeText(this,"No has introducido ningun numero.",Toast.LENGTH_LONG).show();
            }

        });
    }
}