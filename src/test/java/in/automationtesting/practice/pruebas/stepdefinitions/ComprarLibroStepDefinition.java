package in.automationtesting.practice.pruebas.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import in.automationtesting.practice.pruebas.questions.VerifyTotalQuestion;
import in.automationtesting.practice.pruebas.tasks.AddBasketTask;
import in.automationtesting.practice.pruebas.tasks.BuyShopTask;
import in.automationtesting.practice.pruebas.tasks.CheckOutTask;
import in.automationtesting.practice.pruebas.tasks.OpenBrowserTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ComprarLibroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor userAutomation = Actor.named("userAutomation");

    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
        userAutomation.can(BrowseTheWeb.with(webDriver));
    }

    @Dado("^que el usuario verifica la conexion a internet$")
    public void queElUsuarioVerificaLaConexionAInternet() {
        userAutomation.attemptsTo(OpenBrowserTask.openBrowser());
    }


    @Cuando("^se compren dos libros de Android Quick Start Guide$")
    public void seComprenDosLibrosDeAndroidQuickStartGuide() {
        userAutomation.attemptsTo(BuyShopTask.buyShop());
        userAutomation.attemptsTo(AddBasketTask.addBasket());
        userAutomation.attemptsTo(CheckOutTask.checkOut());
    }

    @Entonces("^se verificara la cantidad y el precio$")
    public void seVerificaraLaCantidadYElPrecio() {
        String textValid = "945.00";
        System.out.println(VerifyTotalQuestion.verifyTotalQuestion()+"imprimir esto");
        userAutomation.should(
                GivenWhenThen.seeThat(VerifyTotalQuestion.verifyTotalQuestion(), Matchers.equalTo(textValid))
        );
    }
}
