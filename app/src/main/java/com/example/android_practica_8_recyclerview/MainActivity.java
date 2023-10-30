package com.example.android_practica_8_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){

        elements = new ArrayList<>();
        elements.add(new ListElement("Suzuki", "  Swift", "#6750A4"));
        elements.add(new ListElement("Renault", "Duster", "#21005D"));
        elements.add(new ListElement("Kia", "Picanto", "#31111D"));
        elements.add(new ListElement("Suzuki", "  Swift", "#6750A4"));
        elements.add(new ListElement("Renault", "Duster", "#21005D"));
        elements.add(new ListElement("Kia", "Picanto", "#31111D"));
        elements.add(new ListElement("Suzuki", "  Swift", "#6750A4"));
        elements.add(new ListElement("Renault", "Duster", "#21005D"));
        elements.add(new ListElement("Kia", "Picanto", "#31111D"));


        CarroAdapter CarroAdapter= new CarroAdapter(elements,this, new CarroAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {
                moveToDescription(item);
            }

        });
        RecyclerView rc = findViewById(R.id.rvCarros);
        rc.setAdapter(CarroAdapter);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }

        private void moveToDescription(ListElement item) {
        Intent intent = new Intent(this, Descripcion.class);
        intent.putExtra("ListElement", item);
        startActivity(intent);
        }
}