
package pooextra1;

import Entidad.Cancion;
import java.util.Scanner;


public class POOextra1 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cancion temaso=new Cancion();
        System.out.println("el nombre del tema es: ");
        temaso.setNombre(leer.nextLine());
        System.out.println("quien canta este tema: ");
        temaso.setAutor(leer.nextLine());
        
        System.out.println("--"+temaso.toString());
    }
    
}
