
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


public class ServicioRectangulo {
    Scanner leer=new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo rectangulo=new Rectangulo();
        System.out.print("ingrese la altura del rectangulo: ");rectangulo.setAltura(leer.nextInt());
        System.out.print("ingrese la base del rectangulo: ");rectangulo.setBase(leer.nextInt());
        return rectangulo;
    }
    public int superficie(Rectangulo rectangulo){
        return (rectangulo.getAltura()*rectangulo.getBase());
    }
    public int  perimetro(Rectangulo rectangulo){
        return (rectangulo.getBase()+rectangulo.getAltura())*2;
    }
    public void dibujar(Rectangulo rectangulo){
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i==0 || i==rectangulo.getAltura()-1 || j==0 || j==rectangulo.getBase()-1) {
                    System.out.print(" *");
                }else{System.out.print("  ");}
                
            }
            System.out.println("");
        }
    }
}
