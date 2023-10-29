package com.xjgv.appPersonas.modelo;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoID;
    private static int ultimoEmpleadoID;


    public Empleado(String nombre, String apellido, String numeroFiscal, String direcccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direcccion);
        Empleado.ultimoEmpleadoID = ++ultimoEmpleadoID;
        this.remuneracion = remuneracion;
        this.empleadoID = ultimoEmpleadoID;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "\n" +
                super.toString() +
                "Remuneracion = " + remuneracion + "\n" +
                "EmpleadoID = " + empleadoID + "\n";
    }
}
