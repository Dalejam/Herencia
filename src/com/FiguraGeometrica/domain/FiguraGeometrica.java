package com.FiguraGeometrica.domain;

public class FiguraGeometrica {
    private String nombre;
    private String dimension;
    private double area;
    private double perimetro;

    public String getNombre() {
        return nombre;
    }

    public String getDimension() {
        return dimension;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
