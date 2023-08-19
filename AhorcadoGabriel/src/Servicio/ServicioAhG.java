
package Servicio;

import Entidad.AhorcadoG;
import java.util.Arrays;
import java.util.Scanner;

 
public class ServicioAhG {
    public AhorcadoG CrearJuego(){
        
        AhorcadoG ah = new AhorcadoG();
        
        //Seteo de palabras para el juego
        String [] listaPalabras = {"auto", "casa", "perro", "martillo"};
    
        //Elijo una posicion al azar, o que el usuario elija una posición al azar
        int posicion = (int) (Math.random() * listaPalabras.length );
        
        //Creo el vector para guardar la palabra elegida, y luego lo inicialozo con la palabra aleatoria segun la posición
        //Esto es como haber consultado al usuasio por una palabra y sacarle el tamaño a esa palabra y generara un vector con eso
        //palabraElegida = new String [listaPalabras[posicion].length()]; 
        String palabraElegida;
        palabraElegida = listaPalabras[posicion]; 
        
        //XXXXXXXXXXXXX
        //Creo un arreglo para cumplir con el enunciado, le copio letra por letra, y lo paso luego como parametro.
        //XXXXXXXXXXXXX
        String [] palabraElegidaVec = new String[palabraElegida.length()];
        
        System.out.println("*************************************************************************");
        System.out.println("*************************BIENVENIDO AL AHORCADO**************************");
        System.out.println("*************************************************************************");
        System.out.println("Hay una lista de palabras predefinidas, que tiene" + listaPalabras.length + " palabras.") ;
        System.out.println("");
        System.out.println("El sistema elegirá una al azar, simulando que Ud. ingresó una palabra.");
        System.out.println("");
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de intentos que desea tener para adivinar la palabra: ");
        ah.setJugadasMax(leer.nextInt()); 
        
        //Le seteo el tamaño a los dos vectores (atributos), tomando como base la longntud de la palabra elegida "palabraElegida".
        ah.setPalabra(new String[palabraElegida.length()]);
        ah.setOculta(new String [palabraElegida.length()]);        
        
        //Copio letra a letra, la palabre elegida hacia el vector con la palabra             
        for (int i = 0; i < palabraElegida.length(); i++) {
            palabraElegidaVec[i] = palabraElegida.substring(i, i+1);
        }
        
        ah.setPalabra(palabraElegidaVec);
        palabraElegidaVec=ah.getPalabra();
        
        System.out.println("palabra elegida: " + Arrays.toString(palabraElegidaVec));  
        System.out.println(listaPalabras[posicion]);
        
        for (int i = 0; i < palabraElegidaVec.length; i++) {
            System.out.println(palabraElegidaVec[i]);            
        }
        
        return ah;
    } 

}
