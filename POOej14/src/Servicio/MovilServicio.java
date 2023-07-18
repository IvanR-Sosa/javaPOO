
package Servicio;

import Entidad.Movil;
import java.util.Scanner;


public class MovilServicio {
    Scanner leer=new Scanner(System.in);
    
    public Movil cargarCelular(){
        Movil phone=new Movil();
        //voy a rellenar los distintos atributos del movil
        //ATRIBUTOS:marca, precio, modelo, memoriaRam, almacenamiento
        System.out.print("Marca: ");phone.setMarca(leer.nextLine());
        System.out.print("Modelo: ");phone.setModelo(leer.nextLine());
        System.out.print("Memoria Ram: ");phone.setMemoriaRam(leer.nextDouble());
        System.out.print("Almacenamiento: ");phone.setAlmacenamiento(leer.nextDouble());
        
        return phone;
    }
    public void ingresarCodigo(Movil phone){
        phone=cargarCelular();
        for (int i = 0; i < phone.getCodigo().length; i++) {
            System.out.print("numeros disponibles: ");phone.getCodigo()[i]=leer.nextInt();
        }
    }
    
}
