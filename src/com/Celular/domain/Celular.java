package com.Celular.domain;

public class Celular {
    private String codSerie;
    private String marca;
    private String color;
    private double tamanio;

    public String getCodSerie() {
        return codSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getTamanio() {
        return tamanio;
    }
    public void llamar(){
        System.out.println("se esta llamando");
    }
    public boolean contestar(short opcion){
        if(opcion ==1){
            return true;
        }else {
         return false;
        }
    }
    public boolean apagar(short opcion){
        if(opcion==1){
            return true;
        }
        else {
            return false;
        }
    }
}
