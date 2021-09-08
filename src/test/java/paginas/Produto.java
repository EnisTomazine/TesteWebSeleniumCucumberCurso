package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Produto {
    WebDriver driver;

    @FindBy(css = "h1" )
    WebElement nomeProduto;

    //tentei buscar por css= "span.product-prices__big-price helper--has-text-semibold" porém não funcionou

    @FindBy(css= "span.product-prices__big-price.helper--has-text-semibold")
    WebElement precoProduto;

    @FindBy(id= "product-buy-button")
    WebElement btnComprar;

    public Produto(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String retornaPrecoProduto(){
        String preco = precoProduto.getText();
        return preco;
    }
    public String retornaNomeProduto(){
        String nome = nomeProduto.getText();
        return nome;
    }

    public void clicarParaComprar(){
        btnComprar.click();
    }

}
