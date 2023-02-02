package lee.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lee.utilities.CommonSteps;
import lee.utilities.ConfigurationReader;

public class LeeSteps extends CommonSteps {

    @Given("Kullanici site ana sayfaya gider")
    public void kullanici_site_ana_sayfaya_gider() {
    }


    @When("Kullanici alert'teki cikan uyari yazisini onaylar")
    public void kullanici_alert_teki_cikan_uyari_yazisini_onaylar() {
        waitFor(3);
        try{
            acceptAlert();
        }catch (Exception e){

        }

    }
    @When("Kullanici login olur")
    public void kullanici_login_olur() {
        leePage.hesabimButonu.click();
    waitForVisibility(leePage.loginMailTextBox,10);
        leePage.loginMailTextBox.sendKeys(ConfigurationReader.get("email"));
        leePage.loginPasswordTextBox.sendKeys(ConfigurationReader.get("password"));
        leePage.loginGirisYapButonu.click();
//        waitForVisibility(leePage.closeAdButton,15);
//        leePage.closeAdButton.click();
        waitFor(3);
        clickOnImage("closeButton");
    }

    @When("Kullanici Sepetim Butonunu tiklar")
    public void kullanici_sepetim_butonunu_tiklar() {

    }


}
