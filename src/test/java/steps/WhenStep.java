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
        log.info("input in search bar ");
    }

    @When("^select '(.*)' device$")
    public void selectOnePlusProDevice(String manufacture) {
        if (manufacture.equals("Iphone 11"))
            mainPage.clickbuttonselectIphone();
        else if (manufacture.equals("OnePlus 7 Pro"))
            mainPage.clickOnSelectOnePlus();
        log.info("select '(.*)' device");
    }

    @When("^buy product in credit$")
    public void buyProductInCredit() {
        mainPage.clickButtonBuyInCredit();
        log.info("Buy product in credit");
    }


    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEa.clickCadouPentruEaLink();
        log.info("go to cadou pentru ea category");
    }

    @When("^select a product from the page$")
    public void selectAProductFromThePage() {
        cadouPentruEa.clickproductFromCadouPentruEa();
        log.info("select a product from the page");
    }

    @When("^select color to blue$")
    public void selectColorToBlue() {
        cadouPentruEa.clickChangeColorToBlueDark();
        log.info("select color to blue");
    }

    @When("^add to cart$")
    public void addToCart() {
        cadouPentruEa.clickButtonAddToCart();
        log.info("add to cart");
    }

    @When("^go to cart$")
    public void goToCart() {
        cadouPentruEa.clickButtonGoToCart();
        log.info("go to cart");
    }

    @When("^go to periferice$")
    public void goToPeriferice() {
        toateCategoriile.clickButonToateCategoriile();
        log.info("go to periferice");

    }

    @When("^select PC si periferice$")
    public void selectPCSiPeriferice() {
        toateCategoriile.clickpcPeriferice();
        log.info("select PC si periferice");
    }

    @When("^select tastaturi$")
    public void selectTastaturi() {
        toateCategoriile.clickbuttonTastaturi();
        log.info("select tastaturi");
    }

    @When("^select option from filter$")
    public void selectTwoOptionFromFilter() {
        toateCategoriile.selectOptionTastaturi();
        log.info("select option from filter");
    }

    @When("^select and add to cart$")
    public void selectAndAddToCart() {
        Waiter.waitByXPath("//button[@id='button_cart_98934']");
        toateCategoriile.clickAddToCart();
        log.info("select and add to cart");

    }

    @When("^go to see the cart$")
    public void goToSeeTheCart() {
        toateCategoriile.clickbuttonVizualizatiCosul();
        log.info("go to see the cart");
    }


    @When("^go to casti category$")
    public void goToCastiCategory() {
        castiPage.clickButonCasti();
        log.info("go to casti category");
    }

    @When("^select a product$")
    public void selectAProduct() {
        castiPage.clickButonAddtocartProduct();
        log.info("select a product");
    }

    @When("^take a look to cart$")
    public void takeALookToCart() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
        log.info("take a look to cart");
    }

    @When("^place a order$")
    public void placeAOrder() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
        Waiter.waitByXPath("//button[@name='dispatch[checkout.customer_info]']");
        castiPage.clickButonCartProcessFaraInregistrare();
        log.info("place a order");
    }


    @When("^fill out the delivery info$")
    public void fillOutTheDeliveryInfo(DataTable dt) {
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
        log.info("fill out the delivery info");

    }
}
