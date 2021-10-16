package com.cesar.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView welcome = findViewById(R.id.twBienvenido);
        String email;
        Bundle extras = getIntent().getExtras();
        welcome.setText("Bienvenido "+extras.getString("email"));

    }
}