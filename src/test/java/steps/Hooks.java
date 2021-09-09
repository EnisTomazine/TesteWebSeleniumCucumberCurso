package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Logs;
import utils.Print;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Print print;
    public static Logs logs;

    static String dataHora = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
    @Before
    public void Iniciar() throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/92/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("passou aqui no before");
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 120 ,1);
        print = new Print();
        logs = new Logs();
        logs.iniciarLogCSV(dataHora);

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
    public static Logs getLogs(){
        return logs;
    }

    public static void abrirUrl(String url){
        driver.get(url);
    }
}
