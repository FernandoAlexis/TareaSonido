package com.android.tareasonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numerosIngles extends AppCompatActivity {

    Button numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9,numero10;

    private MediaPlayer one,two,three,four,five,six,seven,eight,nine,ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_ingles);
        one = MediaPlayer.create(numerosIngles.this,R.raw.one);
        two = MediaPlayer.create(numerosIngles.this,R.raw.two);
        three = MediaPlayer.create(numerosIngles.this,R.raw.three);
        four = MediaPlayer.create(numerosIngles.this,R.raw.four);
        five = MediaPlayer.create(numerosIngles.this,R.raw.five);
        six = MediaPlayer.create(numerosIngles.this,R.raw.six);
        seven = MediaPlayer.create(numerosIngles.this,R.raw.seven);
        eight = MediaPlayer.create(numerosIngles.this,R.raw.eight);
        nine = MediaPlayer.create(numerosIngles.this,R.raw.nine);
        ten = MediaPlayer.create(numerosIngles.this,R.raw.ten);

        numero1 = (Button) findViewById(R.id.num1);
        numero2 = (Button) findViewById(R.id.num2);
        numero3 = (Button) findViewById(R.id.num3);
        numero4 = (Button) findViewById(R.id.num4);
        numero5 = (Button) findViewById(R.id.num5);
        numero6 = (Button) findViewById(R.id.num6);
        numero7 = (Button) findViewById(R.id.num7);
        numero8 = (Button) findViewById(R.id.num8);
        numero9 = (Button) findViewById(R.id.num9);
        numero10 = (Button) findViewById(R.id.num10);

        botonSonido();
    }

    void botonSonido() {
        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.start();
            }
        });
        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two.start();
            }
        });
        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three.start();
            }
        });
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four.start();
            }
        });
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five.start();
            }
        });
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six.start();
            }
        });
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven.start();
            }
        });
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight.start();
            }
        });

        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine.start();
            }
        });
        numero10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten.start();
            }
        });

    }
}