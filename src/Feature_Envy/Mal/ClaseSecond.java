/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feature_Envy.Mal;

/**
 *
 * @author User
 */
public class ClaseSecond {
    private String nomOpe;
    private String nomRes;
    private String nomCal;
    private String nomPro;
    private int cant;
    private boolean estado;
    public void llenar(String s1,String s2,String s3,int i){
        System.out.println(s1+s2+s3+i);
    }
    public void est(boolean b,String s){
        System.out.println(b+s);
    }
    public String getNomOpe() {
        return nomOpe;
    }

    public void setNomOpe(String nomOpe) {
        this.nomOpe = nomOpe;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public String getNomCal() {
        return nomCal;
    }

    public void setNomCal(String nomCal) {
        this.nomCal = nomCal;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
