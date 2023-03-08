package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;

public class Dispensador100mil implements CadenaDispensamiento {

    private static final Integer CIEN = 100_000;
    private CadenaDispensamiento siguiente; //  siguiente 50

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {


        System.out.println("Cantidad en billetes de 100 mil: " + denominacion.getCantidad() / CIEN);

        this.siguiente.asignarSiguiente(new Dispensador20mil());
        Integer cantidad = denominacion.getCantidad() - (denominacion.getCantidad() / CIEN) * CIEN;
        denominacion.setCantidad(cantidad);
        this.siguiente.dispensar(denominacion);
    }

}
