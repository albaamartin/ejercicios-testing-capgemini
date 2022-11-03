package com.capgemini;

public class Perro {

    public String raza;

    Perro(){
        this.raza = "";
    }

    Perro(String raza){
        this.raza = raza;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }
}
