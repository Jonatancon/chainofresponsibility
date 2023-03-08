package co.com.udea.exeption;

public class DenominacionExeption extends RuntimeException{
    private String message;

    public DenominacionExeption (String message) {
        super(message);
        this.message = message;
    }
}
