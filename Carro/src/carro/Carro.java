
package carro;

import Entidad.Auto;
import Servicio.Coche;

public class Carro {

   
    public static void main(String[] args) {
        
        
        Coche coche=new Coche();
        Auto auto=new Auto();
        coche.entrega(auto);
    }
    
}
