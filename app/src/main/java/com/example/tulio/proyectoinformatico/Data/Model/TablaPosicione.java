
package com.example.tulio.proyectoinformatico.Data.Model;


public class TablaPosicione {

    private String nombre;
    private String id;
    private String equipo;
    private String pJ;
    private String pG;
    private String pP;
    private String gF;
    private String gC;
    private String dIFGOLES;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TablaPosicione() {
    }

    /**
     * 
     * @param equipo
     * @param id
     * @param nombre
     * @param pG
     * @param pP
     * @param dIFGOLES
     * @param pJ
     * @param gF
     * @param gC
     */
    public TablaPosicione(String nombre, String id, String equipo, String pJ, String pG, String pP, String gF, String gC, String dIFGOLES) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.equipo = equipo;
        this.pJ = pJ;
        this.pG = pG;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
        this.dIFGOLES = dIFGOLES;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPJ() {
        return pJ;
    }

    public void setPJ(String pJ) {
        this.pJ = pJ;
    }

    public String getPG() {
        return pG;
    }

    public void setPG(String pG) {
        this.pG = pG;
    }

    public String getPP() {
        return pP;
    }

    public void setPP(String pP) {
        this.pP = pP;
    }

    public String getGF() {
        return gF;
    }

    public void setGF(String gF) {
        this.gF = gF;
    }

    public String getGC() {
        return gC;
    }

    public void setGC(String gC) {
        this.gC = gC;
    }

    public String getDIFGOLES() {
        return dIFGOLES;
    }

    public void setDIFGOLES(String dIFGOLES) {
        this.dIFGOLES = dIFGOLES;
    }

}
