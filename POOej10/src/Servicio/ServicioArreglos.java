
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;


public class ServicioArreglos {
    
    
    Arreglos arreglos=new Arreglos();
    
    public void crearArregloA(){
        for (int i = 0; i < arreglos.getA().length; i++) {
            arreglos.getA()[i]=(Math.random()*(20-1+1)+1);
             System.out.println(arreglos.getA()[i]);
        }
        
        }
    public void ordenarA(){
        Arrays.sort(arreglos.getA());
        
        for (int i = 0; i < arreglos.getA().length; i++) {
            System.out.println(arreglos.getA()[i]);
        }
    }
    public void rellenarB(){
        for (int i = 0; i < 10; i++) {
            arreglos.getB()[i]=arreglos.getA()[i];
            
        }
        for (int i = 10; i < arreglos.getB().length; i++) {
            arreglos.getB()[i]=0.5;
        }
        for (int i = 0; i < arreglos.getB().length; i++) {
            System.out.println("["+arreglos.getB()[i]+"]");
        }
    }
    
    }
    

