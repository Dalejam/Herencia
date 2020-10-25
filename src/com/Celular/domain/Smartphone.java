package com.Celular.domain;

public class Smartphone extends Celular{
    private String sistemaOperativo;
    private double memoriaRam;
    private String tipoTatil;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public String getTipoTatil() {
        return tipoTatil;
    }
    public void tomarFoto(){
        System.out.println("foto guardada");
    }
    public void reproducirListaMusica(){
        System.out.println("La cansion es: ");
    }
}
