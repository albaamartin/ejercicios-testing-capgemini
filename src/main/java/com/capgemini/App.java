package com.capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola Mundo!" );
        Cliente cliente = new Cliente();
        System.out.println(cliente.edad);
        cliente.edad=2;
        System.out.println(cliente.edad);

        Cliente cliente1 = new Cliente("Alba", "Málaga", 26);
        System.out.println(cliente.edad);
        System.out.println(cliente.toString());

        Perro toby = new Perro();
        System.out.println(toby.raza);
        toby.raza = "Terrier";
        System.out.println(toby.raza);

        Perro otto = new Perro();
        otto.raza = "Pastor Alemán";
        System.out.println(otto.raza);


        Perro fluky = new Perro("Pastor de aguas");

        System.out.println(fluky.getRaza());
        fluky.setRaza("Labrador");
        System.out.println(fluky.getRaza());

        Integer resultado = Calculadora.suma(1,2);
        System.out.println(resultado);
        resultado=Calculadora.multi(1,2);
        System.out.println(resultado);
        resultado = Calculadora.divi(1,2);
        System.out.print(resultado);

        Float r = Calcu.suma(2.5F, 2.5F);
        System.out.println(r);
        r = Calcu.resta(2.5F, 2.5F);
        System.out.println(r);
        r = Calcu.multi(2.5F, 2.5F);
        System.out.println(r);
        r = Calcu.divi(2.5F,2.5F);
        System.out.println(r);

        Persona p = new Persona();
        p=new Persona("Ana","Domenech");
        System.out.println(p.getNombre());
        System.out.println(p.getApellidos());
        Profe pf = new Profe();
        pf =new Profe("David", "Vaquero", "Testing");
        System.out.println(pf.getNombre());
        System.out.println(pf.getApellidos());
        System.out.println(pf.getAsignatura());
    }
}
