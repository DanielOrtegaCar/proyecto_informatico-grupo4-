
package com.example.tulio.proyectoinformatico.Data.Model;


public class FechaPartido {

    private String deporteid;
    private String id;
    private String division;
    private String campeonato;
    private String ano;
    private String semestre;
    private String fechaInicio;
    private String fechaTermino;
    private String lugarid;
    private String equipo1;
    private String equipo2;
    private String fecha;
    private String hora;
    private String ganador;
    private String empate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FechaPartido() {
    }

    /**
     * 
     * @param fecha
     * @param ganador
     * @param semestre
     * @param deporteid
     * @param fechaTermino
     * @param id
     * @param lugarid
     * @param hora
     * @param empate
     * @param division
     * @param campeonato
     * @param ano
     * @param equipo1
     * @param equipo2
     * @param fechaInicio
     */
    public FechaPartido(String deporteid, String id, String division, String campeonato, String ano, String semestre, String fechaInicio, String fechaTermino, String lugarid, String equipo1, String equipo2, String fecha, String hora, String ganador, String empate) {
        super();
        this.deporteid = deporteid;
        this.id = id;
        this.division = division;
        this.campeonato = campeonato;
        this.ano = ano;
        this.semestre = semestre;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.lugarid = lugarid;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.hora = hora;
        this.ganador = ganador;
        this.empate = empate;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getLugarid() {
        return lugarid;
    }

    public void setLugarid(String lugarid) {
        this.lugarid = lugarid;
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

}
