
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;


public class ServicioFraccion {
    
    Scanner leer=new Scanner (System.in);
    
    public void crearFraccion(Fraccion fraccion){
        
        System.out.print("ingrese el denominador 1: ");fraccion.setDenominador1(leer.nextInt());
        System.out.print("ingrese el numerador 1: ");fraccion.setNumerador1(leer.nextInt());
        System.out.print("ingrese el denominador 2: ");fraccion.setDenominador2(leer.nextInt());
        System.out.print("ingrese el numerador 2: ");fraccion.setNumerador2(leer.nextInt());
        
        
    }
    public void suma(Fraccion fraccion){
        int sumaDeno;
        int sumaNume;
        
        if (fraccion.getDenominador1()==fraccion.getDenominador2()) {
            sumaDeno=fraccion.getDenominador1();
            sumaNume=(fraccion.getNumerador1()+fraccion.getNumerador2());
        }else{
            sumaDeno=(fraccion.getDenominador1()*fraccion.getDenominador2());
            sumaNume=(fraccion.getNumerador1()*fraccion.getDenominador2())+(fraccion.getNumerador2()*fraccion.getDenominador1());
        }
        System.out.printf("la suma de fraciones es\n numerador: %d \n denominador: %d",sumaNume,sumaDeno);
    }
    public void resta(Fraccion fraccion){
        int restaDeno,restaNume,por0=0;
         if (fraccion.getDenominador1()==fraccion.getDenominador2()) {
            restaDeno=fraccion.getDenominador1();
            restaNume=(fraccion.getNumerador1()-fraccion.getNumerador2());
        }else{
            restaDeno=(fraccion.getDenominador1()*fraccion.getDenominador2());
            restaNume=(fraccion.getNumerador1()*fraccion.getDenominador2())-(fraccion.getNumerador2()*fraccion.getDenominador1());
        }
         if (restaNume==0) {
             System.out.println("la resta de la fraccion es: "+por0);
        }else{
             System.out.printf("la suma de fraciones es\n numerador: %d \n denominador: %d",restaNume,restaDeno);
         }
    }
    public void multiplicar(Fraccion fraccion){
        int multDeno,multNume,por0=0;
        multDeno=(fraccion.getDenominador1()*fraccion.getDenominador2());
        multNume=(fraccion.getNumerador1()*fraccion.getNumerador2());
        if (multNume==0) {
             System.out.println("la resta de la fraccion es: "+por0);
        }else{
             System.out.printf("la suma de fraciones es\n numerador: %d \n denominador: %d",multNume,multDeno);
         }    
    }
    public void dividir(Fraccion fraccion){
        int divDeno,divNume,por0=0;
        divDeno=(fraccion.getDenominador1()*fraccion.getNumerador2());
        divNume=(fraccion.getNumerador1()*fraccion.getDenominador2());
        if (divNume==0) {
             System.out.println("la resta de la fraccion es: "+por0);
        }else{
             System.out.printf("la suma de fraciones es\n numerador: %d \n denominador: %d",divNume,divDeno);
         }    
    }
    public Fraccion mostrar(){
        Fraccion fraccion=new Fraccion();
        crearFraccion(fraccion);
        int opcion=0;
        do {     
            System.out.println("");
            System.out.println("-----menu de operaciones------\n"
                    + "-----1:SUMA-----\n-----2:RESTA-----\n-----3:MULTIPLICAR-----\n-----4:DIVIDIR-----\n"
                    + "-----5:SALIR-----\nacontinuacion ingrese el numero de opcion que desea ejecutar");
            opcion=leer.nextInt();
            switch(opcion){
                    case 1:
                        suma(fraccion);
                        break;
                    case 2:
                        resta(fraccion);break;
                    case 3:
                        multiplicar(fraccion);break;
                    case 4:
                        dividir(fraccion);break;
            }
        } while (opcion!=5);
        if (opcion==5) {
            System.out.println("GRACIAS POR PARTICIPAR");
        }
        return fraccion;
    }
}
    
    
