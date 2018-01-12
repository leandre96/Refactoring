/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Mal;

/**
 *
 * @author Usuario
 */

//Clase para calcular la cantidad de dias vividos
public class Estimador {
    
    private int edad; //Edad de una perosna
    
    //Constructor de la clase
    public Estimador(int edad){ //Se recibe como parametro la edad 
        this.edad = edad; //Seteando la edad en la clase
    }
    
    //Metodo para retornar la edad guardada en la clase
    public int Edad1() { //No se recibe parametros
        return edad;// Retornando la edad guardada en la clase
    }

    //Metodo para setear la edad en la clase
    public void Edad2(int edad2) { // Se recibe como parametro la edad
        this.edad = edad2; // Se guarda la edad en la clase
    }
    
    //Metodo para estimar los dias vividos
    public void estimar(){ //No recibe parametros
        System.out.println("Dias estando vivo: " + edad * 365); //Se multiplica la edad por la cantidad de dias del año y se imprime por pantalla los dias vivdos
    }
    
}
