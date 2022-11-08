package com.capgemini.integracionMockito;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private Modelo modelo;
    private ArrayList<String> datos;

    public Controlador() {
        modelo = new Modelo();
        datos = new ArrayList<String>();

    }

    public void Lista(){
        datos = modelo.Lista();
        //processData();
        for(String dato: datos){
            System.out.println(dato);
        }

    }
    /*
    //Esto se hace para añadir el 1
    public void processData(){
        int cont=0;
        for(String dato: datos){
            datos.set(cont, dato + "1");
            cont++;
        }
    }
    */

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }
}
