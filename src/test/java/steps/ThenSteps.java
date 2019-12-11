package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ThenSteps {
    MainPage mainPage = new MainPage();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    Smartphones smartphones = new Smartphones();
    WebDriver driver = Driver.getDriver();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

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

//    @Then("^home page is displayed and user is logged in$")
//    public void assertUserLoggedMainPageDisplayed() throws Exception {
//        Waiter.waitbyClassName("ty-banner__image-item");
//        mainPage.checkThatUserIsLoggedIn();
//        TakeScreens.takeScreenshot(driver, "user_is_logged");
//    }

//    @Then("^login menu popup is displayed$")
//    public void loginPopupAsserts() {
//        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
//        mainPage.showAssertsLoginMenu();
//        TakeScreens.takeScreenshot(driver, "login_menu");
//    }

//    @Then("^login window pops up$")
//    public void loginWindowPopupAssert() throws InterruptedException {
//        Waiter.waitById("loginbutton");
//        TakeScreens.takeScreenshot(driver, "login_popup_window");
//    }

//    @Then("^email and password fiels are filled in$")
//    public void checkThatCredentialsAreSent() throws InterruptedException {
//        Thread.sleep(2000);
//        TakeScreens.takeScreenshot(driver, "login_and_password_filled");
//    }


//    @Then("^user is logged in via facebook profile and home page is displayed$")
//    public void assertUserIsLogged() throws Exception {
//        String pageName = driver.getTitle();
//        System.out.println(">>>>> page name is: " + pageName);
//        Waiter.waitbyClassName("ty-banner__image-item");
//        mainPage.checkThatUserIsLoggedIn();
//        TakeScreens.takeScreenshot(driver, "user_is_logged");
//    }

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



//
//    @Then("^all 'samsung' phones are displayed$")
//    public void assertSamsungIsDisplayed() throws Exception {
//        Waiter.waitByXPath("//img[@id='det_img_98764']");
//        smartphones.showSamsungAssert();
//        TakeScreens.takeScreenshot(driver, "samsung_phones");
//
//    }
}
