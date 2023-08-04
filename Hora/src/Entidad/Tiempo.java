
package Entidad;


public class Tiempo {
private Integer horas;
private Integer minutos;
private Integer segundos;

    public Tiempo() {
        
    }
    public Tiempo(Integer horas, Integer minutos, Integer segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
 
}
