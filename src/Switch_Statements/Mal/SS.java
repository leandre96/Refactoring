/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Statements.Mal;

/**
 *
 * @author User
 */
public class SS {
    public void simulacion(Shooter s){
        if(s.getWeapon().equals("Escopeta")){
            System.out.println("Ataco con escopeta");
            s.setMunicion(s.getMunicion()-1);
        }
        else if(s.getWeapon().equals("Martillo")){
            System.out.println("Ataco con martillo");
            
        }
        else if(s.getWeapon().equals("Cuchillo")){
            System.out.println("Ataco con cuchillo");
            
        }
        else if(s.getWeapon().equals("Rifle")){
            System.out.println("Ataco con rifle");
            s.setMunicion(s.getMunicion()-1);
        }
        else if(s.getWeapon().equals("Ametralladora")){
            System.out.println("Ataco con ametralladora");
            s.setMunicion(s.getMunicion()-1);
        }
        else if(s.getWeapon().equals("Escudo")){
            System.out.println("Ataco con escudo");
            
        }
    }
}
