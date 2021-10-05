package reto3;

/**
 *
 * @author jmmontoyaz
 */

import java.util.ArrayList;
public class Coleccion {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(3);
        myNumbers.add(2);
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(2);
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(1);
        
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(1);
        myNumbers2.add(3);
        myNumbers2.add(6);
        myNumbers2.add(8);
        
        ArrayList<Integer> mun_mias = new ArrayList<Integer>();
        mun_mias.add(27);
        mun_mias.add(17);
        mun_mias.add(35);
        mun_mias.add(21);
        mun_mias.add(13);
        mun_mias.add(14);
        mun_mias.add(2);
        mun_mias.add(33);
        mun_mias.add(30);
        mun_mias.add(9);
        mun_mias.add(10);
        mun_mias.add(26);
        mun_mias.add(19);
        mun_mias.add(32);
        mun_mias.add(24);
        mun_mias.add(0);
        mun_mias.add(28);
        mun_mias.add(25);
        mun_mias.add(4);
        
        ArrayList<Integer> mun_otro = new ArrayList<Integer>();
        mun_otro.add(36);
        mun_otro.add(33);
        mun_otro.add(7);
        mun_otro.add(5);
        mun_otro.add(29);
        mun_otro.add(25);
        mun_otro.add(19);
        mun_otro.add(27);
        mun_otro.add(10);
        mun_otro.add(2);
        mun_otro.add(37);
        mun_otro.add(3);
        mun_otro.add(34);
        mun_otro.add(24);
        mun_otro.add(35);
        mun_otro.add(15);
        mun_otro.add(0);
        mun_otro.add(14);
        
        ArrayList<Integer> temps = temporadas(myNumbers);
        System.out.println(temps);
        
        
        ArrayList<Integer> mun_falt = mefaltandelatemporada(myNumbers2, myNumbers, 2);
        System.out.println(mun_falt);
        
        
        ArrayList<Integer> mun_notengo = notengo(mun_otro, mun_mias);
        System.out.println(mun_notengo);
        
        Integer num_mun_notengo = puedocambiar(mun_otro, mun_mias);
        System.out.println(num_mun_notengo);
        
    }
        

    public static ArrayList temporadas(ArrayList<Integer> temp_mun){
        
        /*sacar las temporadas sin repeticion, para ello usar un for que 
        verifique si el la lista que se va a devolver ya existe la temporada
        se debe hacer en orden*/
                                                
        ArrayList<Integer> temps = new ArrayList<Integer>();                                  
        for (Integer temp: temp_mun){
            if (temps.contains(temp)){
                ;
            } else {
                temps.add(temp);
            }   
        }
        return temps;
    }    
    
    public static ArrayList mefaltandelatemporada(ArrayList<Integer> 
            cod_mun_faltan, ArrayList<Integer> temp_mun, Integer temp){
        
        /*recorre la lista cod_mun_faltan, usando i como indice buscar en 
        list_temp_mun si ese elemento coincide con temp, entonces se guarda en
        la lista que voy a retornar*/
        
        ArrayList<Integer> mun_faltantes = new ArrayList<Integer>();
        for(Integer i: cod_mun_faltan){
            if (i < temp_mun.size()){
                Integer temp_list = temp_mun.get(i);
                if (temp_list == temp){
                    mun_faltantes.add(i);
                }           
            }                       
        }
        return mun_faltantes;         
    }

    
    public static ArrayList notengo(ArrayList<Integer>  list_mun_otro,
            ArrayList<Integer>  list_mun_mias){
        
    /*recorrer la lista list_mun_otro y mirar si ese elemento esta en 
    list_mun_mias, sino esta agragarlo a la lita que se va a retornar*/
    
        ArrayList<Integer> mun_notengo = new ArrayList<Integer>();
        for(Integer m_otro: list_mun_otro){
            if(list_mun_mias.contains(m_otro)){
                ;
            } else {
                mun_notengo.add(m_otro);
            }    
        }
        return mun_notengo;
    }
    
    
    public static Integer puedocambiar(ArrayList<Integer> list_mun_otro,
            ArrayList<Integer> list_mun_mias){
        
        /*similar a la funcion anterior pero ahora recorro list_mun_mias y 
        verifico en list_mun_otro, si no esta se guarda en una lista. Luego
        tomo el tamaño de esta nueva lista y lo comparo con el tamaño de la que
        me retorna el método notengo, devuelvo como Integer el tamaño de lista
        más pequeño*/
        
        ArrayList<Integer> mun_cambiar = new ArrayList<Integer>();
        for(Integer m_mia: list_mun_mias){
            if(list_mun_otro.contains(m_mia)){
                ;
            } else {
                mun_cambiar.add(m_mia);
            }
        }

        String num_mun_cambiar = String.valueOf(mun_cambiar.size());
        Integer num_mia = Integer.parseInt(num_mun_cambiar);

        /*Para la ejecuión en la plataforma no me dejó correr llamando el método
        entonces simplemente lo copié y pegué para generar el ArrayList 
        mun_notengo        
        
        ArrayList<Integer> mun_notengo = new ArrayList<Integer>();
        for(Integer m_otro: list_mun_otro){
            if(list_mun_mias.contains(m_otro)){
                ;
            } else {
                mun_notengo.add(m_otro);
            }    
        }*/
        
        ArrayList<Integer> mun_notengo = notengo(list_mun_otro, list_mun_mias);
        
        String num_mun_otro = String.valueOf(mun_notengo.size());
        Integer num_otro = Integer.parseInt(num_mun_otro);
        
        if (num_mia <= num_otro){
            return num_mia;
        } else{
            return num_otro;
        }         
    }
}
