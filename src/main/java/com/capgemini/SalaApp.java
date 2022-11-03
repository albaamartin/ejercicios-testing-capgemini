package com.capgemini;

public class SalaApp {

    public static void main(String[] args){

        Sala s = new Sala();
        s.setDimension("14m2");
        s.setAireAcondicionado(false);
        Sala s1 = new Sala("18m2", true);
        System.out.println("Sala 1 ( "+ s+" )");
        System.out.println("Sala 2 ( "+ s1+" )");
        Aula a = new Aula("10m2", true, "Javier");
        System.out.println("Aula ( "+ a+ " )");

    }
}
