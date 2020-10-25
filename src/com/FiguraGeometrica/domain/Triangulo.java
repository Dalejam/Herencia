package com.FiguraGeometrica.domain;

public class Triangulo extends FiguraGeometrica{
    private double tamanioLado;
    private double angulo;
    private double altura;

    public double getTamanioLado() {
        return tamanioLado;
    }

    public void setTamanioLado(double tamanioLado) {
        this.tamanioLado = tamanioLado;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
