/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duplicate_Code.Bien;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class Dc {
    private List<String> lista_palabras;
    public Dc(List<String> lp){
        lista_palabras=lp;
    }
    public String generador(List<String> ls1){
        return palabra(lista_palabras,"Hola")+palabra(ls1,"mundo");
    }
    private String palabra(List<String> ls,String pal){
        ListIterator<String> l=ls.listIterator();
        while(l.hasNext()){
            if(l.next().equals(pal));
                return pal;
        }
        return "";
    }
}
