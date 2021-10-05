package reto2;
/**
 * @author jmmontoyaz
 */
import java.util.ArrayList;
import java.util.Scanner;
        
        
public class Institucion {
    public static final ArrayList<Profesor> profesores = new ArrayList<>();

    public static void main(String[] args){
               
        Institucion insti = new Institucion();
        insti.procesarComandos();
    }
        
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }
    
    public void listarProfesores(){  
        System.out.println("***Listado de profesores***");
        for (Profesor p: profesores){
            System.out.println(p.toString());
        }
    }
    
    public void procesarComandos(){
        Scanner sc = new Scanner(System.in);
        int comando = 0;
        
        while (comando != 3){
            String data_profesor = sc.nextLine();
            String[] data_split = data_profesor.split("&");
            
            comando = Integer.parseInt(data_split[0]);            
            switch (comando){
                
                case 1: //Agregar Profesor
                    String tipo = data_split[1];
                    String nombre_p = data_split[2];
                    String id = data_split[3];
                    if ("Catedra".equals(tipo)){
                        int horas = Integer.parseInt(data_split[4]);
                        int valor = Integer.parseInt(data_split[5]);
                        
                        HoraCatedra nuevo_p = new HoraCatedra(horas, valor, nombre_p, id);
                        agregarProfesor(nuevo_p);  
                    } else{
                        
                        String escalafon_p = data_split[4];
            
                        TiempoCompleto nuevo_p = new TiempoCompleto(escalafon_p, nombre_p, id);
                        agregarProfesor(nuevo_p);
                    }
                    break;
                case 2: //Listar profesores actuales
                    listarProfesores();
                    break;
                case 3: //Terminar el programa
                    System.exit(0);
                    break;      
            }
        }  
    }     
}
