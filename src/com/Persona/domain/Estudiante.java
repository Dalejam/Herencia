package com.Persona.domain;

public class Estudiante extends Persona{
    private String grupo;
    private String materia;
    private String horario;

    public String getGrupo() {
        return grupo;
    }

    public String getMateria() {
        return materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void entregarTrabajos(){
        System.out.println("Entrega trabajo");
    }
    public void entregarExamen(){
        System.out.println("Entrega Examen");
    }
}
