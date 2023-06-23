
package pooej01;

import Entidad.Persona;


import java.util.Scanner;


public class POOEj01 {

    
    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in);
        Persona persona1=new Persona();
        persona1.setNombre("Ivan");
        
        Persona persona2=new Persona();
        persona2.setNombre(leer.next());
        persona2.getNombre();
        
        
        Persona persona3 = new Persona();
        crearPersona(persona3);
        
        System.out.println("p1 "+persona1.getNombre());
        System.out.println("p2 "+persona2.getNombre());
        System.out.println("p3 "+persona3.getNombre());
         
    }
    public static void crearPersona(Persona persona3){
        System.out.println("Nombre: " + persona3.getNombre());
    }
  
}
