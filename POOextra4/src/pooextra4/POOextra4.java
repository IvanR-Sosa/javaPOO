
package pooextra4;

import Entidad.NIF;
import Servicio.ServicioNIF;


public class POOextra4 {

    
    public static void main(String[] args) {
        ServicioNIF nuevo=new ServicioNIF();
        NIF otro=new NIF();
        otro=nuevo.crearNif();
    }
    
}
