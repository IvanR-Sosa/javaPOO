
package Servicio;

import java.util.Scanner;
import Entidad.Libro;


public class LibroServicio {
    Scanner leer=new Scanner(System.in);
    
    public Libro cargarLibro(){
        Libro nuevo=new Libro();
        System.out.print("ingrese el ISBN del libro: ");nuevo.setISBN(leer.nextLine());
        System.out.print("ingrese el nombre del libro: ");nuevo.setTitulo(leer.nextLine());
        
        System.out.print("ingrese el autor del libro: ");nuevo.setAutor(leer.nextLine());
        System.out.print("ingrese el numero de paginas: ");nuevo.setPaginas(leer.nextInt());
        return nuevo;
    }
    public void informar(Libro nuevo){
       
        System.out.println("ISBN: "+nuevo.getISBN()+" Titulo: "+nuevo.getTitulo()+
                " Autor: "+nuevo.getAutor()+" Paginas: "+nuevo.getPaginas());
      
        
    }
    
}
