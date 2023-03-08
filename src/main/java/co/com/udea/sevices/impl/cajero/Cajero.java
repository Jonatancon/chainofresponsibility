package co.com.udea.sevices.impl.cajero;

import co.com.udea.model.Denominacion;
import co.com.udea.sevices.CadenaDispensamiento;
import co.com.udea.sevices.impl.Dispensador100mil;
import co.com.udea.sevices.impl.Dispensador10mil;
import co.com.udea.sevices.impl.Dispensador20mil;
import co.com.udea.sevices.impl.Dispensador50mil;
import co.com.udea.sevices.impl.Dispensador5mil;

public class Cajero extends CadenaDispensamiento {


    @Override
    public void dispensar(Denominacion denominacion) {
        link(
                new Dispensador100mil(),
                new Dispensador50mil(),
                new Dispensador20mil(),
                new Dispensador10mil(),
                new Dispensador5mil()
        );

        getCadenaDispensamiento().dispensar(denominacion);
    }

    private void link(CadenaDispensamiento first, CadenaDispensamiento... cadenaDispensamientos) {
        CadenaDispensamiento head = first;
        setCadenaDispensamiento(first);
        for (CadenaDispensamiento cadena : cadenaDispensamientos) {
            head.setCadenaDispensamiento(cadena);
            head = cadena;
        }
    }
}
