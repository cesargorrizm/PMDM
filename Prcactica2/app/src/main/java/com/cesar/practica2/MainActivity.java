package com.cesar.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.edCorreo);
        EditText contraseña = findViewById(R.id.edContraseña);
        Button btn = findViewById(R.id.btnEnviar);

        btn.setOnClickListener(view -> {
            String Email = email.getText().toString();
            String Contraseña = contraseña.getText().toString();
            if (!Email.isEmpty() && !Contraseña.isEmpty()){
                Intent irSecond = new Intent(this,SecondActivity.class);

                irSecond.putExtra("email", Email);

                startActivity(irSecond);
            }else {
                Toast.makeText(this,
                       "Falta por introducir alguno de los campos",
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}