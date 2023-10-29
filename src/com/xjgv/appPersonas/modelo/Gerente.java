package com.xjgv.appPersonas.modelo;

public class Gerente extends  Empleado{
    private double presupuesto;


    public Gerente(String nombre, String apellido, String numeroFiscal, String direcccion, double remuneracion,  double presupuesto) {
        super(nombre, apellido, numeroFiscal, direcccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Presupuesto = " + presupuesto;
    }
}
