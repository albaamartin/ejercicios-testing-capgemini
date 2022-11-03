package com.capgemini;

public class Sala {

    private String dimension;
    private boolean aireAcondicionado;

    public Sala() {
        this.dimension = "";
        this.aireAcondicionado = true;
    }

    public Sala(String dimension, boolean aireAcondicionado) {
        this.dimension = dimension;
        this.aireAcondicionado = aireAcondicionado;
    }

    public String toString() {
        if(aireAcondicionado) {
            return "dimension= " + dimension +
                    ", con aire acondicionado";
        }
        else{
            return "dimension= " + dimension +
                    ", sin aire acondicionado";
        }
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
