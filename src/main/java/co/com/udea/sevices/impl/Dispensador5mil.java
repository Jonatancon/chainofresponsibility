package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;

public class Dispensador5mil implements CadenaDispensamiento {
    private CadenaDispensamiento siguiente;

    private static final Integer CINCO = 5_000;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = null;
    }

    @Override
    public void dispensar(Denominacion denominacion) {

        System.out.println("Cantidad en billetes de 5 mil: " + denominacion.getCantidad() / CINCO);

    }
}
