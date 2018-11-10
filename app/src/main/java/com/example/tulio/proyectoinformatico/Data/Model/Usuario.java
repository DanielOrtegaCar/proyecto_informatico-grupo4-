package com.example.tulio.proyectoinformatico.Data.Model;
public class Usuario {

    private Integer id;
    private String nombre;
    private String correo;
    private String password;
    private String admin;
    private String  deletedAt;
    private String  createdAt;
    private String  updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usuario() {
    }

    /**
     * 
     * @param updatedAt
     * @param nombre
     * @param id
     * @param createdAt
     * @param admin
     * @param deletedAt
     * @param password
     * @param correo
     */
    public Usuario(Integer id, String nombre, String correo, String password, String admin, String deletedAt, String createdAt, String updatedAt) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.admin = admin;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
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


}
