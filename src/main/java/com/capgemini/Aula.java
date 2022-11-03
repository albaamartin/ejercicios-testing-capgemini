package com.capgemini;

public class Aula extends Sala{

    private String profesorAsignado;

    public Aula() {
        this.profesorAsignado = "";
    }

    public Aula(String dimension, boolean aireAcondicionado, String profesorAsignado) {
        super(dimension, aireAcondicionado);
        this.profesorAsignado = profesorAsignado;
    }

    public String getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(String profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    @Override
    public String toString() {
        return "profesorAsignado= " + profesorAsignado +", "+ super.toString();
    }
}
