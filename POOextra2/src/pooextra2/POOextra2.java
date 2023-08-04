
package pooextra2;

import Entidad.Puntos;
import Servicio.PuntosServicio;


public class POOextra2 {

    
    public static void main(String[] args) {
        
        PuntosServicio dis=new PuntosServicio();
        
        Puntos punto=dis.crearPuntos();
        
        System.out.println("la distancia es: "+ dis.calcularDistancia(punto));
    }
    
}
