package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;

public class Dispensador10mil implements CadenaDispensamiento {
    private CadenaDispensamiento siguiente;

    private static final Integer DIEZ_MIL = 100_000;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {

        System.out.println("Cantidad en billetes de 10 mil: " + denominacion.getCantidad() / DIEZ_MIL);


        this.siguiente.asignarSiguiente(null);
        Integer cantidad = denominacion.getCantidad() - (denominacion.getCantidad() / DIEZ_MIL) * DIEZ_MIL;
        denominacion.setCantidad(cantidad);
        this.siguiente.dispensar(denominacion);

    }
}
