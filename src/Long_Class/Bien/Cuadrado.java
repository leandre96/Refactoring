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
public class Cuadrado implements Shape {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = lado * lado;
        System.out.println(area);
    }

}
