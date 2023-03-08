package co.com.udea;

import co.com.udea.exeption.DenominacionExeption;
import co.com.udea.model.Denominacion;

public class Main {
    public static void main(String[] args) {
        Middle ex = new Middle();

        try {
            ex.run(new Denominacion(153_000));
        }catch (DenominacionExeption e) {
            System.err.println(e.getMessage());
        }


    }
}