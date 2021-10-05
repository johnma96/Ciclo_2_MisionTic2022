package reto2;
/**
 * @author jmmontoyaz
 */
public class HoraCatedra extends Profesor{

    int numHoras;
    int valorHora;

    public HoraCatedra(int numHoras, int valorHora, String nombre, String cc){
        super(nombre, cc);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\nProfesor Hora Catedra\n"+ "\n\tNombre:" + nombre + "\n\tCedula:" + cc + "\n\tNumero de horas:"+ numHoras + "\n\tValor de la hora:" + valorHora;
    }
}


