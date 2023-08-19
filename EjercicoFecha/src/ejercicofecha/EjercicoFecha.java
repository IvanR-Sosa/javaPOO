
package ejercicofecha;

import Entidad.Fecha;
import Servicio.ServicioFecha;

public class EjercicoFecha {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioFecha fe=new ServicioFecha();
        Fecha date =new Fecha(1,1,1900);
        fe.cargarFecha(date);
        
    }
    
}
