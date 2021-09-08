package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListaResultadoBusca {
    WebDriver driver;

    @FindBy(css = "h3")
    WebElement produtoNalista;

    public ListaResultadoBusca(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String lerNomeProduto(String produto){
        String nome = produtoNalista.getText();
        System.out.println("pegou o texto"+ nome);
        return nome;
    }

    public String lerIdProduto(String produto){
        String id = produtoNalista.getAttribute("data-productid");
        return id;
    }

    public void clicaNoProduto(String produto){
        produtoNalista.click();
    }

    public By verificarElemento(){
        return By.cssSelector("h3");
    }
}
