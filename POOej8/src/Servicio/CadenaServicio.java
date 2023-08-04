package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    Scanner leer=new Scanner(System.in);    
    Cadena cadena = new Cadena();
  
    public void mostrarVocales(Cadena cadena) {//aqui se esta llamando lo almacenado en la clase cadena en el atributo frase
        int count = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == 'a' || cadena.getFrase().charAt(i) == 'e'
                    || cadena.getFrase().charAt(i) == 'i' || cadena.getFrase().charAt(i) == 'o'
                    || cadena.getFrase().charAt(i) == 'u') {

                count++;
            }

        }

        System.out.println("La cantidad de vocales es: " + count);
    }

    public void invertirFrase(Cadena cadena) {
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {

            System.out.print(" " + cadena.getFrase().charAt(i));
        }

    }

    public void vecesRepetido(String letra,Cadena cadena){
        int contador=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i)==letra.charAt(0)) {
                contador++;
            }
        }
         System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }
  
    public void compararLongitud(String nuevaFrase,Cadena cadena){
       
        
        if (cadena.getLongitud()==nuevaFrase.length()) {
            System.out.println("el tamaño de las cadenas es igual y es "+nuevaFrase.length());
            
        }else{
            System.out.println("las cadenas tienen tamaños distintos");
        }
    }
   
    public void unirFrase(String nuevaFrase,Cadena cadena){
        String union=cadena.getFrase().concat(nuevaFrase);
        System.out.println(union);
    }
    public void reemplazar(Cadena cadena){
        System.out.println("que letra va a reemplazar");
        
        String letra2=leer.next();
       String reemplazo=cadena.getFrase().replace(letra2, "@");
        System.out.println(reemplazo);
     
    }
    public boolean contiene(Cadena cadena){
        System.out.println("que letra desea buscar");
        String buscar=leer.next();
        boolean contenido=false;
        if (cadena.getFrase().contains(buscar)) {
            contenido =true;
        }else {
            contenido =false;
        }
        System.out.println("la letra esta contenida ?: "+ contenido);
        return contenido;
    }
    }
