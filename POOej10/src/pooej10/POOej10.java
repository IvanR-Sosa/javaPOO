
package pooej10;

import Entidad.Arreglos;
import Servicio.ServicioArreglos;


public class POOej10 {

    
    public static void main(String[] args) {
        ServicioArreglos arreglo=new ServicioArreglos();
        Arreglos nuevo=new Arreglos();
        System.out.println("---------------------------");
        arreglo.crearArregloA();
        System.out.println("---------------------------");
        arreglo.ordenarA();
        System.out.println("---------------------------");
        arreglo.rellenarB();
    }
    
}
