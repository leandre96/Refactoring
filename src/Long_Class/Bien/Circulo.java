/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long_Class.Bien;



/**
 *
 * @author Usuario
 */
public class Circulo implements Shape{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public void area(){
        double area = Math.pow(radio, 2) * Math.PI;
        System.out.println(area);
    }
}
