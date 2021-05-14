package in.automationtesting.practice.pruebas.exceptions;

public class ElementNotFoundException extends RuntimeException{

    public static final String ELEMENT_NOT_FOUND = "Element is not visible, please check";
    public static final String ELEMENT_NOT_IT_MATCHES = "THE PRICE DOES NOT MATCH, please check";

    public ElementNotFoundException(String message) {
        super(message);
    }
}
