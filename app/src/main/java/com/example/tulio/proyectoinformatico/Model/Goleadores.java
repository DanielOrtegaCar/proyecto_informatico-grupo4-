package com.example.tulio.proyectoinformatico.Model;

public class Goleadores {

    private String goles;
    private String jugador;
    private String equipo;

    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String toString(){
        return this.jugador+"  "+this.goles+"  "+this.equipo;
    }
}
