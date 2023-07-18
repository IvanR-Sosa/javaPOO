
package pooej4;

import Entidad.Rectangulo;


public class POOej4 {

   
    public static void main(String[] args) {
        
        Rectangulo llamar=new Rectangulo();
        llamar.crearRectangulo();
        System.out.println("la superficie del rectangulo es: "+llamar.superficie());
        System.out.println("el perimetro del rectangulo es: "+llamar.perimetro());
        
        llamar.dibujar();
    }
    
}
