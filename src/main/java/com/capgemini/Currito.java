package com.capgemini;

public class Currito extends Empleado{

    public String proyecto;

    public Currito(){
        super();
        this.proyecto = "";
    }

    public Currito(String nombre, String apellidos, String dni, String tlf, Double sueldo, String cargo, String proyecto) {
        super(nombre, apellidos, dni, tlf, sueldo, cargo);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
