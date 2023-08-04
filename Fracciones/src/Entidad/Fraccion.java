
package Entidad;


public class Fraccion {
    private Integer denominador1;
    private Integer numerador1;
    private Integer denominador2;
    private Integer numerador2;

    public Fraccion() {
    }

    public Fraccion(Integer denominador1, Integer numerador1, Integer denominador2, Integer numerador2) {
        this.denominador1 = denominador1;
        this.numerador1 = numerador1;
        this.denominador2 = denominador2;
        this.numerador2 = numerador2;
    }

    public Integer getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(Integer denominador1) {
        this.denominador1 = denominador1;
    }

    public Integer getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(Integer numerador1) {
        this.numerador1 = numerador1;
    }

    public Integer getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(Integer denominador2) {
        this.denominador2 = denominador2;
    }

    public Integer getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(Integer numerador2) {
        this.numerador2 = numerador2;
    }
    
    
    
}
