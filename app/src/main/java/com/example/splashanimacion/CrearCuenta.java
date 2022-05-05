package com.example.splashanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CrearCuenta extends AppCompatActivity {

    Button unirse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        unirse = findViewById(R.id.unirse);



    }

    public void unirse(View view) {
        Intent intent = new Intent(CrearCuenta.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}