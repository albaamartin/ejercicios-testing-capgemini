package com.capgemini;

public class Profe extends Persona {

    private String asignatura;

    Profe(){

        super();//llamo al constructor clase madre Persona(), estaría haciendo esto:
        //this.setNombre("");
        //this.setApellidos("");

        this.asignatura = "";
    }
    //Generate Constructor


    public Profe(String nombre, String apellidos, String dni, String tlf, String asignatura) {
        super(nombre, apellidos, dni, tlf);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {

        return asignatura;
    }

    public void setAsignatura(String asignatura) {

        this.asignatura = asignatura;
    }

}
