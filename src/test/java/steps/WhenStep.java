package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.MainPage;

import java.util.logging.Logger;

public class WhenStep {

    MainPage mainPage = new MainPage();

    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        mainPage.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
    }

    @When("^user click on login menu$")
    public void clickOnLoginMenu(){
        mainPage.accessLoginMenu();
    }

    @When("^user click on 'facebook' icon$")
    public void clickOnFacebookIcon(){
        mainPage.loginViaFacebook();
    }
}
