package com.example.tulio.proyectoinformatico.Model;

public class fechas_partidos {


    private String lugar_id;
    private String empate;
    private String ganador;
    private String hora;
    private String fecha;
    private String equipo_2;
    private String equipo_1;
    private String campeonato;
    private String division;
    private String id;
    private String deporteid;

    public String getLugar_id() {
        return lugar_id;
    }

    public void setLugar_id(String lugar_id) {
        this.lugar_id = lugar_id;
    }

    public String getEmpate() {
        return empate;
    }

    public void setEmpate(String empate) {
        this.empate = empate;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEquipo_2() {
        return equipo_2;
    }

    public void setEquipo_2(String equipo_2) {
        this.equipo_2 = equipo_2;
    }

    public String getEquipo_1() {
        return equipo_1;
    }

    public void setEquipo_1(String equipo_1) {
        this.equipo_1 = equipo_1;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeporteid() {
        return deporteid;
    }

    public void setDeporteid(String deporteid) {
        this.deporteid = deporteid;
    }

    public String toString(){
        return "Equpo 1: "+this.getEquipo_1()+"\n"+"Equipo 2: "+this.getEquipo_2()+"\n"+"Fecha: "+this.fecha+"\n"+"Division: "+this.division;
    }
}
