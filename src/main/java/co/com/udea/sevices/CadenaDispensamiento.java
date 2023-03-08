package co.com.udea.sevices;

import co.com.udea.model.Denominacion;

public interface CadenaDispensamiento {

    void asignarSiguiente (CadenaDispensamiento siguiente);

    void dispensar (Denominacion denominacion);
}
