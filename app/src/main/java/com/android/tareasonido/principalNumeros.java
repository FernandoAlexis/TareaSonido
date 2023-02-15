package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principalNumeros extends AppCompatActivity implements View.OnClickListener {

    private CardView español,ingles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_numeros);

        español = findViewById(R.id.numerosEspañol);
        ingles = findViewById(R.id.numerosIngles);

        español.setOnClickListener(this);
        ingles.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.numerosEspañol:i= new Intent(this,numerosEspaniol.class);
                startActivity(i);
                break;

            case R.id.numerosIngles:i= new Intent(this,numerosIngles.class);
                startActivity(i);
                break;


        }
    }
}