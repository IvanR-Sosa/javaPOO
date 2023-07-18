
package Servicio;

import java.util.Scanner;
import pooej2.Circunferenca;


public class Servicio {
    Scanner leer=new  Scanner(System.in);
    Circunferenca Circulo=new Circunferenca();
    
    public Circunferenca crearCircunferencia(){
        System.out.println("ingrese radio");
        Circulo.setRadio(leer.nextDouble());
        return Circulo;  
    }
    public Circunferenca area(){
       
        Double area;
        area=Math.PI*(Math.pow(Circulo.getRadio(),2));
        System.out.println("el area es: "+ area);
         
        return Circulo;
    }
    public Circunferenca perimetro(){
       
        Double perimetro;
        perimetro=Math.PI*(Math.pow(Circulo.getRadio(),2));
        System.out.println("el area es: "+ perimetro);
         
        return Circulo;
    }
    
}
