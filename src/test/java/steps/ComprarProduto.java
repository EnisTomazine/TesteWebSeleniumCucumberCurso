package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import paginas.Carrinho;
import paginas.Home;
import paginas.ListaResultadoBusca;
import paginas.Produto;
import utils.Print;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class ComprarProduto {
    WebDriver driver;
    WebDriverWait wait;
    //Home home;
    //ListaResultadoBusca listaResultadoBusca;
    //Produto paginaProduto;

    Home home;
    ListaResultadoBusca listaResultadoBusca;
    Produto paginaProduto;
    Carrinho carrinho;
    Print print;

    static String dataHora = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());

    @Dado("^que acesso o site madeiramadeira\\.com\\.br$")
    public void queAcessoOSiteMadeiramadeiraComBr()  throws IOException {
        String casoDeTeste = "Acessar o site";
        System.out.println("chegou para acessar o site");
        Hooks.abrirUrl("https://www.madeiramadeira.com.br/");
        driver = Hooks.getDriver();
        wait = Hooks.getWait();
        print = Hooks.getPrint();
        print.print(driver, dataHora, casoDeTeste,"Acessou o site");
        System.out.println("que acesso o site");

    }
    @E("^concordo com os cookies$")
    public void concordoComOsCookies() {
        home = new Home(driver);
        home.clicaAceitaCookies();
        System.out.println("aceitou cookies");
    }

    @Quando("^clico no campo de busca e pesquiso o \"([^\"]*)\"$")
    public void clico_no_campo_de_busca_e_pesquiso_o(String produto) throws IOException{
        String casoDeTeste = "Pesquisar o Produto";
        home.buscaPorProduto(produto);
        System.out.println("clico no campo de busca e pesquiso");
        print.print(driver, dataHora, casoDeTeste,"Digitar no campo de busca");
    }

    @Entao("^confirmo que aparece o nome \"([^\"]*)\"$")
    public void confirmo_que_aparece_o_nome(String produto) throws IOException{
        String casoDeTeste = "Confirmar Produto na lista";
        wait.until(ExpectedConditions.textToBe(By.id("search-title"),produto));
        listaResultadoBusca = new ListaResultadoBusca(driver);
        String nomeTextoEsperado = listaResultadoBusca.lerNomeProduto(produto);
        assertEquals(produto, nomeTextoEsperado);
        System.out.println("confirmo que aparece o nome");
        print.print(driver, dataHora, casoDeTeste,"Confirmar Produto na lista");
    }

    @Entao("^o \"([^\"]*)\" do \"([^\"]*)\" pesquisado$")
    public void o_do_pesquisado(String id, String produto) {
        String casoDeTeste = "Confirmar ID Produto ";
        String TextoEsperado = listaResultadoBusca.lerIdProduto(produto);
        assertEquals(id, TextoEsperado);
        System.out.println("confirmo que aparece o ID");

    }

    @Quando("^clico no \"([^\"]*)\" pesquisado$")
    public void clico_no_pesquisado(String produto) throws IOException {
        String casoDeTeste = "Seleciona produto na lista";
        listaResultadoBusca.clicaNoProduto(produto);
        System.out.println("clicou no Produto");
        print.print(driver, dataHora, casoDeTeste,"Seleciona produto na lista");
    }

    @Entao("^confirmo se aparece o nome do \"([^\"]*)\"$")
    public void confirmo_se_aparece_o_nome_do(String produto)  throws IOException {
        String casoDeTeste = "Verifica pagina do produto";
        paginaProduto = new Produto(driver);
        String TextoEsperado = paginaProduto.retornaNomeProduto();
        Assert.assertTrue(TextoEsperado.contains(produto));
        //assertEquals(produto, TextoEsperado);
        System.out.println("confirma se aparece o nome do Produto");
        print.print(driver, dataHora, casoDeTeste,"Verifica pagina do produto");

    }

    @Entao("^o \"([^\"]*)\" do produto$")
    public void o_do_produto(String preco) {
        String TextoEsperado = paginaProduto.retornaPrecoProduto();
        assertEquals(preco, TextoEsperado);
        System.out.println("preco retornado" + TextoEsperado);
        System.out.println("Preço passado" + preco);
        System.out.println("confirma se aparece o preco do Produto");
    }

    @Quando("^clico no botao comprar$")
    public void clico_no_botao_comprar() {
        paginaProduto.clicarParaComprar();
    }

    @Entao("^confirmo se aparece o \"([^\"]*)\" no carrinho$")
    public void confirmo_se_aparece_o_no_carrinho(String produto) throws IOException{
        String casoDeTeste = "Verifica produto no carrinho";
        carrinho = new Carrinho(driver);
         wait.until(ExpectedConditions.textToBe(By.cssSelector("span.steps__label"),"Carrinho"));
        assertEquals("Carrinho",carrinho.lerLabelCarrinho());
        String nomeProduto = carrinho.lerNomeProduto();
        System.out.println("buscou o nome do Produto no carrinho: " + nomeProduto);
        Assert.assertTrue(nomeProduto.contains(produto));
        print.print(driver, dataHora, casoDeTeste,"Verifica produto no carrinho");
    }




}



