package steps;
import br.com.silentis.tricentis.BasePage;
import br.com.silentis.tricentis.TestClass;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SeleniumSteps {
    public BasePage basePage = new BasePage();
    public TestClass testClass = new TestClass();

    @Dado("^o formulário aba “Enter Vehicle Data” e pressione next$")
    public void o_formulário_aba_Enter_Vehicle_Data_e_pressione_next()throws Throwable {

        basePage.iniciarChrome();

       testClass.VehicleData();
    }

    @Dado("^Preencher o formulário aba “Enter Insurant Data” e pressione next$")
    public void preencher_o_formulário_aba_Enter_Insurant_Data_e_pressione_next()throws Throwable {
        testClass.InsurantData();

    }

    @Dado("^Preencher o formulário aba “Enter Product Data” e pressione next$")
    public void preencher_o_formulário_aba_Enter_Product_Data_e_pressione_next()throws Throwable {
        testClass.ProductData();

    }

    @Dado("^Preencher o formulário aba “Select Price Option” e pressione next$")
    public void preencher_o_formulário_aba_Select_Price_Option_e_pressione_next()throws Throwable {
        testClass.PriceOption();

    }

    @Quando("^Preencher o formulário aba “Send Quote” e pressione Send$")
    public void preencher_o_formulário_aba_Send_Quote_e_pressione_Send() throws Throwable {
        testClass.Quote();
        basePage.finalizarChrome();
    }

    @Entao("^Verificar a mensagem “Sending e-mail success!” na tela$")
    public void verificar_a_mensagem_Sending_e_mail_success_na_tela() throws Throwable{
       testClass.Message();
    }

}
