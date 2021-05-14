package in.automationtesting.practice.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static in.automationtesting.practice.pruebas.userinterfaces.HomeShopPage.*;

public class AddBasketTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(TXT_AMOUNT_BOOK),
                Enter.theValue("2").into(TXT_AMOUNT_BOOK),
                Click.on(BTN_ADD_BASKET),
                Click.on(TXT_BASKET),
                Click.on(BTN_CHECKOUT)
        );
    }

    public static AddBasketTask addBasket (){
        return Tasks.instrumented(AddBasketTask.class);
    }
}
