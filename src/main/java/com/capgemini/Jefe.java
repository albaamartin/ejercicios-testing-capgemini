package com.capgemini;

public class Jefe extends Empleado{

    public String departamento;
    public Integer numEmpleados;

    public Jefe(){
        super();
        this.departamento = "";
        this.numEmpleados = 0;
    }

    public Jefe(String nombre, String apellidos, String dni, String tlf, Double sueldo, String cargo, String departamento, Integer numEmpleados) {
        super(nombre, apellidos, dni, tlf, sueldo, cargo);
        this.departamento = departamento;
        this.numEmpleados = numEmpleados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(Integer numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

}
