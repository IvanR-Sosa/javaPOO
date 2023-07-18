
package Entidad;

public class Movil {
    //ATRIBUTOS:marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será.un arreglo numérico de dimensión 7 (siete)

    private String marca;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int []codigo=new int [7];
    //constructor por defecto y lleno

    public Movil() {
    }

    public Movil(String marca, String modelo, double memoriaRam, double almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }
    //getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
}
