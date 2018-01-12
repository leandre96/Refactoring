/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitive_Obsession.Mal;

/**
 *
 * @author User
 */
public class PO {
    private String nomCiudad;
    private int poblacionCiudad;
    private String postalCCiudad;
    private String tipoClima;
    private boolean corrupta;

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public int getPoblacionCiudad() {
        return poblacionCiudad;
    }

    public void setPoblacionCiudad(int poblacionCiudad) {
        this.poblacionCiudad = poblacionCiudad;
    }

    public String getPostalCCiudad() {
        return postalCCiudad;
    }

    public void setPostalCCiudad(String postalCCiudad) {
        this.postalCCiudad = postalCCiudad;
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
