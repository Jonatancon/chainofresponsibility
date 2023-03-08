package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;

public class Dispensador20mil implements CadenaDispensamiento {
    private CadenaDispensamiento siguiente; // 10

    private static final Integer VEINTE = 20_000;

    @Override
    public void asignarSiguiente(CadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Denominacion denominacion) {


        System.out.println("Cantidad en billetes de 20 mil: " + denominacion.getCantidad() / VEINTE);


        this.siguiente.asignarSiguiente(new Dispensador5mil());
        Integer cantidad = denominacion.getCantidad() - (denominacion.getCantidad() / VEINTE) * VEINTE;
        denominacion.setCantidad(cantidad);
        this.siguiente.dispensar(denominacion);
    }
}
