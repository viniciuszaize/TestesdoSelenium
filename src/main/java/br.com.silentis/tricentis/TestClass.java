package br.com.silentis.tricentis;

import org.junit.After;
import org.junit.Before;



public class TestClass extends BasePage {

    public BasePage basePage = new BasePage();
    public PageObjects pageObjects = new PageObjects();

    @Before
    public void Before(){basePage.iniciarChrome();}
    @After
    public void After(){basePage.finalizarChrome();}


    public void VehicleData(){

        pageObjects.FormularioVehicleData();
    }
    public void InsurantData(){

        pageObjects.FormularioInsurantData();
    }
    public void ProductData(){

        pageObjects.FormularioProductData();
    }
    public void PriceOption(){

        pageObjects.FormularioPriceOption();
    }
    public void Quote(){

        pageObjects.FormularioQuote();
    }
    public void Message(){

        pageObjects.MessageSucess();
    }
}