package in.automationtesting.practice.pruebas.exceptions;

public class InternetConnectionExcepction extends  RuntimeException{

    public static final String INTERNET_FAILED = "There was a problem with connection internet, please check";

    public InternetConnectionExcepction(String message) {
        super(message);
    }
}
