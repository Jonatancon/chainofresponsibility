package co.com.udea.model.enums;

public enum Constants {
    CIEN_MIL(100_000, "Cien mil"),
    CINCUENTA_MIL(50_000, "Cincuenta mil"),
    VEINTE_MIL(20_000, "Veinte mil"),
    DIEZ_MIL(10_000, "Diez mil"),
    CINCO_MIL(10_000, "Cinco mil"),
    ;


    private final Integer value;
    private final String description;
    Constants(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
