package com.example.tulio.proyectoinformatico.Modelos;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Equipos {

    private String facultad;
    private String carrera;
    private String nombre;
    private String divisionid;
    private int equipoid;

    public Equipos(){

    }
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivisionid() {
        return divisionid;
    }

    public void setDivisionid(String divisionid) {
        this.divisionid = divisionid;
    }

    public int getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(int equipoid) {
        this.equipoid = equipoid;
    }

    public String toString(){return this.equipoid+" "+this.nombre;}
}
