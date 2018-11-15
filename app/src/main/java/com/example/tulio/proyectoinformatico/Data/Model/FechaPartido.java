
package com.example.tulio.proyectoinformatico.Data.Model;


import com.google.gson.annotations.SerializedName;

/*
Corresponde al modelo con el que se obtendra la informacion obtenida por el json
correspondiente a la consulta de Fecha de los proximos partidos
*/

public class FechaPartido {

    private String deporteid;
    private String id;
    private String division;
    private String campeonato;
    @SerializedName("equipo_1")
    private String equipo1;
    @SerializedName("equipo_2")
    private String equipo2;
    private String fecha;
    private String hora;
    private String ganador;
    private String empate;
    private String lugarId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FechaPartido() {
    }

    /**
     * 
     * @param id
     * @param hora
     * @param empate
     * @param division
     * @param fecha
     * @param ganador
     * @param campeonato
     * @param lugarId
     * @param equipo1
     * @param deporteid
     * @param equipo2
     */
    public FechaPartido(String deporteid, String id, String division, String campeonato, String equipo1, String equipo2, String fecha, String hora, String ganador, String empate, String lugarId) {
        super();
        this.deporteid = deporteid;
        this.id = id;
        this.division = division;
        this.campeonato = campeonato;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.hora = hora;
        this.ganador = ganador;
        this.empate = empate;
        this.lugarId = lugarId;
    }

    public String getDeporteid() {
        return deporteid;
    }

    public void setDeporteid(String deporteid) {
        this.deporteid = deporteid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
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

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getEmpate() {
        return empate;
    }

    public void setEmpate(String empate) {
        this.empate = empate;
    }

    public String getLugarId() {
        return lugarId;
    }

    public void setLugarId(String lugarId) {
        this.lugarId = lugarId;
    }

}
