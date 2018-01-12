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
public class Rectangulo implements Shape{
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = base * altura;
        System.out.println(area);
    }
    
    
}
