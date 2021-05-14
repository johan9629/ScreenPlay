package in.automationtesting.practice.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/in.automationtesting.practice.pruebas.features/compra_libro.feature",
        glue = "in.automationtesting.practice.pruebas.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class CompraLibroRunner {
    public CompraLibroRunner() {
    }
}
