package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();

    public void crearPersona() {
        /*
        con  este metodo vamos a dar valor a todos los 
        atributos creados en entidad
         */
        System.out.print("ingrese el nombre: ");
        persona.setNombre(leer.next());
        System.out.print("ingrese la edad: ");
        persona.setEdad(leer.nextInt());

        do {            //es do es para hacer que si se equivioca de opcion la pueda volver a intorducir
            System.out.print("ingrese sexo H:masculino-F:femenino-O:otro  ");
            persona.setSexo(leer.next());
            
           
        } while (!persona.getSexo().equalsIgnoreCase("H") && !persona.getSexo().equalsIgnoreCase("f") && !persona.getSexo().equalsIgnoreCase("O"));
        
        if (persona.getSexo().equalsIgnoreCase("h")) {
                System.out.println("usted se identifica como hombre");
            }else if (persona.getSexo().equalsIgnoreCase("f")) {
                System.out.println("usted se identifica como mujer");
            }else if (persona.getSexo().equalsIgnoreCase("o")) {
                System.out.println("usted no se identifica ni como hombre ni como mujer");
            }
        System.out.print("ingrese el peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.print("ingrese la altura: ");
        persona.setAltura(leer.nextDouble());

    }
    
    public double calcularIMC(){
         double imc = 0;
        imc=persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        System.out.println("tu IMC es: "+imc);
        if (imc<20) {
            System.out.println("por debajo del peso ideal");
            return -1;
        }else if (imc>=20 && imc<=25) {
            System.out.println("estas en tu peso ideal");
            return 0;
        }else if (imc>25) {
            System.out.println("tienes sobrepeso");
            return 1;
        }
        return imc;
        
    }
    
    public boolean mayorEdad(){
        boolean edad = false;
        if (persona.getEdad()>0 && persona.getEdad()<18) {
            System.out.println("es usted menor de edad");
            edad= false;
        }else if (persona.getEdad()>=18) {
            System.out.println("es usted mayor de edad");
            edad=true;
        }
        return edad;
        
    }

}
