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
public class Increaser {
    
    private Son1 son1;
    private Son2 son2;
    private Son3 son3;

    public Increaser(Son1 son1, Son2 son2, Son3 son3) {
        this.son1 = son1;
        this.son2 = son2;
        this.son3 = son3;
    }
    public double sumarIngresos(){
        double suma = son1.getIngresoMensual() + son2.getIngresoMensual() + son3.getIngresoMensual();
        son1.setIngresoDelMes(0);
        son2.setIngresoDelMes(0);
        son3.setIngresoDelMes(0);
        return suma;
    }
    public Son1 getSon1() {
        return son1;
    }

    public void setSon1(Son1 son1) {
        this.son1 = son1;
    }

    public Son2 getSon2() {
        return son2;
    }

    public void setSon2(Son2 son2) {
        this.son2 = son2;
    }

    public Son3 getSon3() {
        return son3;
    }

    public void setSon3(Son3 son3) {
        this.son3 = son3;
    }
    
    
    
}
