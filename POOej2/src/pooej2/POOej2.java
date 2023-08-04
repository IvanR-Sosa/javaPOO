
package pooej2;

import Entidad.Circunferencia;
import Servicio.Servicio;



public class POOej2 {

    
    public static void main(String[] args) {
        Servicio ej1=new Servicio();
        Circunferencia circulo=ej1.crearCircunferencia();
        System.out.println("el area del circulo es: "+ej1.area(circulo));
        System.out.println("el perimetro del circulo es: "+ej1.perimetro(circulo));
        
        
        
        
      
    }
    
}
