
package hora;

import Entidad.Tiempo;
import Servicio.ServicioTiempo;




public class Hora {

    
    public static void main(String[] args) throws InterruptedException {
        ServicioTiempo nuevo=new ServicioTiempo();
        Tiempo time=new Tiempo();
        //time=nuevo.imprimirHora();
        //nuevo.corre(time);
        
        nuevo.real(time);
        
  }
    
    
    
}
