package com.example.tulio.proyectoinformatico.Modelos;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Campeonatos {

    private String fecha_termino;
    private String fecha_inicio;
    private String semestre;
    private String nombre;
    private String ano;
    private String divisionid;
    private int campeonatoid;

    public Campeonatos(){

    }

    public String getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDivisionid() {
        return divisionid;
    }

    public void setDivisionid(String divisionid) {
        this.divisionid = divisionid;
    }

    public int getCampeonatoid() {
        return campeonatoid;
    }

    public void setCampeonatoid(int campeonatoid) {
        this.campeonatoid = campeonatoid;
    }
}
