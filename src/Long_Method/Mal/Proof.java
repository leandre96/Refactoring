/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long_Method.Mal;

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
            List<String> ln=new LinkedList<>();
            ListIterator<String> lis=l1.listIterator();
            while(lis.hasNext()){
                if(i%2==0){
                    ln.add(lis.next());
                }
            }
            ms.put(s1, ln);
        }
        if(l2.size()>=i){
            List<String> ln2=new LinkedList<>();
            ListIterator<String> li2=l2.listIterator();
            while(li2.hasNext()){
                if(i%2==0){
                    ln2.add(li2.next());
                }
            }
            ms.put(s2, ln2);
        }
    }
}
