package Functionalities;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

import java.util.HashMap;

public class LoginFunctionality {

    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    WebElement userMenu;

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        TakeScreens.takeScreenshot(driver, "home_page");
    }

    @Given("^user is logged in via facebook$")
    public void login() throws Exception {
        userIsOnHomepage();
        loginViaFB();
    }

    @When("^user logs in$")
    public void loginViaFB() throws Exception {
        mainPage.accessLoginMenu();
        mainPage.loginViaFacebook();
        WindowsHandler.switchWindow();
        Waiter.waitById("email");
        Waiter.waitById("pass");
        loginPopup.inputEmail("");
        loginPopup.inputPassword("");
        loginPopup.login();
        WindowsHandler.switchBackToMain();
    }

//    @Given("^user logs in with credential$")

    public void logWithCredentials(HashMap<String, String> dataTable) throws Exception {
//        dataTable.
    }

    @When("^user is logged in as (.*)$")
    public void loginOnSite(Users user){
        userIsOnHomepage();
        mainPage.accessLoginMenu();
        Waiter.waitById("login_popup3262");
        mainPage.inputEmail(user.getEmail());
        mainPage.inputPassword(user.getPassword());
        mainPage.clickLoginButton();
    }

    @Then("^home page is displayed and user is logged in$")
    public void assertUserLoggedMainPageDisplayed() throws Exception {
        Waiter.waitbyClassName("ty-banner__image-item");
        mainPage.checkThatUserIsLoggedIn();
        TakeScreens.takeScreenshot(driver, "user_is_logged");
    }

    @When("^user tries to log in with invalid (.*?) and (.*?)$")
    public void loginNegative(String email, String password){
        mainPage.accessLoginMenu();
        Waiter.waitById("login_popup3262");
        mainPage.inputEmail(email);
        mainPage.inputPassword(password);
        mainPage.clickLoginButton();
    }

    @Then("^(.*?) appears and user is login fails$")
    public void assertWarningAllert(LoginErrorMessages errorMessage){
        mainPage.assertAlertNotification(errorMessage.getMessage());
        TakeScreens.takeScreenshot(driver, "login_failed");
    }

    @When("^user click on logout option$")
    public void logout() throws Exception {
        mainPageAsLogged.logout();
    }

    @Then("^user is logged out and main page is displayed$")
    public void assertUserIsLoggedOut() throws Exception {
        mainPageAsLogged.assertUserIsLoggedOut();
        TakeScreens.takeScreenshot(driver, "logged_out");
    }




//    @When("^user enter credentials$")
//    public void loginOnSiteTEST(HashMap<String, String> dataTable){
//    public void loginOnSiteTEST(DataTable dataTable){
//        dataTable.asMap("", "");
//
//    }
}
