/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duplicate_Code.Mal;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class DC {
    private List<String> lista_palabras;
    public DC(List<String> lp){
        lista_palabras=lp;
    }
    public String generador(List<String> ls1){
        String tot="";
        ListIterator<String> ls=lista_palabras.listIterator();
        while(ls.hasNext()){
            if(ls.next().equals("Hola")){
                tot=tot+"Hola";
            }
        }
        ListIterator<String> l=ls1.listIterator();
        while(l.hasNext()){
            if(l.next().equals("mundo")){
                tot=tot+"mundo";
            }
        }
        return tot;
    }
}
