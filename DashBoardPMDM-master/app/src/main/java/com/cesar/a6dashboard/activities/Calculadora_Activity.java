package com.cesar.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cesar.a6dashboard.R;

public class Calculadora_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        getSupportActionBar().hide();
    }
}