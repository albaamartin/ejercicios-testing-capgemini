package com.capgemini;

public class Empleado extends Persona{

    public Double sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.sueldo = 0.0;
        this.cargo = "";
    }

    public Empleado(String nombre, String apellidos, String dni, String tlf, Double sueldo, String cargo) {
        super(nombre, apellidos, dni, tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }


    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }
}
