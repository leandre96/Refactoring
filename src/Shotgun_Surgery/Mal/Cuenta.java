/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shotgun_Surgery.Mal;

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
              if(cant <= 500)
              {
                     throw new Exception("El balance minimo deberia ser 500");
              }
              cant = cant-debito;
              System.out.println("El monto es" + cant);
       }
       public void transferencia(Cuenta from,Cuenta to,int cerditAmount) throws Exception
       {
              if(from.cant <= 500)
              {
                     throw new Exception("El balance minimo deberia ser 500");
              }
              to.cant = cant+cerditAmount;
       }
       public void mensajeAdvertencia()
       {
              if(cant <= 500)
              {
                     System.out.println("Cantidad deberia ser 500");
              }
       }

}
