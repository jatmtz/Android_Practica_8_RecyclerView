package com.example.android_practica_8_recyclerview;

import java.io.Serializable;

public class ListElement implements Serializable {

    public String marca;
    public String modelo;
    public String color;


    public ListElement(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
