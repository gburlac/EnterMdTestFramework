package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CadouPentruEa;
import pages.Electrocasnice;
import pages.LoginPopup;
import pages.MainPage;
import pages.ToateCategoriile;

import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WhenStep {

    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();


    static Logger log = Logger.getLogger(WhenStep.class);

    @When("^press on electrocasnice category$")
    LoginPopup loginPopup = new LoginPopup();

    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        mainPage.ClickOnelectroCasniceCategory();
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
//        Thread.sleep(2000);
        toateCategoriile.selectOptionTastaturi2();
//        Thread.sleep(2000);
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
