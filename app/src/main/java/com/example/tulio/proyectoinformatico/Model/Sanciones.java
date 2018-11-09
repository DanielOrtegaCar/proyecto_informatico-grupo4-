package com.example.tulio.proyectoinformatico.Model;

/***
 *
 * Daniel Ortega Carcamo
 */
public class Sanciones {

    private String comentario;
    private String tiempo;
    private String jugadorid;
    private String sancionid;

    public Sanciones(){

    }
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getJugadorid() {
        return jugadorid;
    }

    public void setJugadorid(String jugadorid) {
        this.jugadorid = jugadorid;
    }

    public String getSancionid() {
        return sancionid;
    }

    public void setSancionid(String sancionid) {
        this.sancionid = sancionid;
    }
}
