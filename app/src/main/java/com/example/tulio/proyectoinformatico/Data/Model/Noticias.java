
package com.example.tulio.proyectoinformatico.Data.Model;


public class Noticias {

    private Integer id;
    private String deporteid;
    private String texto;
    private String deletedAt;
    private String createdAt;
    private String updatedAt;
    private String titulo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Noticias() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param titulo
     * @param texto
     * @param createdAt
     * @param deletedAt
     * @param deporteid
     */
    public Noticias(Integer id, String deporteid, String texto, String deletedAt, String createdAt, String updatedAt, String titulo) {
        super();
        this.id = id;
        this.deporteid = deporteid;
        this.texto = texto;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeporteid() {
        return deporteid;
    }

    public void setDeporteid(String deporteid) {
        this.deporteid = deporteid;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
