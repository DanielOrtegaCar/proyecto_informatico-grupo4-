
package com.example.tulio.proyectoinformatico.Data.Model;


public class Reglamento {

    private String nombre;
    private String reglamento;

    /**
     * No args constructor for use in serialization
     *
     */
    public Reglamento() {
    }

    /**
     *
     * @param nombre
     * @param reglamento
     */
    public Reglamento(String nombre, String reglamento) {
        super();
        this.nombre = nombre;
        this.reglamento = reglamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReglamento() {
        return reglamento;
    }

    public void setReglamento(String reglamento) {
        this.reglamento = reglamento;
    }

}
