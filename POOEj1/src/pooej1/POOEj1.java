
package pooej1;

import Entidad.Libro;
import Servicio.LibroServicio;


public class POOEj1 {

    
    public static void main(String[] args) {
       LibroServicio nuevo=new LibroServicio();
       Libro libro1=nuevo.cargarLibro();
       nuevo.informar(libro1);
        Libro libro2=new Libro("23455676","josefo","pericles",23);
        
        System.out.println("libro2: "+ libro2.toString());
    }
    
}
