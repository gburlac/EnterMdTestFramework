package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.LoginPopup;
import pages.MainPage;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WhenStep {

    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();

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

    @When("^user enter credentials")
    public void enterCredentials() throws InterruptedException {
        WindowsHandler.switchWindow();
        Thread.sleep(5000);
        loginPopup.inputEmail("qweqwewq@me.com");
        loginPopup.inputPassword("123123");
    }

    @When("^user press login button$")
    public void clickLoginButton(){
        loginPopup.login();
//        WindowsHandler.switchBack();
        WindowsHandler.getParentWindow();
    }
}
