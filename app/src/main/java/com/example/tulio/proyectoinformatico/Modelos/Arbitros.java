package com.example.tulio.proyectoinformatico.Modelos;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Arbitros {

    private String fecha_ingreso;
    private String carrera;
    private String nombre;
    private int arbitroid;

    public Arbitros() {
    }


    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
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

    public int getArbitroid() {
        return arbitroid;
    }

    public void setArbitroid(int arbitroid) {
        this.arbitroid = arbitroid;
    }
}
