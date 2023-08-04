
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;



public class Servicio {
    Scanner leer=new  Scanner(System.in);
  
    public Circunferencia crearCircunferencia(){
        Circunferencia circulo=new Circunferencia();
        System.out.print("ingrese el radio de esta circunferencia: ");circulo.setRadio(leer.nextDouble());
        
        return circulo;
    }
    public Double perimetro(Circunferencia circulo){
        Double perimetro=2*Math.PI*circulo.getRadio();
        return perimetro;
    }
    public Double area(Circunferencia circulo){
        Double area=Math.PI*(Math.pow(circulo.getRadio(), 2));
        return area;
    }
    
}
