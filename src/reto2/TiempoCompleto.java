package reto2;
/**
 * @author jmmontoyaz
 */
public class TiempoCompleto extends Profesor{
    String escalafon;

    public TiempoCompleto(String escalafon, String nombre, String cc) {
        super(nombre, cc);
        this.escalafon = escalafon;
    }
 
    @Override
    public String toString() {
        return "\nProfesor Tiempo Completo\n"+ "\tNombre:" + nombre + "\n\tCedula:" + cc + "\n\tEscalafon:" + escalafon;
    }  
}
