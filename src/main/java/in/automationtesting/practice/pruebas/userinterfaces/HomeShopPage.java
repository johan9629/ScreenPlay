package in.automationtesting.practice.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeShopPage {
    public static  final Target IMG_SHOP_PAGE = Target.the("IMAGEN PAGINA")
            .located(By.xpath("//img[@title='Automation Practice Site']"));
    public static final Target  IMG_BOOK_SHOP = Target.the("LIBRO")
            .located(By.xpath("//img[@title='Android Quick Start Guide']"));
    public static final Target TXT_AMOUNT_BOOK = Target.the("CANTIDAD LIBROS")
            .located(By.name("quantity"));
    public static final Target BTN_ADD_BASKET = Target.the("AGREGAR AL CARRITO")
            .located(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
    public static final Target TXT_BASKET = Target.the("CARRITO")
            .located(By.xpath("//span[@class='cartcontents']"));
    public static final Target BTN_CHECKOUT = Target.the("VERIFICACION")
            .located(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
    public static final Target TXT_FIRST_NAME = Target.the("NOMBRE")
            .located(By.name("billing_first_name"));
    public static final Target TXT_LAST_NAME = Target.the("APELLIDO")
            .located(By.name("billing_last_name"));
    public static final Target TXT_EMAIL = Target.the("CORREO")
            .located(By.name("billing_email"));
    public static final Target TXT_PHONE = Target.the("CELULAR")
            .located(By.name("billing_phone"));
    public static final Target TXT_ADDRESS = Target.the("DIRECCION")
            .located(By.name("billing_address_1"));
    public static final Target TXT_CITY = Target.the("CIUDAD")
            .located(By.name("billing_city"));
    public static final Target TXT_STATE = Target.the("ESTADO")
            .located(By.name("billing_state"));
    public static final Target TXT_TOTAL = Target.the("TOTAL")
            .located(By.xpath("//span[contains(text(), '945.00')]"));
}
