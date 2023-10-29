package com.xjgv.appPersonas.modelo;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return
                "Nombre = " + nombre + '\n' +
                "Apellido = " + apellido + '\n' +
                "NumeroFiscal = " + numeroFiscal + '\n' +
                "Direccion = " + direccion + '\n';
    }
}
