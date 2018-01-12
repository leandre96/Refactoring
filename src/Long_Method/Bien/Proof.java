/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long_Method.Bien;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author User
 */
public class Proof {
    
 public void transformacion(List<String> l1,List<String> l2,String s1,String s2, int i,Map<String,List<String>> ms){
        if(l1.size()>=i){
            ms.put(s1, neo(l1,true,i));
        }
        if(l2.size()>=i){
            ms.put(s2, neo(l2,false,i));
        }
    } 
    private List<String> neo(List<String> ls,boolean par,int i){
        List<String> ln=new LinkedList<>();
        int j=i;
        ListIterator<String> lis=ls.listIterator();
            while(lis.hasNext()){
                if((j%2==0)&&par){
                    ln.add(lis.next());
                }
            }
        return ln;
    }
}
