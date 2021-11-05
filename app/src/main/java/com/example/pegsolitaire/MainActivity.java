package com.example.pegsolitaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //TODO : las bolas cambian de color al clicarlas y luego vuelvan a su color inicial
    //TODO : al mover la bola roja a una posicion negra , la posicion de la roja pasará a ser negra y la de la negra roja

    public void bolaClickada(View view){

        view.setBackground(getDrawable(R.drawable.bolaverde));
        //colorInicial(view);


    }

    /*public void colorInicial(View view){
        view.setBackground(getDrawable(R.drawable.bolaroja));
    }*/


}