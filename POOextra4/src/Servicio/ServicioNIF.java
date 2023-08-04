
package Servicio;

import Entidad.NIF;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ServicioNIF {
    Scanner leer=new Scanner(System.in);
    
    public NIF crearNif(){
        NIF nuevo =new NIF ();
        do {            
            System.out.println("ingrese el DNI: ");
            nuevo.setDNI(leer.nextInt());
        } while (!Pattern.matches("\\d{1,8}",nuevo.getDNI().toString()));
        /*
        (!Pattern.matches("\\d{1,8}",nuevo.getDNI().toString()));
        con este tipo de funcion podemos condicionar para que la cantidad de digitos que ingresemos 
        este en un rango que queramos
        */
        
        int clave=nuevo.getDNI()%23;
        System.out.println(clave);
        
        for (int i = 0; i < nuevo.getLetras().length; i++) {
            if (i==clave) {
                System.out.println(String.format("%08d",nuevo.getDNI())+"-"+nuevo.getLetras()[i]);
                /*
                String.format("%08d",nuevo.getDNI());
                este metodo me ayuda a que se impriman los 0(cero) a la izquierda 
                */
            }
        }
        
        return nuevo;
    }
    
}
