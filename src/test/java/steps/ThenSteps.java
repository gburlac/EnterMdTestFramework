package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

import pages.ToateCategoriile;

public class ThenSteps<log> {
    SmartphonesCategory smartphonesCategory = new SmartphonesCategory();
    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    static Logger log = Logger.getLogger(ThenSteps.class);

    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        electrocasnice.electroCasniceCategory();
        TakeScreens.takeScreenshot(Driver.getDriver(), "electrcasnice");

    }

    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        electrocasnice.tehnicaDeBucatarieLabel();
        TakeScreens.takeScreenshot(Driver.getDriver(), "tehnicaDeBucatarieLabel");
    }

    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        electrocasnice.aparateDeUzCasnicePart();
        TakeScreens.takeScreenshot(Driver.getDriver(), "aparateDeUzCasnicePartIsDisplaed");
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        electrocasnice.ingrijirePersonala();
        TakeScreens.takeScreenshot(Driver.getDriver(), "ingrijirePersonalaPartIsDisplayed");
        mainPage.ingrijirePersonala();
    }

    @Then("^home page is displayed and user is logged in$")
    public void assertUserLoggedMainPageDisplayed() throws Exception {
        Waiter.waitbyClassName("ty-banner__image-item");
        mainPage.checkThatUserIsLoggedIn();
        TakeScreens.takeScreenshot(driver, "user_is_logged");
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

    @Then("^phone details are displayed$")
    public void assertPhoneDetails() throws Exception {
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        productPage.assertProductDetails();
        TakeScreens.takeScreenshot(driver, "product_detail_page");
    }

    @Then("^a confirmation module pops up$")
    public void assertConfirmationPopup() {
        Waiter.waitByXPath("//h1[contains(text(),'Produs adaugat in cos')]");
        TakeScreens.takeScreenshot(driver, "product_added_to_cart_confirm");
        Waiter.waitByXPathUntilDissapear("//h1[contains(text(),'Produs adaugat in cos')]");
    }

    @Then("^a cart module pops up$")
    public void assertCartModulePopup() {
//        Waiter.waitbyClassName("//div[@class= 'ty-cart-items']");
        TakeScreens.takeScreenshot(driver, "cart_popup");
    }

    @Then("^cart page is opened$")
    public void assertCarPage() throws Exception {
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        TakeScreens.takeScreenshot(driver, "cart_page");
        cartPage.assertCartPageIsDisplayed();
        cartPage.assertCartIsNotEmpty();
    }

    @Then("^user is logged out and main page is displayed$")
    public void assertUserIsLoggedOut() throws Exception {
        mainPageAsLogged.assertUserIsLoggedOut();
        TakeScreens.takeScreenshot(driver, "logged_out");
    }

    @Then("^warning message appears and user is login fails$")
    public void assertWarningAllert(){
//        mainPage.assertAlertNotification();
        TakeScreens.takeScreenshot(driver, "login_failed");
    }

    @Then("^product is added to cart$")
    public void assertProductIsAddedToCart() throws Exception {
        cartPage.assertProductAddedToCart();
    }
    @Then("^verify is in wishlist$")
    public void verifyIsInWishlist() throws InterruptedException {
//        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Thread.sleep(5000);
        Waiter.waiter();
        mainPage.assertProductInWischlist();

    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {

        cadouPentruEa.assertInCartItem();
    }

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriile.assertCheckIsInCart();

    }

    @Then("^dislpays only products of manufacturer '(.*)'$")
    public void dislpaysOnlyProductsOfManufacturerManufacturer(String manufacturer) {
        if (manufacturer.equals("Apple")) {
            smartphonesCategory.filterAppleAssert();
        } else if (manufacturer.equals("Xiaomi")) {
            smartphonesCategory.filterXiaomiAssert();
        }
    }
}
