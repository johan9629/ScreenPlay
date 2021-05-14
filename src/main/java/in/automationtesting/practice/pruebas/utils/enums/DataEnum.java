package in.automationtesting.practice.pruebas.utils.enums;

public enum DataEnum {

    FIRS_NAME("Johan"),
    LAST_NAME("Gonzalez"),
    EMAIL("Johan9629@hotmail.com"),
    PHONE("3112636286"),
    ADDRESS("TRANS 15 #33-21"),
    CITY("BOGOTA");


    private String value;

    DataEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
