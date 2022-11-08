package com.capgemini.integracion;

public class Proceso {

    private String nombre;

    public Proceso() {
        this.nombre = "";
    }

    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "proceso{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
