package com.cesar.a3_variosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener {
    Button IraLaPrimera ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        IraLaPrimera = findViewById(R.id.btn2);

        IraLaPrimera.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent aLaSegunda = new Intent(SegundaActivity.this,MainActivity.class);
        startActivity(aLaSegunda);
    }
}