package pooej8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class POOej8 {

    public static void main(String[] args) {
        CadenaServicio chain = new CadenaServicio();
        Scanner leer = new Scanner(System.in);
        Cadena cadena = new Cadena();

        System.out.print("Ingrese una frase: ");
        cadena.setFrase(leer.next());

        System.out.println("--------------------------");
 
        chain.mostrarVocales(cadena);
        System.out.println("-------------------------------");
      
        chain.invertirFrase(cadena);
        System.out.println("---------------------------------");
       
        System.out.println("ingrese una letra");
        String letra = leer.next();
        chain.vecesRepetido(letra, cadena);
        System.out.println("-------------------------------------");
     
        String nuevaFrase;
        System.out.println("ingrese la frase a comparar");
        nuevaFrase=leer.next();
        chain.compararLongitud(nuevaFrase,cadena);
        System.out.println("--------------------------------------");
        
        chain.unirFrase(nuevaFrase, cadena);
        System.out.println("---------------------------------------");
        chain.reemplazar(cadena);
        System.out.println("----------------------------------------");
        chain.contiene(cadena);
        
        
    }

}
