package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.MainPageAsLogged;
import pages.Smartphones;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

public class ThenSteps {
    MainPage mainPage = new MainPage();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    Smartphones smartphones = new Smartphones();
    WebDriver driver = Driver.getDriver();

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
        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
        mainPage.showAssertsLoginMenu();
        TakeScreens.takeScreenshot(driver, "login_menu");
    }

    @Then("^login window pops up$")
    public void loginWindowPopupAssert() throws InterruptedException {
        Waiter.waitById("loginbutton");
        TakeScreens.takeScreenshot(driver,"login_popup_window");
    }

    @Then("^email and password fiels are filled in$")
    public void checkThatCredentialsAreSent() throws InterruptedException {
        Thread.sleep(2000);
        TakeScreens.takeScreenshot(driver, "login_and_password_filled");
    }


    @Then("^user is logged in via facebook profile and home page is displayed$")
    public void assertUserIsLogged() throws Exception {
        String pageName = driver.getTitle();
        System.out.println(">>>>> page name is: " + pageName);
        Waiter.waitbyClassName("ty-banner__image-item");
        mainPage.checkThatUserIsLoggedIn();
        TakeScreens.takeScreenshot(driver,"user_is_logged");
    }

    @Then("^list of all categories is displayed$")
    public void assertAllCategories() throws Exception {
        Waiter.waitByXPath("//li[@class='first-level blue']//a[contains(text(),'Telefoane')]");
        mainPageAsLogged.assertAllCategories();
        TakeScreens.takeScreenshot(driver, "list_of_all_categories");
    }

    @Then("^list of 'telefoane' is displayed$")
    public void assertAllTelefoaneCategories() throws Exception {
        Waiter.waitByXPath("//a[contains(text(),'Smartphone-uri')]");
//        mainPageAsLogged.assertAllTelefoaneCategories();
        TakeScreens.takeScreenshot(driver, "telefoane_categories");
    }

    @Then("^'smartphones' category is displayed$")
    public void assertSmartPhonesCategory() throws Exception {
        Waiter.waitbyClassName("ty-product-filters__item-more");
        smartphones.showSmartphonesAssert();
        TakeScreens.takeScreenshot(driver, "smartphones_category");
    }
}
