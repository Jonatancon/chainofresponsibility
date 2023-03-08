package co.com.udea.sevices.util;

import co.com.udea.model.Denominacion;
import co.com.udea.model.enums.Constants;
import co.com.udea.sevices.CadenaDispensamiento;

import java.util.logging.Logger;
import static java.util.logging.Level.INFO;

public class ValidationUtil {

    private final  Logger logger = Logger.getLogger(this.getClass().getName());

    private static ValidationUtil instance;

    private ValidationUtil (){}

    public static ValidationUtil getInstance() {
        if (instance == null) {
            instance = new ValidationUtil();
        }
        return instance;
    }


    public void validarMonto(CadenaDispensamiento siguiente, Denominacion denominacion, String value) {
        Constants val =selectType(value);
        String descript = "Cantidad en billetes de " + val.getDescription() + " : " + denominacion.getCantidad() / val.getValue();

        logger.log(INFO, descript);

        Integer cantidad = denominacion.getCantidad() - (denominacion.getCantidad() / val.getValue()) * val.getValue();
        denominacion.setCantidad(cantidad);
        if (siguiente != null) {
            siguiente.dispensar(denominacion);
        }
    }

    private Constants selectType(String value) {
        return Constants.valueOf(value);
    }
}
