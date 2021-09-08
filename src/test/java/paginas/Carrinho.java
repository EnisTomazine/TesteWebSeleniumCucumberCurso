package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrinho {
    WebDriver driver;

    @FindBy(css= "span.steps__label")
    WebElement labelCarrinho;

    @FindBy(css ="p.helper--has-margin-bottom.helper--has-text-grey-seven.helper--has-text-large")
    WebElement nomeProduto;

    public Carrinho(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String lerLabelCarrinho(){
        return labelCarrinho.getText();
    }

    public String lerNomeProduto(){
        return nomeProduto.getText();
    }
}
