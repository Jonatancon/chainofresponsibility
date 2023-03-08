package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;

public class Dispensador50mil implements CadenaDispensamiento {
    private CadenaDispensamiento siguiente; //20

    private static final Integer CINCUENTA = 50_000;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {


        System.out.println("Cantidad en billetes de 50 mil: " + denominacion.getCantidad() / CINCUENTA);

        this.siguiente.asignarSiguiente(new Dispensador10mil());
        Integer cantidad = denominacion.getCantidad() - (denominacion.getCantidad() / CINCUENTA) * CINCUENTA;
        denominacion.setCantidad(cantidad);
        this.siguiente.dispensar(denominacion);

    }
}
