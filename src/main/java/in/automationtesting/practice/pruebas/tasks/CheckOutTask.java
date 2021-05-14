package in.automationtesting.practice.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;


import static in.automationtesting.practice.pruebas.userinterfaces.HomeShopPage.*;
import static in.automationtesting.practice.pruebas.utils.enums.DataEnum.*;

public class CheckOutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(FIRS_NAME.getValue()).into(TXT_FIRST_NAME),
                Enter.keyValues(LAST_NAME.getValue()).into(TXT_LAST_NAME),
                Enter.keyValues(EMAIL.getValue()).into(TXT_EMAIL),
                Enter.keyValues(PHONE.getValue()).into(TXT_PHONE),
                Enter.keyValues(ADDRESS.getValue()).into(TXT_ADDRESS),
                Enter.keyValues(CITY.getValue()).into(TXT_CITY),
                Enter.keyValues(CITY.getValue()).into(TXT_STATE)
        );

    }

    public static CheckOutTask checkOut(){
        return Tasks.instrumented(CheckOutTask.class);
    }
}
