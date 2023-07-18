
package Servicio;

import Entidad.Matematicas;


public class MatematicasServicio {
    Matematicas mates =new Matematicas();
    
    public void devolverMayor(Matematicas num1,Matematicas num2){
        
      double mayor;
      mayor=Math.max(num1.getNum1(), num2.getNum2());
        System.out.println("el numero mayor es: "+mayor);
    }
    public void calcularPotencia(Matematicas num1,Matematicas num2){
        double mayor,menor;
        mayor=Math.max(num1.getNum1(), num2.getNum2());
        menor=Math.min(num1.getNum1(), num2.getNum2());
        int mayor1,mayor2;
        mayor1=(int) Math.round(mayor);
        mayor2=(int) Math.round(menor);
        int potencia;
        potencia=(int) Math.pow(mayor1, mayor2);
        
        System.out.println("la potencia del numero mayor por el numero menor es: "+potencia);
        
    }
    public void calcularRaiz(Matematicas num1,Matematicas num2){
        double menor;
        menor=Math.min(num1.getNum1(), num2.getNum2());
        double absoluto=Math.abs(menor);
        System.out.println("valor absoluto: "+absoluto);
        
        double raiz=Math.sqrt(absoluto);
        System.out.println("la raiz cuadrada es: "+raiz);
        
        
    }
    
}
