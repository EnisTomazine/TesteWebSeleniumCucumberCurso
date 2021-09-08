package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = { "src/test/resources/features"}, // Onde estao os cenarios em Gherkin
        glue     = { "steps"} ,  // Onde estao as definicoes de passos
        monochrome = true,
        dryRun   = false,
        tags = {"@ComprarProduto"}
)


public class Runner extends AbstractTestNGCucumberTests {
}
