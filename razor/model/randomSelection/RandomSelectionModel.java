/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razor.model.randomSelection;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RandomSelectionModel {
    
    private ArrayList <Equipo> equipos;
    
    public RandomSelectionModel (){
       equipos = new ArrayList <> ();
    }
    /**
     * Forma N equipos con X personas
     * @param nombres de las personas que conformaran los equipos
     * @param nEquipos numero de equipos
     */
    public void hacerEquipos (ArrayList <String> nombres, int nEquipos){

        ArrayList <String> nombresRandom = new ArrayList <> ();
        int max = nombres.size();
        //Aleatoriza el string de nombres
        for (int i = 0; i < max; i++){
            int numRandom = numeroRandom(0,nombres.size() - 1);
            nombresRandom.add(nombres.get(numRandom));
            nombres.remove(numRandom);
        }
        //Añade numero de equipos
        for (int i = 0; i <nEquipos; i++)
            equipos.add(new Equipo ("Equipo " + i + 1));
        //Añade integrantes a los equipos
        nombresRandom.forEach(n -> {
            conocerMenor ().addNombre(n);
        });
    }
    /**
     * Conocer el equipo con menos integrantes, si hay 2 o mas con el mismo 
     * numero se elije aleatoriamente el equipo
     * @return equipo con menos integrantes
     */
    public Equipo conocerMenor (){
        
        Equipo equipoMenor = equipos.get(0);
        //Busca el equipo mas pequeño
        for (Equipo e : equipos) 
            //Elige el equipo mas pequeño
            if (e.getNombrePersonas().size() < equipoMenor.getNombrePersonas().size() )
                equipoMenor = e;
            //Si tienen el mismo tamaño elige de forma aleatoria
            else if (e.getNombrePersonas().size() == equipoMenor.getNombrePersonas().size() )
                if (numeroRandom (0,1) == 1)
                    equipoMenor = e;
        
        return equipoMenor;
    }
    /**
     * Elegir numero aleatorio entre un maximo y un minimo
     * @param min cota minima
     * @param max cota maxima
     * @return numero aleatorio entre cotas
     */
    public int numeroRandom (int min,int max){
        int numero = (int) floor(random()*(max-min+1)+min);
        return numero;
    }
    /**
     * Prueba de las funciones implementadas
     * @param args 
     */
    public static void main(String[] args) {

        RandomSelectionModel model = new RandomSelectionModel ();
        //PRUEBA NUMERO ALEATORIO
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"min: " ));
        int numw = Integer.parseInt(JOptionPane.showInputDialog(null,"max: " ));
        System.out.println(model.numeroRandom(num, numw));
        //PRUEBA FORMAR EQUIPOS
        ArrayList <String> str = new ArrayList <> ();
        
        str.add("Salva"); str.add("Joan"); str.add("Alberto"); str.add("Sara");
        str.add("Bernardo"); str.add("Adri"); str.add("Vanessa"); str.add("Dario");
        str.add("Akiro"); str.add("Takker"); str.add("Sergio"); str.add("Sergio");
        
        model.hacerEquipos(str, 2);
        
        System.out.println(model.equipos.get(0).getNombreEquipo());
        System.out.println(model.equipos.get(0).getNombrePersonas().toString());
        
        System.out.println();
        
        System.out.println(model.equipos.get(1).getNombreEquipo());
        System.out.println(model.equipos.get(1).getNombrePersonas().toString());
    }
    
}
