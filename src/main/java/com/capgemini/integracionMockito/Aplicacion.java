package com.capgemini.integracionMockito;

public class Aplicacion {

    Controlador controlador;

    public Aplicacion() {
        controlador = new Controlador();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void main(){
        controlador.Lista();
    }
}
