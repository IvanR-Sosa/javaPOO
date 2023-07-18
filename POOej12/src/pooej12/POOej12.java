
package pooej12;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;


public class POOej12 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Persona p1=new Persona();
        ServicioPersona persona=new ServicioPersona();
        
        System.out.println("-----------------------------------------------");
        p1=persona.CrearPersona();
        persona.calcularEdad(p1);
        System.out.println("con que edad lo desea comparar: ");int edad=sc.nextInt();
        System.out.println("la persona edad es menor que la persona: "+persona.menorQue(p1, edad, edad));
        System.out.println("-----------------------------------------------");
        Persona p2=persona.CrearPersona();
        System.out.println("-----------------------------------------------");
        System.out.println(p1.toString()+"\n"+p2.toString());
    }
    
}
