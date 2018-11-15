package com.example.tulio.proyectoinformatico.Data.Model;


/*
Corresponde al modelo con el que se obtendra la informacion obtenida por el json
correspondiente a la consulta de los proximos partidos
*/


public class ProximosPartido {

    private String deporte;
    private String nombre;
    private String division;
    private String campeonato;
    private String equipo1;
    private String equipo2;
    private String fecha;
    private String hora;
    private String lugarId;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProximosPartido() {
    }

    /**
     *
     * @param nombre
     * @param hora
     * @param division
     * @param fecha
     * @param deporte
     * @param campeonato
     * @param lugarId
     * @param equipo1
     * @param equipo2
     */
    public ProximosPartido(String deporte, String nombre, String division, String campeonato, String equipo1, String equipo2, String fecha, String hora, String lugarId) {
        super();
        this.deporte = deporte;
        this.nombre = nombre;
        this.division = division;
        this.campeonato = campeonato;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.hora = hora;
        this.lugarId = lugarId;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getLugarId() {
        return lugarId;
    }

    public void setLugarId(String lugarId) {
        this.lugarId = lugarId;
    }

}