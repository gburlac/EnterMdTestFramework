package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

public class ThenSteps {
    MainPage mainPage = new MainPage();

    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        mainPage.electroCasniceCategoryIsDisplayed();
    }

    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        mainPage.tehnicaDeBucatarieLabel();
    }

    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        mainPage.aparateDeUzCasnicePart();
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        mainPage.ingrijirePersonala();
    }

    @Then("^login menu popup is displayed$")
    public void loginPopupAsserts(){
        mainPage.showAssertsLoginMenu();
        TakeScreens.takeScreenshot(Driver.getDriver(), "login_menu");
    }

    @Then("^login window pops up$")
    public void loginWindowPopupAssert(){
        Waiter.waiter();
        TakeScreens.takeScreenshot(Driver.getDriver(),"login_popup_window");
    }

    @Then("^email and password fiels are filled in$")
    public void checkThatCredentialsAreSent(){
        Waiter.waiter();
        TakeScreens.takeScreenshot(Driver.getDriver(), "login_and_password_filled");
    }


    @Then("^user is logged in via facebook profile and home page is displayed$")
    public void assertUserIsLogged() throws Exception {
        Thread.sleep(7000);
//        mainPage.checkThatUserIsLoggedIn();
        mainPage.getTextFromElement();
//        TakeScreens.takeScreenshot(Driver.getDriver(),"user_is_logged");
    }
}
