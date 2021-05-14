package in.automationtesting.practice.pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static in.automationtesting.practice.pruebas.userinterfaces.HomeShopPage.TXT_TOTAL;

public class VerifyTotalQuestion {

    public static Question<String> verifyTotalQuestion() {
        return actor -> TXT_TOTAL.resolveFor(actor).getTextValue();
    }
}
