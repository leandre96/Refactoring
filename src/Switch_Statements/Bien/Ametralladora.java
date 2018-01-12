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
public class Ametralladora extends ArmaFuego {

    @Override
    public void atacar() {
        System.out.println("Ataco con ametralladora");
        this.municion=this.municion-1;//To change body of generated methods, choose Tools | Templates.
    }
    
}
