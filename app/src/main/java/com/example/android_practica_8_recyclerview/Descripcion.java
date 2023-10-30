package com.example.android_practica_8_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Descripcion extends AppCompatActivity {

    TextView modelo, marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");

        modelo = findViewById(R.id.modelo);
        marca = findViewById(R.id.marca);


        marca.setText(element.getMarca());
        marca.setTextColor(Color.parseColor(element.getColor()));

        modelo.setText(element.getModelo());

    }
}