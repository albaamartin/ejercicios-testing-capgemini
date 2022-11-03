package com.capgemini;

public class Cliente {

    public String nombre;
    public String direccion;
    public Integer edad;

    //Constuctor sin parametros
    Cliente(){
        this.nombre = "";
        this.direccion = "";
        this.edad = 0;
    }
    //Constructor con parametros
    Cliente(String nombre, String direccion,Integer edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    //Intentar devolver una cadena de caracteres
    public String toString(){
        return "Cliente[nombre: "
                + this.nombre
                + ", direccion: "
                +this.direccion
                + ", edad: "
                +this.edad
                + "]";
    }
}
