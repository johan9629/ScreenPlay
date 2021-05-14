package in.automationtesting.practice.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import static in.automationtesting.practice.pruebas.userinterfaces.HomeShopPage.IMG_BOOK_SHOP;

public class BuyShopTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(IMG_BOOK_SHOP),
                Click.on(IMG_BOOK_SHOP));
    }
    public static BuyShopTask buyShop (){
        return Tasks.instrumented(BuyShopTask.class);
    }

}
