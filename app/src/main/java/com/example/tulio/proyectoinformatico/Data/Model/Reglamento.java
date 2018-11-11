
package com.example.tulio.proyectoinformatico.Data.Model;


public class Reglamento {

    private String reglamento;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reglamento() {
    }

    /**
     * 
     * @param reglamento
     */
    public Reglamento(String reglamento) {
        super();
        this.reglamento = reglamento;
    }

    public String getReglamento() {
        return reglamento;
    }

    public void setReglamento(String reglamento) {
        this.reglamento = reglamento;
    }

}
