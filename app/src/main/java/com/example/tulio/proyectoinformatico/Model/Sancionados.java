package com.example.tulio.proyectoinformatico.Model;

public class Sancionados {

    private String Motivo;
    private String Fechas;
    private String Equipo;
    private String Jugador;

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getFechas() {
        return Fechas;
    }

    public void setFechas(String Fechas) {
        this.Fechas = Fechas;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getJugador() {
        return Jugador;
    }

    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }

    public String toString(){
        return "Nombre: "+this.getJugador()+"\n"+"Fechas: "+this.getFechas()+"\n"+"Equipo: "+this.getEquipo()+"\n"+"Motivo: "+this.getMotivo();
    }
}
