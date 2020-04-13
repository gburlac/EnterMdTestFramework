package steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import context.ScenarioContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import enums.LoginErrorMessages;
import enums.Users;
import pages.MainPage;
import pages.Page;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class LoginFunctionality {

    Page page = new Page();

    WebDriver driver = Driver.getDriver();

    MainPage mainPage = page.getMainPage();

    Logger log = Logger.getLogger(LoginFunctionality.class);

    CommonSteps commonSteps = page.getCommonSteps();

    @Given("^user is logged in via (.*?) as (.*?)$") // leave
    public void login(String socialNetwork, Users user) throws Exception {
        commonSteps.homePageIsDisplayed();
        mainPage.loginViaSocial(socialNetwork, user);
        log.info("Opening popup for logging in via Social.");

    }

    @Given("^user logs in as (.*)$") // leave
    public void loginOnSite(Users user) {
        commonSteps.homePageIsDisplayed();
        mainPage.accessLoginMenu();
        Waiter.waitById("login_popup3262");
        mainPage.inputEmail(user.getEmail());
        mainPage.inputPassword(user.getPassword());
        mainPage.clickLoginButton();
        log.info("Home page is displayed. User is logged.");
    }

    @When("^user logs in with new password as (.*?)$") // leave
    public void loginOnSiteWithNewPass(Users user) {
        commonSteps.homePageIsDisplayed();
        mainPage.accessLoginMenu();
        Waiter.waitById("login_popup3262");
        mainPage.inputEmail(user.getEmail());
        mainPage.inputPassword((String) ScenarioContext.getContext(Context.CHANGED_PASSWORD));
        mainPage.clickLoginButton();
        log.info("Home page is displayed. User is logged.");
    }

    @Then("^home page is displayed and user is logged in as (.*?)$") // leave
    public void assertUserLoggedMainPageDisplayed(Users user) throws Exception {
        Waiter.waitbyClassName("ty-banner__image-item");
        mainPage.checkThatUserIsLoggedIn(user.getUserName());
        TakeScreens.takeScreenshot(driver, "user_is_logged");
        log.info("Home page is displayed. User is logged.");
    }

    @When("^user tries to log in with invalid (.*?) and (.*?)$") // leave
    public void loginNegative(String email, String password) {
        mainPage.accessLoginMenu();
        Waiter.waitById("login_popup3262");
        mainPage.inputEmail(email);
        mainPage.inputPassword(password);
        mainPage.clickLoginButton();
        log.info("User tries to log in with valid email and password.");
    }

    @Then("^(.*?) appears and user is login fails$") // leave
    public void assertWarningAllert(LoginErrorMessages errorMessage) {
        mainPage.assertAlertNotification(errorMessage.getMessage());
        TakeScreens.takeScreenshot(driver, "login_failed");
        log.info("Notification alert message!");
    }

    @When("^user click on logout option$") // leave
    public void logout() throws Exception {
        mainPage.logout();
        log.info("User loges out.");
    }

    @Then("^user is logged out and main page is displayed$") // leave
    public void assertUserIsLoggedOut() throws Exception {
        mainPage.assertUserIsLoggedOut();
        TakeScreens.takeScreenshot(driver, "logged_out");
        log.info("User is logged out.");
    }
}
