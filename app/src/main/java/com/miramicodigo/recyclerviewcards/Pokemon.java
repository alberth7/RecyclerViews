package com.miramicodigo.recyclerviewcards;

import java.io.Serializable;

public class Pokemon {
 private String nombre;
 private String tipo;
 private int imagen;

    public Pokemon(String nombre, String tipo, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = imagen;
    }


    public Pokemon() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

