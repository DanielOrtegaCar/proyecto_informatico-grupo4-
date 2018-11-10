
package com.example.tulio.proyectoinformatico.Data.Model;


public class Noticias {

    private Integer id;
    private String deporteid;
    private String texto;
    private Object deletedAt;
    private Object createdAt;
    private Object updatedAt;
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
    public Noticias(Integer id, String deporteid, String texto, Object deletedAt, Object createdAt, Object updatedAt, String titulo) {
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

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
