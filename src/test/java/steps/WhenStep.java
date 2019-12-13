package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import util.*;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;


public class WhenStep {

    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    CastiPage castiPage = new CastiPage();


    static Logger log = Logger.getLogger(WhenStep.class);


    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        electrocasnice.ClickOnelectroCasniceCategory();
        log.info("Press on electrocasnice category");
    }

    @When("^input in search bar a '(.*)'$")
    public void inputInSearchBarAOnePlus(String value) {
        mainPage.searchBarMethod(value);
    }

    @When("^select '(.*)' device$")
    public void selectOnePlusProDevice(String manufacture) throws InterruptedException {
//        Thread.sleep(5000);
        if (manufacture.equals("Iphone 11"))
            mainPage.clickbuttonselectIphone();
        else if (manufacture.equals("OnePlus 7 Pro"))
            mainPage.clickOnSelectOnePlus();
    }

    @When("^buy product in credit$")
    public void buyProductInCredit() {
        mainPage.clickButtonBuyInCredit();

    }


    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEa.clickCadouPentruEaLink();
    }

    @When("^select a product from the page$")
    public void selectAProductFromThePage() {
        cadouPentruEa.clickproductFromCadouPentruEa();
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
        Waiter.waitByXPath("//button[@id='button_cart_98934']");
        toateCategoriile.selectOptionTastaturi2();
    }

    @When("^select and add to cart$")
    public void selectAndAddToCart() throws InterruptedException {
        Waiter.waitByXPath("//button[@id='button_cart_98934']");
        toateCategoriile.clickAddToCart();
    }

    @When("^go to see the cart$")
    public void goToSeeTheCart() throws InterruptedException {
        toateCategoriile.clickbuttonVizualizatiCosul();
    }


    @When("^go to casti category$")
    public void goToCastiCategory() {
        castiPage.clickButonCasti();
    }

    @When("^select a product$")
    public void selectAProduct() {
        castiPage.clickButonAddtocartProduct();
    }

    @When("^take a look to cart$")
    public void takeALookToCart() throws InterruptedException {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
    }

    @When("^place a order$")
    public void placeAOrder() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
        Waiter.waitByXPath("//button[@name='dispatch[checkout.customer_info]']");
        castiPage.clickButonCartProcessFaraInregistrare();
    }


    @When("^fill out the delivery info$")
    public void fillOutTheDeliveryInfo(DataTable dt) throws InterruptedException {
        List<String> value = dt.asList(String.class);
        castiPage.fillInputPrenume(value.get(0));
        castiPage.fillInputNume(value.get(1));
        castiPage.fillInputEmail(value.get(2));
        castiPage.fillInputPhoneNumber(value.get(3));
        castiPage.fillInputCity(value.get(4));
        castiPage.fillInputAddres(value.get(5));
        castiPage.clickButtonContinue();
        castiPage.clickButtonDeliveryOption();
        castiPage.clickButtonAmplaseazaComanda();

    }
}
