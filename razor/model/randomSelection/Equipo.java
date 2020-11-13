/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razor.model.randomSelection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scast
 */
public class Equipo {
    private String nombreEquipo;
    private List <String> nombrePersonas;
    public Equipo (){
        nombreEquipo = "";
        nombrePersonas = new ArrayList <> ();
    }
    public Equipo (String nombre){
        nombreEquipo = nombre;
        nombrePersonas = new ArrayList <> ();
    }
    public void setNombreEquipo (String str){
        nombreEquipo = str;
    }
    public void setNombrePersona (List <String> arraylist){
        nombrePersonas = arraylist;
    }
    public String getNombreEquipo (){
        return nombreEquipo; 
    }
    public List <String> getNombrePersonas (){
        return nombrePersonas;
    }
    public void addNombre (String nombre){
        nombrePersonas.add(nombre);
    }
}
