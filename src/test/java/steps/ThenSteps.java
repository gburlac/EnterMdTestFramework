package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

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
    @Then("^user is logged in via facebook profile and home page is displayed$")
    public void assertUserIsLogged() throws Exception {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        mainPage.checkThatUserIsLoggedIn();
        TakeScreens.takeScreenshot(Driver.getDriver(),"user_is_logged");
    }
}
