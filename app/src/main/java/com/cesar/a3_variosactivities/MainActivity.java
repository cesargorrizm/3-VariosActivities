package com.cesar.a3_variosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity   {

    Button btnIrAc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrAc2= findViewById(R.id.btn1);

        btnIrAc2.setOnClickListener(view -> {
            //para cambiar de activity lo primero que haremos
            //será crear un Intent
            //1- Le diremos en el primer campo desde donde le llamos y en el segundo a donde queremos ir
            Intent iraActivity2 = new Intent(MainActivity.this,SegundaActivity.class);
            //2- Lanzamos el activity cpn el metodo startActivity
            startActivity(iraActivity2);
        });
    }




}