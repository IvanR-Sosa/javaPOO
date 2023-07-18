
package pooej6;

import Entidad.Cafetera;
import Servicio.cafeteraServicio;


public class POOej6 {

    
    public static void main(String[] args) {
        cafeteraServicio pedido=new cafeteraServicio();
        Cafetera cafe=new Cafetera();
        
        pedido.llenarCafetera();
        pedido.servirTaza();pedido.vaciarCafetera();pedido.agregar();
        
    }
    
}
