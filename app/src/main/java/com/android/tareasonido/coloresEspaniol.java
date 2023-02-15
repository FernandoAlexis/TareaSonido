package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coloresEspaniol extends AppCompatActivity {


    private Button Bamarillo,Bazul,Bblanco,Bgris,Bmarron,Bnaranja,Bnegro,Bverde,Brosa,Bvioleta;

    private MediaPlayer Samarillo,Sazul,Sblanco,Sgris,Smarron,Snaranja,Snegro,Sverde,Srosa,Svioleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_espaniol);

        Samarillo = MediaPlayer.create(coloresEspaniol.this,R.raw.amarillo);
        Sazul = MediaPlayer.create(coloresEspaniol.this,R.raw.azul);
        Sblanco = MediaPlayer.create(coloresEspaniol.this,R.raw.blanco);
        Sgris = MediaPlayer.create(coloresEspaniol.this,R.raw.gris);
        Smarron = MediaPlayer.create(coloresEspaniol.this,R.raw.marron);
        Snaranja = MediaPlayer.create(coloresEspaniol.this,R.raw.naranja);
        Snegro = MediaPlayer.create(coloresEspaniol.this,R.raw.negro);
        Sverde = MediaPlayer.create(coloresEspaniol.this,R.raw.verde);
        Srosa = MediaPlayer.create(coloresEspaniol.this,R.raw.rosa);
        Svioleta = MediaPlayer.create(coloresEspaniol.this,R.raw.violeta);


        Bamarillo= (Button) findViewById(R.id.btnAmarillo);
        Bazul = (Button) findViewById(R.id.btnAzul);
        Bblanco = (Button) findViewById(R.id.btnBlanco);
        Bgris = (Button) findViewById(R.id.btnGris);
        Bmarron = (Button) findViewById(R.id.btnMarron);
        Bnaranja = (Button) findViewById(R.id.btnNaranja);
        Bnegro = (Button) findViewById(R.id.btnNegro);
        Bverde = (Button) findViewById(R.id.btnVerde);
        Brosa = (Button) findViewById(R.id.btnRosa);
        Bvioleta = (Button) findViewById(R.id.btnVioleta);
        botonSonido();

    }

    void botonSonido() {
        Bamarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Samarillo.start();
            }
        });
        Bazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sazul.start();
            }
        });
        Bblanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sblanco.start();
            }
        });
        Bgris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sgris.start();
            }
        });
        Bmarron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Smarron.start();
            }
        });
        Bnaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snaranja.start();
            }
        });
        Bnegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snegro.start();
            }
        });
        Bverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sverde.start();
            }
        });

        Brosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Srosa.start();
            }
        });
        Bvioleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Svioleta.start();
            }
        });

    }
}