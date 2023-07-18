
package Entidad;


import java.util.Scanner;


public class Operacion {
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

   public void crearOperacion(int num1,int num2){
       Scanner leer=new Scanner(System.in);
       this.num1=leer.nextInt();
       this.num2=leer.nextInt();
   }
   //suma
   public int sumar(){
       return (num1+num2);
   }
     //resta
   public int restar(){
       return (num1-num2);
   }
    //multiplicar
   public int multiplicar(){
       if (num1==0 || num2==0) {
           System.out.println("estas multiplicando por 0");
           return 0;
       }else{
           return (num1*num2);
       } 
   }
   //division
   public int dividir(){
       if (num1==0 || num2==0) {
           System.out.println("estas dividiendo por 0");
           return 0;
       }else{
           return (num1/num2);
       } 
   }
}
