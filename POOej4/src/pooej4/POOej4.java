
package pooej4;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;


public class POOej4 {

   
    public static void main(String[] args) {
        ServicioRectangulo recta=new ServicioRectangulo();
        Rectangulo llamar=new Rectangulo();
        llamar=recta.crearRectangulo();
        System.out.println("el perimetro es: "+recta.perimetro(llamar));
        System.out.println("la superficie es: "+recta.superficie(llamar));
        recta.dibujar(llamar);
    }
    
}
