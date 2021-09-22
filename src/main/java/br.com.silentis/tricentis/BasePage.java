package br.com.silentis.tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static final String Url_Tricentis = "http://sampleapp.tricentis.com/101/app.php";
    public static WebDriver browser;


    public void iniciarChrome() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions chr  = new ChromeOptions();
        chr.addArguments("--start-maximized");
        chr.addArguments("--lang=pt-BR");
        browser = new ChromeDriver(chr);
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get(Url_Tricentis);
    }


    public void finalizarChrome() {
        browser.quit();
    }

}

