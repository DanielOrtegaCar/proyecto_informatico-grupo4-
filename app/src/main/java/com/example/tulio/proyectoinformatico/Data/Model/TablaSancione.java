
package com.example.tulio.proyectoinformatico.Data.Model;


public class TablaSancione {

    private String jugador;
    private String equipo;
    private String fechas;
    private String motivo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TablaSancione() {
    }

    /**
     * 
     * @param fechas
     * @param equipo
     * @param motivo
     * @param jugador
     */
    public TablaSancione(String jugador, String equipo, String fechas, String motivo) {
        super();
        this.jugador = jugador;
        this.equipo = equipo;
        this.fechas = fechas;
        this.motivo = motivo;
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

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
