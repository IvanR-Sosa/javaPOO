
package Entidad;

import java.util.Scanner;


public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
    private Scanner leer=new Scanner(System.in);
    
    public void crearRectangulo(){
        System.out.print("ingrese la base del rectangulo: ");
        this.base=leer.nextInt();
        System.out.print("ingrese la altura del rectangulo: ");
        this.altura=leer.nextInt();
        
    }
    //hallar la superficie
    public int superficie(){
       
        return (base*altura);
    }
    //hallar el perimetro
    public int perimetro(){
        int perimetro=(base+altura)*2;
        System.out.println("el perimetro es: "+ perimetro);
        return perimetro; 
    }
    //dibujar el rectangulo
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 || j==0 || j==base-1 ) {
                   System.out.print(" *"); 
                }else{
                    System.out.print("  ");
                }
              
            }
            System.out.println("");
        }
    }
    
}
