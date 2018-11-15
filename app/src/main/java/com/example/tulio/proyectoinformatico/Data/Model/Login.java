package com.example.tulio.proyectoinformatico.Data.Model;


public class Login {

    private String id;
    private String nombre;
    private String password;

    /**
     * No args constructor for use in serialization
     *
     */
    public Login() {
    }

    /**
     *
     * @param nombre
     * @param id
     * @param password
     */
    public Login(String id, String nombre, String password) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}