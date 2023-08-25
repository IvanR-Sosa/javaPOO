package Servicio;

import Entidad.Sopa;
import java.util.*;

public class Letras {

    Scanner leer = new Scanner(System.in);

    public void crear(Sopa sopa) {
//aqui creo las palabras para setear el vector luego defino el tamaño de la matriz
        String[] letras = {"perro", "gato", "vaca", "zorro", "toro"};
        sopa.setMatriz(new String[10][10]);
        String abc = "abcdefghijklmnñopqrstuvwxyz".toUpperCase();//esta variable se crea para poder rellenar posteriormente la matriz
        String palabra = "";//esta la uso para crear una variable que voy a usar por parametro en un metodo
        sopa.setPalabras(letras);

        ingreso(sopa, letras);
        reemplazo(sopa);
        cargaSopa(sopa, abc);

        int[] file = new int[10];
        HashSet<Integer> usados = new HashSet<Integer>();
        /*
        segun entendi el HashSet funciona para almacenar y acceder en este caso lo voy a usar para 
        almacenar los numeros que se van a convertir en la poscion de la fila y despues verificar que no se repitan
         */
        Random fila = new Random();/*en este caso uso el random lo uso para hacer que la posicion de las filas en
        que necesito poner las palabras sea aleatoria*/
        for (int i = 0; i < file.length; i++) {
            int num = fila.nextInt(10);//aqui en num almaceno los valores que me arroje el Random
            if (usados.contains(num)) {/*
                con esta parte creo la condicion para evitar que se repita lo que hago es decirle que si el numero ya esta cree un
                for y busque el numero que mas cercano que no este que va a ser igualado con j
                 */
                for (int j = 0; j < 10; j++) {
                    if (!usados.contains(j)) {
                        num = j;
                        break;
                    }
                }
            }
            file[i] = num;
            usados.add(num);
        }

        for (int i = 0; i < file.length; i++) {
            System.out.println(file[i]);
        }

        for (int i = 0; i < sopa.getPalabras().length; i++) {
            int c = (int) (Math.random() * 6);//genero una posicion aleatoria en las columnas para ubicarlas en diferentes lugares

            palabra = sopa.getPalabras()[i];//aqui lo que hago es darle valor a la palabra con cada posicion del vector que contiene las palabras
            paso(sopa, palabra, file[i], c);

        }
        mostrar(sopa);
        System.out.println("las palabras a buscar son:");
        for (int i = 0; i < sopa.getPalabras().length; i++) {
            System.out.println("[" + sopa.getPalabras()[i] + "]");
        }

    }

    public void paso(Sopa sopa, String palabra, int fila, int columna) {
        /*
        con este metodo lo que hago es darle una posicion tanto en filas como en columnas a las palabras 
        que necesito buscar aqui ya uso la palabra las filas y las columnas cuyo valor se definio arriba
         */
        for (int i = 0; i < palabra.length(); i++) {
            sopa.getMatriz()[fila][columna + i] = "" + palabra.charAt(i);
            //este charAt es paara que los coloque posicion por posicion por eso a columna le sumo i
        }
    }

    public void cargaSopa(Sopa sopa, String abc) {
        /*
        este metodo usa el abc=abecedario para rellenar la matriz el index se usa para recorrer el 
        tamaño total de esa variable por eso se hace con el abc.length y despues lo que se hace es ubicar cada letra en la posicion
        [i][j](la letra se escoge al azar debido a lo anterior y al substring que parte toda la variable de 1 en 1
        */
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            for (int j = 0; j < sopa.getMatriz().length; j++) {

                int index = (int) (Math.random() * abc.length());
                sopa.getMatriz()[i][j] = abc.substring(index, index + 1);
            }

        }
    }

    public void mostrar(Sopa sopa) {
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            for (int j = 0; j < sopa.getMatriz().length; j++) {

                System.out.print("[" + sopa.getMatriz()[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("#####################################################################\nSOPA INVERTIDA\n");
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            for (int j = 0; j < sopa.getMatriz().length; j++) {

                System.out.print("[" + sopa.getMatriz()[j][i] + "]");
            }
            System.out.println("");
        }
    }

    public void ingreso(Sopa sopa, String[] letras) {
        String opc = "";
        String nuevaPalabra = "";
        do {
            System.out.println("desea añadir una palabra?\n si\n no");
            opc = leer.next();

        } while (!opc.equalsIgnoreCase("si") && !opc.equalsIgnoreCase("no"));

        System.out.println("---------------------------------------------");
        /*
como en mi caso solo quiero añadir una palabra por eso a este nuevo vector le doy tamaño de el que tiene las otras palabras +1*/
        String nuevoLetras[] = new String[letras.length + 1];
        if (opc.equalsIgnoreCase("si")) {
            System.out.println("ingrese la nueva palabra:");
            nuevaPalabra = leer.next();
            /*
            aqui lo que hago es asignarle los valores para que queden iguales con el otro vector por eso lo llame como parametro
            y en la nueva posicion ques es el mismo valor que el tamaño solo coloco la palabra nueva
            */
            for (int i = 0; i < letras.length; i++) {
                nuevoLetras[i] = letras[i];
            }
            nuevoLetras[letras.length] = nuevaPalabra;
            sopa.setPalabras(nuevoLetras);

        } else {
            sopa.setPalabras(letras);
            System.out.println("continuemos");
        }
    }

    public void reemplazo(Sopa sopa) {
        String opc = "";
        do {
            System.out.println("desea reemplazar una palabra?\n si\n no");
            opc = leer.next();

        } while (!opc.equalsIgnoreCase("si") && !opc.equalsIgnoreCase("no"));
/*
        aqui lo que hago es crear la palabra que voy a reeplazar y averiguando el tamaño lo que hago
        es decirle donde va a quedar para eso uso el for donde igualo posicion y valor de i(en este caso la posicion de la 
        palabra dentro del vector y ya solo reemplazo
        */
        if (opc.equalsIgnoreCase("si")) {
            int posicion = -1;
            System.out.println("ingrese la palabra de reemplazo");
            String reem = leer.next();
            do {
                System.out.println("ingrese la posicion de reemplazo entre 0 y " + (sopa.getPalabras().length - 1));
                posicion = leer.nextInt();
            } while (posicion < 0 || posicion > sopa.getPalabras().length);
            for (int i = 0; i < sopa.getPalabras().length; i++) {
                if (i == posicion) {
                    sopa.getPalabras()[i] = reem;
                }
            }

        } else if (opc.equalsIgnoreCase("no")) {
            System.out.println("continuemos");
        }
    }
}
