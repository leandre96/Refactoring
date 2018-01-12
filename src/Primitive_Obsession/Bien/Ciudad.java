/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitive_Obsession.Bien;

/**
 *
 * @author User
 */
public class Ciudad {
    private String nom;
    private int poblacion;
    private String postal;
    private String tipoClima;
    private boolean corrupta;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public boolean isCorrupta() {
        return corrupta;
    }

    public void setCorrupta(boolean corrupta) {
        this.corrupta = corrupta;
    }
    
}
