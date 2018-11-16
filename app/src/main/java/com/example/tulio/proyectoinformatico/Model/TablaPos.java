package com.example.tulio.proyectoinformatico.Model;

public class TablaPos {

    private String difgoles;
    private String gc;
    private String gf;
    private String pp;
    private String pg;
    private String pj;
    private String equipo;
    private String id;
    private String nombre;

    public String getDifgoles() {
        return difgoles;
    }

    public void setDifgoles(String difgoles) {
        this.difgoles = difgoles;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return this.getEquipo()+"                      "+this.getPj()+"     "+this.getPg()+"     "+this.getPp()+"     "+this.getDifgoles();
    }
}
