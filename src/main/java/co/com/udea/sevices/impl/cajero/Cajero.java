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
        Dispensador100mil cien = new Dispensador100mil();
        setCadenaDispensamiento(cien);

        Dispensador50mil cincuenta =  new Dispensador50mil();
        cien.setCadenaDispensamiento(cincuenta);

        Dispensador20mil veinte = new Dispensador20mil();
        cincuenta.setCadenaDispensamiento(veinte);

        Dispensador10mil diez = new Dispensador10mil();
        veinte.setCadenaDispensamiento(diez);

        Dispensador5mil cinco = new Dispensador5mil();
        diez.setCadenaDispensamiento(cinco);

        getCadenaDispensamiento().dispensar(denominacion);
    }
}
