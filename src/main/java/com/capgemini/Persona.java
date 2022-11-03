package com.capgemini;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String tlf;

    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.tlf = "";
    }

    public Persona(String nombre, String apellidos, String dni, String tlf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tlf = tlf;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }
}
