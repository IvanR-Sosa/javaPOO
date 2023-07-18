
package pooej1;


public class POOEj1 {

    
    public static void main(String[] args) {
        Libro libro1=new Libro(); 
         libro1.cargarLibro();
         libro1.informarLibro();
        Libro libro2=new Libro("23455676","josefo","pericles",23);
        
        System.out.println("libro2: "+ libro2.toString());
    }
    
}
