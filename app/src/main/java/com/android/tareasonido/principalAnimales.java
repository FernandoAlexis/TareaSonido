package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class principalAnimales extends AppCompatActivity implements View.OnClickListener {
    private CardView leon,gato,zorro,araña;
    private MediaPlayer leonSonido,gatoSonido,zorroSonido,arañaSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_animales);

        leonSonido = MediaPlayer.create(principalAnimales.this,R.raw.lion);
        gatoSonido = MediaPlayer.create(principalAnimales.this,R.raw.cat);
        zorroSonido = MediaPlayer.create(principalAnimales.this,R.raw.fox);
        arañaSonido = MediaPlayer.create(principalAnimales.this,R.raw.spider);

        leon =findViewById(R.id.leon);
        gato = findViewById(R.id.gato);
        zorro = findViewById(R.id.zorro);
        araña = findViewById(R.id.araña);

        leon.setOnClickListener(this);
        gato.setOnClickListener(this);
        zorro.setOnClickListener(this);
        araña.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.leon:
                leonSonido.start();
                break;
            case R.id.gato:
                gatoSonido.start();
                break;
            case R.id.zorro:
                zorroSonido.start();
                break;
            case R.id.araña:
                arañaSonido.start();
                break;

        }
    }
}