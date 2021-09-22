package br.com.silentis.tricentis;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class PageObjects extends BasePage {

    public String message;

    public void FormularioVehicleData() {

        //Step 1
        browser.findElement(By.xpath("//select[@id='make']//option[@value='BMW'][normalize-space()='BMW']")).click();
        browser.findElement(By.xpath("//select[@id='model']//option[@value='Scooter'][normalize-space()='Scooter']")).click();
        browser.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("400");
        browser.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("500");
        browser.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("09/21/2021");
        browser.findElement(By.xpath("//select[@id='numberofseats']//option[@value='1'][normalize-space()='1']")).click();
        browser.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        browser.findElement(By.xpath("//select[@id='fuel']")).click();
        browser.findElement(By.xpath("//select[@id='numberofseatsmotorcycle']//option[@value='2'][normalize-space()='2']")).click();
        browser.findElement(By.xpath("//select[@id='fuel']")).click();
        browser.findElement(By.xpath("//option[@value='Electric Power']")).click();
        browser.findElement(By.xpath("//input[@id='payload']")).sendKeys("1000");
        browser.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("5000");
        browser.findElement(By.xpath("//input[@id='listprice']")).sendKeys("89000");
        browser.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("1478");
        browser.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("2021");
        browser.manage().timeouts().implicitlyWait(01, TimeUnit.SECONDS);
        browser.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
    }
        public void FormularioInsurantData() {
            browser.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vinicius");
            browser.findElement(By.xpath("//input[@id='lastname']")).sendKeys("nascimento");
            browser.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("10/29/1997");
            browser.findElement(By.xpath("//select[@id='country']//option[@value='Brazil'][normalize-space()='Brazil']")).click();
            browser.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("03047000");
            browser.findElement(By.xpath("//select[@id='occupation']//option[@value='Employee'][normalize-space()='Employee']")).click();
            browser.findElement(By.xpath("//label[normalize-space()='Bungee Jumping']")).click();
            browser.manage().timeouts().implicitlyWait(01, TimeUnit.SECONDS);
            browser.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
        }

        public void FormularioProductData() {
            browser.findElement(By.xpath("//input[@id='startdate']")).sendKeys("08/10/2022");
            browser.findElement(By.xpath("//select[@id='insurancesum']//option[@value='3000000']")).click();
            browser.findElement(By.xpath("//select[@id='meritrating']//option[@value='Bonus 9'][normalize-space()='Bonus 9']")).click();
            browser.findElement(By.xpath("//select[@id='damageinsurance']//option[@value='No Coverage'][normalize-space()='No Coverage']")).click();
            browser.findElement(By.xpath("//label[normalize-space()='Euro Protection']")).click();
            browser.findElement(By.xpath("//select[@id='courtesycar']//option[@value='Yes'][normalize-space()='Yes']")).click();
            browser.manage().timeouts().implicitlyWait(01, TimeUnit.SECONDS);
            browser.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
        }

        public void FormularioPriceOption() {

            browser.findElement(By.xpath("//section[@id='pricePlans']//label[4]")).click();
            browser.findElement(By.cssSelector("#nextsendquote")).click();
        }

        public void FormularioQuote() {
            browser.findElement(By.xpath("//input[@id='email']")).sendKeys("viniciusteste@gmail.com");
            browser.findElement(By.xpath("//input[@id='username']")).sendKeys("desconhecido");
            browser.findElement(By.xpath("//input[@id='password']")).sendKeys("Teste@1997");
            browser.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Teste@1997");

            browser.findElement(By.xpath("//button[normalize-space()='« Send »']")).click();
            browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            message = browser.findElement(By.xpath("//h2[normalize-space()='Sending e-mail success!']")).getText();
            Assert.assertEquals("Sending e-mail success!", message);
            browser.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        }
        public void MessageSucess(){

        System.out.println(message);

        }

}
