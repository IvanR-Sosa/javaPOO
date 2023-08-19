
package Entidad;

 
public class Fecha {
    private int dia;
    private int mes; 
    private int anio;
    private String meses;

    public Fecha(String meses) {
        this.meses = meses;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public Fecha(int dia, int mes, int anio, String meses) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.meses = meses;
    }
    public Fecha() {
        this.dia = 01;
        this.mes = 01;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

}
