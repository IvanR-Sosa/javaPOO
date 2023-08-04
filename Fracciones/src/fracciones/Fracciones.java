
package fracciones;

import Entidad.Fraccion;
import Servicio.ServicioFraccion;


public class Fracciones {

    
    public static void main(String[] args) {
        ServicioFraccion fr=new ServicioFraccion();
        Fraccion frac=new Fraccion();
        frac=fr.mostrar();
        
    }
    
}
