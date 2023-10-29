package com.xjgv.appPersonas.modelo;

public class Cliente extends Persona{
    private int clienteID;



    public Cliente(String nombre, String apellido, String numeroFiscal, String direcccion, double remuneracion,int clienteID) {
        super(nombre, apellido, numeroFiscal, direcccion);
        this.clienteID = clienteID;
    }

    public int getClienteID() {
        return clienteID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ClienteID = " + clienteID;
    }
}
