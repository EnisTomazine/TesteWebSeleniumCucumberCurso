package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Print;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Print print;
    @Before
    public void Iniciar() {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/92/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("passou aqui no before");
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 120 ,1);
        print = new Print();

    }

    @After
    public void finalizar() {
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
    public static WebDriverWait getWait(){
        return wait;
    }
    public static Print getPrint(){
        return print;
    }

    public static void abrirUrl(String url){
        driver.get(url);
    }
}
