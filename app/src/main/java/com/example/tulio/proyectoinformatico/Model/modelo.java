package com.example.tulio.proyectoinformatico.Model;

public class modelo {

    private String password;
    private String correo;
    private String nombre;
    private int usuarioid;

    public modelo() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\n"+this.correo;
    }


}
