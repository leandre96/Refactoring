/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feature_Envy.Bien;

/**
 *
 * @author User
 */
public class ClaseOne {
    public void resolution(ClaseSecond cs){
        llenar(cs.getNomCal(), cs.getNomOpe(), cs.getNomPro(), cs.getCant());
        est(cs.isEstado(), cs.getNomRes());
    }
    public void llenar(String s1,String s2,String s3,int i){
        System.out.println(s1+s2+s3+i);
    }
    public void est(boolean b,String s){
        System.out.println(b+s);
    }
}
