package com.example.tulio.proyectoinformatico.Data.Model;


public class TablaEquipo {

    private String nombre;
    private String id;
    private String equipo;
    private String pj;
    private String pg;
    private String pp;
    private String gf;
    private String gc;
    private String difgoles;

    /**
     * No args constructor for use in serialization
     *
     */
    public TablaEquipo() {
    }

    /**
     *
     * @param equipo
     * @param id
     * @param nombre
     * @param pg
     * @param difgoles
     * @param gc
     * @param gf
     * @param pp
     * @param pj
     */
    public TablaEquipo(String nombre, String id, String equipo, String pj, String pg, String pp, String gf, String gc, String difgoles) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.equipo = equipo;
        this.pj = pj;
        this.pg = pg;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.difgoles = difgoles;
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

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public String getDifgoles() {
        return difgoles;
    }

    public void setDifgoles(String difgoles) {
        this.difgoles = difgoles;
    }

}