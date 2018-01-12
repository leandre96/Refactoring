/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inappropriate_Intimacy.Mal;

/**
 *
 * @author Usuario
 */
public class Store {
    
    protected double ingresoMensual;

    public Store(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoDelMes(double ingreso) {
        ingresoMensual = ingreso;
    }
    
}
