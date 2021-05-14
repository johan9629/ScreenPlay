package in.automationtesting.practice.pruebas.tasks;

import in.automationtesting.practice.pruebas.exceptions.ElementNotFoundException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static in.automationtesting.practice.pruebas.userinterfaces.HomeShopPage.IMG_SHOP_PAGE;
import static in.automationtesting.practice.pruebas.utils.enums.URLEnum.URLBASE;

public class OpenBrowserTask implements Task {

    public static Logger LOGGER = LogManager.getLogger(OpenBrowserTask.class.getName());

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(URLBASE.getValue()));
        /*actor.wasAbleTo(
                Check.whether(IMG_SHOP_PAGE.resolveFor(actor).isVisible())


        );
*/

        try{
            if (!IMG_SHOP_PAGE.resolveFor(actor).isVisible()){
                throw new ElementNotFoundException(ElementNotFoundException.ELEMENT_NOT_FOUND);
            }
        }
        catch (ElementNotFoundException e){
            throw new ElementNotFoundException(ElementNotFoundException.ELEMENT_NOT_FOUND);
        }
    }

    public static OpenBrowserTask openBrowser(){
        return Tasks.instrumented(OpenBrowserTask.class);
    }
}
