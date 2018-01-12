/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shotgun_Surgery.Bien;

/**
 *
 * @author User
 */
public class Cuenta {
    private String tipo;
    private String numeroCuenta;
    private int cant;
        public Cuenta(String tipo,String numeroCuenta,int cant)
       {
              this.cant=cant;
              this.tipo=tipo;
              this.numeroCuenta=numeroCuenta;
       }
       public void debito(int debito) throws Exception
       {
              if(cantidadInsuficiente())
              {
                     throw new Exception("El balance minimo deberia ser 500");
              }
              cant = cant-debito;
              System.out.println("El monto es" + cant);
       }
       public void transferencia(Cuenta from,Cuenta to,int cerditAmount) throws Exception
       {
              if(cantidadInsuficiente())
              {
                     throw new Exception("El balance minimo deberia ser 500");
              }
              to.cant = cant+cerditAmount;
       }
       private boolean cantidadInsuficiente(){
           
           return cant<=500;
       }
       public void mensajeAdvertencia()
       {
              if(cantidadInsuficiente())
              {
                     System.out.println("Cantidad deberia ser 500");
              }
       }
}
