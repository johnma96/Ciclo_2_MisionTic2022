package reto1;
/**
 
 * @author jmmontoyaz
 */

import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el número de principales: ");
        int princi = sc.nextInt(); 
        
        int secund = secundarios(princi);
        int obser = observadores(princi, secund);
        
        System.out.printf("%s %s %s\n", princi, secund, obser);       
        System.out.println(tipo_salon(princi,secund, obser));       
    }
    
    
    public static int secundarios(int principales){
        
        return 5*principales;
    }
    
    public static int observadores(int principales, int secundarios){
        return (secundarios + principales)*1/6;
    }
    
    public static String tipo_salon(int principales, int secundarios,
            int observadores){
        int total_asistentes = principales+secundarios+observadores;
        
        String salon;
        
        if (total_asistentes < 20){
            return salon = "pequeño";
        } else if (total_asistentes >= 20 && total_asistentes < 40){
            return salon = "mediano";            
        } else{
            return salon = "grande";    
            }
    }    
}