package com.example.tulio.proyectoinformatico.Modelos;

/***
 *
 * Daniel Ortega Carcamo
 */
public class PartidoJugador {

    private String faltas_b;
    private String roja;
    private String amarilla;
    private String triples;
    private String puntos;
    private String jugadorid;
    private String partidoid;

    public PartidoJugador(){

    }
    public String getFaltas_b() {
        return faltas_b;
    }

    public void setFaltas_b(String faltas_b) {
        this.faltas_b = faltas_b;
    }

    public String getRoja() {
        return roja;
    }

    public void setRoja(String roja) {
        this.roja = roja;
    }

    public String getAmarilla() {
        return amarilla;
    }

    public void setAmarilla(String amarilla) {
        this.amarilla = amarilla;
    }

    public String getTriples() {
        return triples;
    }

    public void setTriples(String triples) {
        this.triples = triples;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getJugadorid() {
        return jugadorid;
    }

    public void setJugadorid(String jugadorid) {
        this.jugadorid = jugadorid;
    }

    public String getPartidoid() {
        return partidoid;
    }

    public void setPartidoid(String partidoid) {
        this.partidoid = partidoid;
    }
}
