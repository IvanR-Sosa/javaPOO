
package ahorcadogabriel;

import Entidad.AhorcadoG;
import Servicio.ServicioAhG;

public class AhorcadoGabriel {

   
    public static void main(String[] args) {
       ServicioAhG jugar=new ServicioAhG();
       AhorcadoG juego=new AhorcadoG ();
       juego=jugar.CrearJuego();
    }
    
}
