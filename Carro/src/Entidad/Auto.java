
package Entidad;

import java.util.Date;

public class Auto {
    
    private String propietario;
    private Date carnet_venc;
    private String color;
    private int modelo;
    private int km_recorrido=7500;

    public Auto() {
    }

    public Auto(String propietario, Date carnet_venc, String color, int modelo, int km_recorrido) {
        this.propietario = propietario;
        this.carnet_venc = carnet_venc;
        this.color = color;
        this.modelo = modelo;
        this.km_recorrido = km_recorrido;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getCarnet_venc() {
        return carnet_venc;
    }

    public void setCarnet_venc(Date carnet_venc) {
        this.carnet_venc = carnet_venc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKm_recorrido() {
        return km_recorrido;
    }

    public void setKm_recorrido(int km_recorrido) {
        this.km_recorrido = km_recorrido;
    }

    

}
