package co.com.udea.sevices.impl;

import co.com.udea.model.Denominacion;
import co.com.udea.model.enums.Constants;
import co.com.udea.sevices.CadenaDispensamiento;
import co.com.udea.sevices.util.ValidationUtil;

public class Dispensador20mil extends CadenaDispensamiento {
    ValidationUtil validator = ValidationUtil.getInstance();
    @Override
    public void dispensar(Denominacion denominacion) {
        validator.validarMonto(getCadenaDispensamiento(), denominacion, Constants.VEINTE_MIL.name());
    }
}
