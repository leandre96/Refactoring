/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements.Bien;

/**
 *
 * @author User
 */
public abstract class ArmaFuego implements Arma{
    protected int municion;

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }
    
}
