package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class Home {
    WebDriver driver;

    @FindBy(id= "lgpd-button-agree")//Campo de busca
    WebElement btnAceitaCookies;

    @FindBy(id= "input-autocomplete")//Campo de busca
    WebElement campoDeBusca;

    @FindBy(id="icon-search") //incone da Lupa
    WebElement lupa;



    public Home(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clicaAceitaCookies(){
        btnAceitaCookies.click();
    }

    public void buscaPorProduto(String produto){
        campoDeBusca.click();
        campoDeBusca.clear();
        campoDeBusca.sendKeys(produto);
        lupa.click();
    }
    public void pesquisarComEnter(){
        lupa.sendKeys(Keys.ENTER);
    }


    public By verificarElementoCookies(){
        return By.id("lgpd-button-agree");
    }

}
