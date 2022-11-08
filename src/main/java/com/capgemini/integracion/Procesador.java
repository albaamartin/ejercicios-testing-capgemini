package com.capgemini.integracion;


public class Procesador {

    private String comando;

    private Proceso proceso;

    public Procesador() {
        this.comando = "";
        proceso = new Proceso();
    }

    public Procesador(String comando, Proceso proceso) {
        this.comando = comando;
        this.proceso = proceso;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public void llamaProceso(){
        this.comando = proceso.getNombre() + "-i";
    }
    @Override
    public String toString() {
        return "Procesador{" +
                "comando='" + comando + '\'' +
                ", proceso=" + proceso +
                '}';
    }
}
