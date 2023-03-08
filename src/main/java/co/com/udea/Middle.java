package co.com.udea;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;
import co.com.udea.sevices.impl.Dispensador100mil;
import co.com.udea.sevices.impl.Dispensador50mil;

public class Middle {

    void run (Denominacion denominacion) {
        CadenaDispensamiento next = new Dispensador100mil();

        next.asignarSiguiente(new Dispensador50mil());

        next.dispensar(denominacion);
    }

}
