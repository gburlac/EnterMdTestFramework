package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.LoginPopup;
import pages.MainPage;
import pages.MainPageAsLogged;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WhenStep {

    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();

    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        mainPage.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
    }

    @When("^user clicks on login menu$")
    public void clickOnLoginMenu(){
        mainPage.accessLoginMenu();
    }

    @When("^user clicks on 'facebook' icon$")
    public void clickOnFacebookIcon(){
        mainPage.loginViaFacebook();
        WindowsHandler.switchWindow();
    }

    @When("^user enters credentials")
    public void enterCredentials() {
        Waiter.waitById("email");
        Waiter.waitById("pass");
        loginPopup.inputEmail("vovc1k.ru@gmail.com");
        loginPopup.inputPassword("Vilrkrew@1");
    }

    @When("^user press login button$")
    public void clickLoginButton(){
        loginPopup.login();
        WindowsHandler.switchBackToMain();
    }

    @When("^user clicks on 'categoryList'$")
    public void openCategoryList(){
        mainPageAsLogged.openAllCategories();
    }

    @When("^user clicks on 'telefoane' category$")
    public void openTelefoaneCategories(){
        mainPageAsLogged.openAllTelefoaneCategories();
    }

    @When("^user clicks on 'smartphones' category$")
    public void openSmartphonesCategory(){
        mainPageAsLogged.goToSmartphones();
    }
}
