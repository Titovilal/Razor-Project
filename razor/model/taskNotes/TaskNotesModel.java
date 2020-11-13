package razor.model.taskNotes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salva Castells Juan
 */
public class TaskNotesModel {
    /*
        VARIABLES USADAS EN EL PROGRAMA
    */
    private ArrayList <String> infoP,infoC; //HE CAMBIADO DE LIST A ARRAYLIST, SI HAY ERRORES ES POR ESTO
    private final String nameFile1;
    private final String nameFile2;
    private FileReader fr;
    private FileWriter fw;
    private File f;
    private BufferedReader br;
    private PrintWriter pw,pw1;
    private String linea;
    private int n;
    
    /**
     *  CONSTRUCTOR 
     */
    public TaskNotesModel(){
        this.nameFile1 = "RazorP.txt";
        this.nameFile2 = "RazorC.txt";
        infoP = new ArrayList<>();
        infoC = new ArrayList<>();
    }
    /**
     *  LEER FICHEROS Y GUARDAR LOS DATOS 
     */
    public String getFileName1(){
        return nameFile1;
    }
    public String getFilename2(){
        return nameFile2;
    }
    public void leerFichero(){
        try{
            //LEER TAREAS PENDIENTES
            f = new File (nameFile1);
            fr = new FileReader(f);
            br = new BufferedReader (fr);
            n = 0;
            
            while((linea=br.readLine())!=null){
                infoP.add(linea);
                n++;
            }
            //LEER TAREAS COMPLETADAS
            f = new File (nameFile2);
            fr = new FileReader(f);
            br = new BufferedReader (fr);
            n = 0;
            
            while((linea=br.readLine())!=null){
                infoC.add(linea);
                n++;
            }
        }catch (IOException ex){System.out.println("NO vaaaa");}
    }
    /**
     *  ELIMINAR TAREA SELECCIONADA
     * @param num posicion de la tarea a eliminar
     */
    public void eliminarTarea (int num){/****************************************************************/
        try{
            f = new File (nameFile1);
            fw = new FileWriter (f);
            pw = new PrintWriter (fw);
            int n = num -1;

            for (int i = 0; i < infoP.size() ;i++)
                if  (i != n)
                    pw.println(infoP.get(i));
                
            infoP.remove(n);
            pw.close();

        }catch (IOException ex){System.out.println("NO vaaaVIVAESPANA");}
    }
    /**
     *  AGREGAR TAREA A UN FICHERO
     * @param fichero fichero donde agregar la tarea
     * @param tarea string de la tarea a agregar
     */
    public void agregarTarea (String fichero,String tarea){
        try{
            if (tarea != null){
                pw = new PrintWriter (new FileWriter(fichero,true));
                infoP.add(tarea);
                pw.append(tarea + "\n");
                pw.close();
            }
        }catch (IOException ex){System.out.println("NO vaaaVIVAESPANA");}
    }
    /**
     * 
     * @param num poscicion de la tarea a completar
     */
    public void completarTarea (int num){/**********************************************************/
        try{
            f = new File (nameFile1);
            fw = new FileWriter (f);
            pw = new PrintWriter (fw);
            pw1 = new PrintWriter (new FileWriter("RazorC.txt",true));
            n = num - 1;
            
            infoC.add(infoP.get(n));
            pw1.append(infoP.get(n) + "\n");
            
            infoP.remove(n);
            for (int i = 0; i < infoP.size() ;i++)
                    pw.println(infoP.get(i));

            pw.close();
            pw1.close();

        }catch (IOException ex){System.out.println("NO vaaaVIVAESPANA");}
    }
    /**
     * 
     * @return 
     */
    public String toStringTareasPendientes (){
        String frase="";
        n = 1;
        for (String str:infoP)
        {
            frase ="" + frase + n + " " +str + "\n";
            n++;
        }
        return frase;
    }
    /**
     * 
     * @return 
     */
    public String toStringTareasCompletadas (){
        String frase="";
        n = 1;
        for (String str:infoC)
        {
            frase ="" + frase + n + " " +str + "\n";
            n++;
        }
        return frase;
    }
    public static void main(String[] argv){                     //FUNCIONAN TODOS LOS METODOS BIEN
        TaskNotesModel tareas = new TaskNotesModel ();
        tareas.leerFichero();
        
        System.out.println(tareas.toStringTareasPendientes());
    }
}
