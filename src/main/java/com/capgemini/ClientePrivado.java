package com.capgemini;

public class ClientePrivado {

    private String nombre;
    private String direccion;
    private Integer edad;

    public ClientePrivado(){
        this.nombre = "";
        this.direccion = "";
        this.edad = 0;
    }

    public ClientePrivado(String nombre, String direccion, Integer edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public Integer getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }



}
