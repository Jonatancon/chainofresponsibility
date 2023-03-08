package co.com.udea;

import co.com.udea.exeption.DenominacionExeption;
import co.com.udea.model.Denominacion;
import co.com.udea.sevices.impl.cajero.Cajero;

import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger("Log Principal");
    public static void main(String[] args) {
        Cajero cajero = new Cajero();

        logger.log(INFO, "Por favor ingrese el valor a retirar: ");

        Integer value = Math.toIntExact(scanner.nextLong());

        try {
            cajero.dispensar(new Denominacion(value));
        }catch (DenominacionExeption e) {
           logger.log(SEVERE, e.getMessage());
        }


    }
}