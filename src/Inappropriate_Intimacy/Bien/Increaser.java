/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inappropriate_Intimacy.Bien;


import java.util.List;

/**
 *
 * @author Usuario
 */
public class Increaser {

    public double sumarIngresos(List<Store> tiendas){
        double suma = 0;
        for(Store tienda : tiendas){
            suma+=tienda.getingresoMensual();
        }
        return suma;
    }
}
