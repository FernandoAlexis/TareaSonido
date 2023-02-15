package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principalColores extends AppCompatActivity implements View.OnClickListener {

    private CardView español,ingles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_colores);

        español = findViewById(R.id.coloresEspañol);
        ingles = findViewById(R.id.coloresIngles);

        español.setOnClickListener(this);
        ingles.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){
            case R.id.coloresEspañol:i= new Intent(this,coloresEspaniol.class);
                startActivity(i);
                break;

            case R.id.coloresIngles:i= new Intent(this,coloresIngles.class);
                startActivity(i);
                break;

        }

    }
}