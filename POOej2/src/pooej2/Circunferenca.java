
package pooej2;

import java.util.Scanner;


public class Circunferenca {

       private double radio;

    public Circunferenca() {
    }
    

    public Circunferenca(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.print("ingrese el radio de la circunferencia: ");
        double radio=leer.nextDouble();
        this.setRadio(radio);
        System.out.println("");
        
    }
    
    public double perimetro(){
        return (2*Math.PI*radio);
    } 
    
}
