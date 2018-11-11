
package com.example.tulio.proyectoinformatico.Data.Model;


public class TablaGoleador {

    private String equipo;
    private String jugador;
    private String goles;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TablaGoleador() {
    }

    /**
     * 
     * @param equipo
     * @param jugador
     * @param goles
     */
    public TablaGoleador(String equipo, String jugador, String goles) {
        super();
        this.equipo = equipo;
        this.jugador = jugador;
        this.goles = goles;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

}
