/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long_Class.Mal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Shape {
    
    private String figura;
    private int ladoCuadrado;
    private int baseTriangulo;
    private int alturaTriangulo;
    private int radioCirculo;
    private int baseRectangulo;
    private int alturaRectangulo;
    
    public Shape(String figura){
        this.figura = figura;
        Scanner sc = new Scanner(System.in);
        if(figura.equals("Cuadrado")){
            System.out.println("Ingrese el valor del lado: ");
            this.ladoCuadrado = sc.nextInt();
        }else if(figura.equals("Circulo")){
            System.out.println("Ingrese el valor del radio:");
            this.radioCirculo = sc.nextInt();
        }else if(figura.equals("Triangulo")){
            System.out.println("Ingrese el valor de la base:");
            this.baseTriangulo = sc.nextInt();
            System.out.println("Ingrese el valor de la altura:");
            this.alturaTriangulo = sc.nextInt();
        }else if(figura.equals("Rectangulo")){
            System.out.println("Ingrese el valor de la base:");
            this.baseRectangulo = sc.nextInt();
            System.out.println("Ingrese el valor de la altura:");
            this.alturaRectangulo = sc.nextInt();
        }
    }
    
    public void Area(){
        if(figura.equals("Cuadrado")){
            System.out.println(AreaCuadrado());
        }else if(figura.equals("Triangulo")){
            System.out.println(AreaTriangulo());
        }else if(figura.equals("Rectangulo")){
            System.out.println(AreaRectangulo());
        }else if(figura.equals("Circulo")){
            System.out.println(AreaCirculo());
        }
    }
    
    public int AreaCuadrado(){
        return this.ladoCuadrado*this.ladoCuadrado;
    }
    
    public double AreaTriangulo(){
        return (this.baseTriangulo*this.alturaTriangulo)/2;
    }
    
    public int AreaRectangulo(){
        return this.baseRectangulo*this.alturaRectangulo;
    }
    
    public double AreaCirculo(){
        return Math.pow(this.radioCirculo, 2)*Math.PI;
    }
}
