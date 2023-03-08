package co.com.udea.model;

import co.com.udea.exeption.DenominacionExeption;

public class Denominacion {

    public Denominacion(Integer cantidad) {
        if (cantidad <= 0 || cantidad % 5000 != 0) {
            throw new DenominacionExeption("Error en la cantidad ingresada, por favor ingrese una cantidad multiplo de 5");
        }
        this.cantidad = cantidad;
    }

    private Integer cantidad;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
