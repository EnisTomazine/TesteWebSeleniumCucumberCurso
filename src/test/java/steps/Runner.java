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
        //tags = {"@ComprarProduto"},
        plugin = {
                "pretty",                               //Formatação visual do Cucumber
                "html:target/reports/extentreports",    //Saida HTML do Relatório Simples
                "json:target/reports/extentreports.json" //Saida Json com os dados
        }
)


public class Runner extends AbstractTestNGCucumberTests {
}
