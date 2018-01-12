/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Class.Bien;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DC {
    private int edadMinima = 18;
    private String nomUniversidad = "Universidad Catolica Santiago de Guayaquil";
    private List<String> nomEstudiantes = new LinkedList();
    private int tiempoVigencia = 209;
    
    public void agregarEstudiante(String nombre){
        nomEstudiantes.add(nombre);
    }

    public void removerEstudiante(String nombre){
        nomEstudiantes.remove(nombre);
    }
    
    public int getEdadUniversidad() {
        return tiempoVigencia;
    }
    public int getEdadMinima() {
        return edadMinima;
    }

    public String getNomUniversidad() {
        return nomUniversidad;
    }

    public List<String> getNombresEstudiantes() {
        return Collections.unmodifiableList(nomEstudiantes);
    }
    
    
        
}
