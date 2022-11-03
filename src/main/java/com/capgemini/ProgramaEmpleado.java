package com.capgemini;

public class ProgramaEmpleado {

    public static void main(String[] args){

        Empleado e =new Empleado();
        e = new Empleado("Ana","Domenech","25763894Q","673896524", 1500.50, "Tester");
        System.out.println(e.getNombre());
        System.out.println(e.getApellidos());
        System.out.println(e.getDni());
        System.out.println(e.getTlf());
        System.out.println(e.getSueldo());
        System.out.println(e.getCargo());
        e.setNombre("Lucia");
        e.setApellidos("Martin");
        e.setDni("76589034F");
        e.setTlf("665789345");
        e.setSueldo(1350.70);
        e.setCargo("Desarrollador");
        System.out.println(e.getNombre());
        System.out.println(e.getApellidos());
        System.out.println(e.getDni());
        System.out.println(e.getTlf());
        System.out.println(e.getSueldo());
        System.out.println(e.getCargo());
        Jefe j = new Jefe();
        j = new Jefe("Juan","Jerez","24367890G","678335566",2300.75, "Tester","Testing", 25);
        System.out.println(j.getNombre());
        System.out.println(j.getApellidos());
        System.out.println(j.getDni());
        System.out.println(j.getTlf());
        System.out.println(j.getSueldo());
        System.out.println(j.getCargo());
        System.out.println(j.getDepartamento());
        System.out.println(j.getNumEmpleados());
        System.out.println(e.toString());
        System.out.println(j.toString());


    }
}
