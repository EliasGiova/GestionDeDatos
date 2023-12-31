
package com.mycompany.sistemadegestion;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
}
