
package pooextra3;

import Entidad.Raices;
import Servicio.RaicesServicio;


public class POOextra3 {

    
    public static void main(String[] args) {
        RaicesServicio ecuacion=new RaicesServicio();
        Raices raices=ecuacion.crear();
        
        System.out.println("el discriminante es:"+ecuacion.getDiscriminante(raices));
        ecuacion.calcular(raices);
    }
    
}
