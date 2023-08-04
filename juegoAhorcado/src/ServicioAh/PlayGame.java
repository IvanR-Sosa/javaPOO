
package ServicioAh;

import EntidadAh.Ahorcados;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class PlayGame {
    Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public void crearJuego(Ahorcados ahorcado){
         //definir cantidad de intentos
        System.out.print("intentos permitidos: ");ahorcado.setJugadasMaximas(leer.nextInt());
        //aqui nos encargamos de dar valores y tamaño a los vectores
        ahorcado.setEncontradas(0);
        System.out.print("ingrese la palabra con la que se va a jugar: ");
        String palabraNueva=leer.next();
        ahorcado.setPalabra(new String[palabraNueva.length()]);//aqui le estamos dando el tamaño a los 2 vectores 
        ahorcado.setOculta(new String[palabraNueva.length()]);
        for (int i = 0; i < palabraNueva.length(); i++) {
            ahorcado.getPalabra()[i]=palabraNueva.substring(i, i+1);
            ahorcado.getOculta()[i]="*";
        }
    }
   public void longitud(Ahorcados ahorcado){
       System.out.println("la longitud de la palabra es: "+ ahorcado.getPalabra().length);
   }
   public boolean buscar(Ahorcados ahorcado,String letra){
       boolean comprobar=false;
     int contador=0;//con este contador me ayudo para que recorra cada espacio del vector y verifique si se repite  
       for (int i = 0; i < ahorcado.getPalabra().length; i++) {
           if (ahorcado.getPalabra()[i].equalsIgnoreCase(letra)) {
               contador++;
               comprobar=true;
           }
       }
       if (contador==0) {
           System.out.printf("la letra %s no esta en la palabra ",letra);
       }else{ 
           System.out.printf("la letra %s esta en la palabra %d veces ",letra,contador);
       }
       return comprobar;
   }
   public boolean encontrar(Ahorcados ahorcado,String letra){
       boolean verdad=false;
       for (int i = 0; i < ahorcado.getPalabra().length; i++) {
           if (ahorcado.getPalabra()[i].equalsIgnoreCase(letra)) {
               if (ahorcado.getOculta()[i].equalsIgnoreCase("*")) {
                   ahorcado.getOculta()[i]=letra;
                   ahorcado.setEncontradas(ahorcado.getEncontradas()+1);
               }
               verdad=true;
           }
       }
       if (!verdad) {
           ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
       }
       return buscar(ahorcado,letra);/*
       este tipo de retur es para encadenar a buscar y encontrar y si se cumple en un lado o no muestre el resultado correspondiente 
       del otro
       */
   }
   public void intentos(Ahorcados ahorcado){
       int encontro=0;
       int falto=0;
       for (int i = 0; i < ahorcado.getOculta().length; i++) {
           System.out.print(ahorcado.getOculta()[i]);
       }
       for (int i = 0; i < ahorcado.getOculta().length; i++) {
           if (!ahorcado.getOculta()[i].equalsIgnoreCase("*")) {
               encontro++;
           }else{
               falto++;
           }
           System.out.println("encontro: "+encontro);
           System.out.println("faltan: "+falto);
       }
       System.out.println("");
       System.out.printf("le quedan %d intentos ",ahorcado.getJugadasMaximas());
   }
   public Ahorcados juego(){
       Ahorcados ahorcado=new Ahorcados();
       crearJuego(ahorcado);
       String letra;
       do {  
           intentos(ahorcado);System.out.println("");
           longitud(ahorcado);System.out.println("");
           System.out.println("ingrese la letra que quiere buscar");
           letra=leer.next();
           encontrar(ahorcado, letra);
       } while (ahorcado.getJugadasMaximas()!=0  && ahorcado.getEncontradas()!=ahorcado.getPalabra().length);
       System.out.println("");
       if (ahorcado.getEncontradas()==ahorcado.getPalabra().length) {
           System.out.println("Lo lograste");
       }else{
           System.out.println("no encontraste la palabra era  "+Arrays.toString(ahorcado.getPalabra()));
       }
       return ahorcado;
   }
    
}
