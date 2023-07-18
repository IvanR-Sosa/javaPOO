package pooej1;

import java.util.Scanner;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        //aqui se van a pedir los datos del libro
        System.out.print("ingrese el ISBN del libro: ");
        this.ISBN = leer.nextLine();
        System.out.print("ingrese el titulo del libro: ");
        this.titulo = leer.nextLine();
        System.out.print("ingrese el autor del libro: ");
        this.autor = leer.next();
        System.out.print("ingrese el numero de paginas del libro: ");
        this.paginas = leer.nextInt();
        System.out.println("");
    }

    public void informarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
}
