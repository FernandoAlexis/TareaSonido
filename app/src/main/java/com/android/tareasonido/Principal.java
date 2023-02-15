package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kotlin.reflect.KFunction;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    private CardView numeros,colores,animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros=findViewById(R.id.numeros);
        colores = findViewById(R.id.colores);
        animales = findViewById(R.id.animales);
        numeros.setOnClickListener(this);
        colores.setOnClickListener(this);
        animales.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.numeros:i= new Intent(this,principalNumeros.class);
            startActivity(i);
            break;

            case R.id.colores:i= new Intent(this,principalColores.class);
            startActivity(i);
            break;

            case R.id.animales:i= new Intent(this,principalAnimales.class);
            startActivity(i);
        }

    }
}