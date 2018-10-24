package com.example.tulio.proyectoinformatico.Model;

public class fechas {

    private int id;
    private String equipo_1;
    private String equipo_2;
    private int divisionid;
    private int lugarid;
    private String ganador;
    private String fecha;
    private String hora;
    private int empate;

    public fechas() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo_1() {
        return equipo_1;
    }

    public void setEquipo_1(String equipo_1) {
        this.equipo_1 = equipo_1;
    }

    public String getEquipo_2() {
        return equipo_2;
    }

    public void setEquipo_2(String equipo_2) {
        this.equipo_2 = equipo_2;
    }

    public int getDivisionid() {
        return divisionid;
    }

    public void setDivisionid(int divisionid) {
        this.divisionid = divisionid;
    }

    public int getLugarid() {
        return lugarid;
    }

    public void setLugarid(int lugarid) {
        this.lugarid = lugarid;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }


    @Override
    public String toString() {
        return "Equipo 1: "+this.equipo_1+"\n"+"Equipo 2: "+this.equipo_2+"\n"+this.fecha;
    }

}
