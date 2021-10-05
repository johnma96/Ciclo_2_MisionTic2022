package reto2;
/*
 * @author jmmontoyaz
 */
public abstract class Profesor {
    
    public String nombre;
    public String cc;
    
    public Profesor(String nombre, String cc){
        this.nombre = nombre;
        this.cc = cc;
    }
    
    @Override
    public abstract String toString();  
}
