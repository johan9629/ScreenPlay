package in.automationtesting.practice.pruebas.utils.enums;

public enum URLEnum {

    URLBASE ("http://practice.automationtesting.in/shop/");

    private String value;

    URLEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
