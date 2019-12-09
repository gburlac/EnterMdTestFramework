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

import util.*;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;


public class WhenStep {

    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();


    static Logger log = Logger.getLogger(WhenStep.class);


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
        Waiter.waiter();
        toateCategoriile.selectOptionTastaturi2();
        Waiter.waiter();
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


}
