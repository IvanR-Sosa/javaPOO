
package Servicio;

import Entidad.Meses;
import java.util.Scanner;


public class ServicioMes {
    Scanner leer =new Scanner (System.in);
    
    public Meses buscar(){
        Meses adivinar =new Meses();
        String intentar; 
        
        do {            
            System.out.println("intenta adivinar el mes secreto");
            intentar=leer.next();
           
           if (intentar.equalsIgnoreCase(adivinar.getMesSecreto())) {
                    System.out.println("lo lograste");
                }else{
                    System.out.println("vamos de nuevo");
                }
        } while (!intentar.equalsIgnoreCase(adivinar.getMesSecreto()));
        return adivinar;
     
    }
    
}
