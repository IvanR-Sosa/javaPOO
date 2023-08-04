
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;


public class PuntosServicio {
    Scanner leer=new Scanner (System.in);
    
    public Puntos crearPuntos(){/*recordatorio:si necesito crear el objeto o almacenar o hacer que me guarde no puede ser un void 
        porque el void no retorna y al final me va a dar un error para eso creo el metodo llamando
        una clase para poder hacer que me retorne un valor (en mis palabras para que almacene algo, para que si cree el objeto 
        */
        Puntos puntos=new Puntos();
        
        System.out.print("ingrese el valor de x1: ");
        puntos.setX1(leer.nextDouble());
        System.out.print("ingrese el valor de y1: ");
        puntos.setY1(leer.nextDouble());
        System.out.print("ingrese el valor de x2: ");
        puntos.setX2(leer.nextDouble());
        System.out.print("ingrese el valor de y2: ");
        puntos.setY2(leer.nextDouble());
        return puntos;
    }
    public Double calcularDistancia(Puntos puntos){
        Double distancia;
        Double p1=Math.pow(puntos.getX2()-puntos.getX1(), 2);
        Double p2=Math.pow(puntos.getY2()-puntos.getY1(), 2);
        distancia=Math.sqrt((p1+p2));
        
        return distancia;
    }
}
