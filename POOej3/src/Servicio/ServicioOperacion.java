
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class ServicioOperacion {
    Scanner leer=new Scanner(System.in);
    
    public Operacion cargarOperacion(){
        Operacion operar=new Operacion();
        
        System.out.print("ingrese el numero 1: ");operar.setNum1(leer.nextInt());
        System.out.print("ingrese el numero 2: ");operar.setNum2(leer.nextInt());
        return operar;
        
    }
    //suma
    public int sumar(Operacion operar){
        return (operar.getNum1()+operar.getNum2());
    }
    //resta
     public int restar(Operacion operar){
        return (operar.getNum1()-operar.getNum2());
    }
     //multiplicacion
      public int multiplicar(Operacion operar){
        return (operar.getNum1()*operar.getNum2());
    }
      //division
      public int dividir(Operacion operar){
          if (operar.getNum1()==0 || operar.getNum2()==0) {
              System.out.println("no se puede dividir por 0");
              return 0;
              
          }else{
              return (operar.getNum1()/operar.getNum2());
          }
      }
}
