package com.Persona.domain;

public class Profesor extends Persona{
    private String tituloProfecional;
    private String asignatura;
    private String horario;

    public String getTituloProfecional() {
        return tituloProfecional;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void dictarClase(){
        System.out.println("En clase");
    }
    public void calificar(){
        System.out.println("se entrega nota");
    }
}
