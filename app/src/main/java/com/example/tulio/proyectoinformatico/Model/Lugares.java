package com.example.tulio.proyectoinformatico.Model;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Lugares {


    private String capacidad;
    private String ubicacion;
    private String nombre;
    private int lugarid;

    public Lugares(){

    }
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLugarid() {
        return lugarid;
    }

    public void setLugarid(int lugarid) {
        this.lugarid = lugarid;
    }
}
