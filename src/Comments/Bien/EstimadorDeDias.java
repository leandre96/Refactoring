/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Bien;

/**
 *
 * @author Usuario
 */
public class EstimadorDeDias {
    
    private int edad;

    public EstimadorDeDias(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int diasTranscurridos(){
        return this.edad * 360;
    }
    
}
