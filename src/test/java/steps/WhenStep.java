package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

import java.util.concurrent.TimeUnit;

public class WhenStep {
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    ProductPage productPage = new ProductPage();
    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    SmartphonesCategory smartphonesCategory = new SmartphonesCategory();
    static org.apache.log4j.Logger log = Logger.getLogger(WhenStep.class);
    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        electrocasnice.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
        mainPage.searchBarMethod();
    }

    @When("^select OnePlus (\\d+) Pro device$")
    public void selectOnePlusProDevice(int arg0) throws InterruptedException {
//        Thread.sleep(5000);
        mainPage.clickOnSelectOnePlus();

    }

    @When("^add to wishlist$")
    public void addToWishlist() {
        mainPage.clickbuttonAddToWishlist();

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
    public void enterCredentials() throws Exception {
        WindowsHandler.switchWindow();
        Thread.sleep(5000);
        loginPopup.inputEmail("qweqwewq@me.com");
        loginPopup.inputPassword("123123");
    }

    @When("^user press login button$")
    public void clickLoginButton(){
        loginPopup.login();
//        WindowsHandler.switchBack();
//        WindowsHandler.getParentWindow();
    }
    @When("^go to wishlist$")
    public void goToWishlist() throws InterruptedException {
//        Thread.sleep(5000);
        mainPage.clickbuttonCheckWischlist();

    }

    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEa.clickCadouPentruEaLink();
    }

    @When("^select Bobby Compact anti-theft product$")
    public void selectBobbyCompactAntiTheftProduct() throws InterruptedException {
//        Thread.sleep(4000);
        cadouPentruEa.clickProductBobyCompact();
    }

    @When("^select color to blue$")
    public void selectColorToBlue() {
        cadouPentruEa.clickChangeColorToBlueDark();
    }

    @When("^add to cart$")
    public void addToCart() {
        cadouPentruEa.clickButtonAddToCart();
    }

    @When("^go to cart$")
    public void goToCart() throws InterruptedException {
//        Thread.sleep(1000);
        cadouPentruEa.clickButtonGoToCart();
    }

    @When("^go to periferice$")
    public void goToPeriferice() {
        toateCategoriile.clickButonToateCategoriile();

    }

    @When("^select PC si periferice$")
    public void selectPCSiPeriferice() {
        toateCategoriile.clickpcPeriferice();
    }

    @When("^select tastaturi$")
    public void selectTastaturi() {
        toateCategoriile.clickbuttonTastaturi();
    }

    @When("^select two option from filter$")
    public void selectTwoOptionFromFilter() throws InterruptedException {
        toateCategoriile.selectOptionTastaturi();
//        Thread.sleep(1000);
//        Waiter.waiter();
        toateCategoriile.selectOptionTastaturi2();
//        Waiter.waiter();
//        Thread.sleep(1000);
    }

    @When("^select and add to cart$")
    public void selectAndAddToCart() throws InterruptedException {
        toateCategoriile.clickAddToCart();
//        Thread.sleep(4000);
    }

    @When("^go to see the cart$")
    public void goToSeeTheCart() throws InterruptedException {
//        toateCategoriile.clickOnCart();
        toateCategoriile.clickbuttonVizualizatiCosul();
    }


    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() throws InterruptedException {
        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Smartphones");
    }

    @And("^change value in Manufacturer field to '(.*)'$")
    public void changeValueInManufacturerFieldToManufacturer(String manufacturer) throws InterruptedException {
        if(manufacturer.equals("Apple"))
            smartphonesCategory.checkFilterAppleCheckbox();
        else if (manufacturer.equals("Xiaomi"))
            smartphonesCategory.checkFilterXiaomiCheckbox();
        Waiter.waitByXPathUntilVisible("//*[@id=\"ajax_loading_box\"]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Filter " + manufacturer + " enabled");
    }

    @When("^user select category and add product to cart$")
    public void addProductToCart() throws Exception {
        mainPageAsLogged.openAllCategories();
        mainPageAsLogged.openAllTelefoaneCategories();
        mainPageAsLogged.goToSmartphones();
        mainPageAsLogged.openPhoneDetails();
        productPage.addProductToCart();
        productPage.clickOnCartIcon();
        productPage.goToCart();
    }

//    @When("^user clicks on login menu$")
//    public void clickOnLoginMenu() {
//        mainPage.accessLoginMenu();
//    }

//    @When("^user clicks on 'facebook' icon$")
//    public void clickOnFacebookIcon() {
//        mainPage.loginViaFacebook();
//        WindowsHandler.switchWindow();
//    }

//    @When("^user enters credentials")
//    public void enterCredentials() {
//        Waiter.waitById("email");
//        Waiter.waitById("pass");
//        loginPopup.inputEmail("");
//        loginPopup.inputPassword("");
//    }

//    @When("^user press login button$")
//    public void clickLoginButton() {
//        loginPopup.login();
//        WindowsHandler.switchBackToMain();
//    }
/* ------------------------- */
//    @When("^user clicks on 'categoryList'$")
//    public void openCategoryList() {
//        mainPageAsLogged.openAllCategories();
//    }

//    @When("^user clicks on 'telefoane' category$")
//    public void openTelefoaneCategories() {
//        mainPageAsLogged.openAllTelefoaneCategories();
//    }

//    @When("^user clicks on 'smartphones' category$")
//    public void openSmartphonesCategory(){
//        mainPageAsLogged.goToSmartphones();
//    }

//    @When("^user clicks on product$")
//    public void openPhoneDetails() {
//        mainPageAsLogged.openPhoneDetails();
//    }

//    @When("^user add product to cart$")
//    public void addToCart() {
//        productPage.addProductToCart();
//    }

//    @When("^user clicks on cart icon$")
//    public void clickOnCartIcon() {
//        productPage.clickOnCartIcon();
//    }

//    @When("^user clicks on 'visualize cart' button$")
//    public void goToCart() throws Exception {
//        productPage.goToCart();
//    }
    @When("^user tries to log in with invalid credentials$")
    public void loginNegative(){
//        mainPage.accessLoginMenu();
//        Waiter.waitById("login_popup3262");
//        mainPage.inputNegativeEmail("testmail.com");
//        mainPage.clickLoginButton();
        mainPage.invalidLoginFlow("test@test.com", "1");
        mainPage.invalidLoginFlow("test@test.com", "   ");



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

    @When("^user click on logout option$")
    public void logout() throws Exception {
        mainPageAsLogged.logout();
    }

//
//    @When("^user choose 'samsung' brand$")
//    public void openSamsungPhones(){
//        mainPageAsLogged.goToSamsungPhones();
//    }
}
