package co.com.udea.sevices;

import co.com.udea.model.Denominacion;

public abstract class CadenaDispensamiento {

    private CadenaDispensamiento sucesor;

    public void setCadenaDispensamiento (CadenaDispensamiento sucesor) {
        this.sucesor = sucesor;
    }

    public CadenaDispensamiento getCadenaDispensamiento() {
        return sucesor;
    }

    public abstract void dispensar (Denominacion denominacion);

}
