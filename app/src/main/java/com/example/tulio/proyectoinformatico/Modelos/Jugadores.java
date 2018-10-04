package com.example.tulio.proyectoinformatico.Modelos;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Jugadores {

    private String ano_ingreso;
    private String edad;
    private String nombre;
    private String equipoid;
    private String jugadorid;

    public  Jugadores(){

    }
    public String getAno_ingreso() {
        return ano_ingreso;
    }

    public void setAno_ingreso(String ano_ingreso) {
        this.ano_ingreso = ano_ingreso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(String equipoid) {
        this.equipoid = equipoid;
    }

    public String getJugadorid() {
        return jugadorid;
    }

    public void setJugadorid(String jugadorid) {
        this.jugadorid = jugadorid;
    }
}
