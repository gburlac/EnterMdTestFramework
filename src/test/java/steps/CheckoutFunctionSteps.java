package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.*;
import util.Waiter;

import java.util.List;

public class CheckoutFunctionSteps {
    Page page = new Page();
    CastiPage castiPage = page.getCastiPage();
    static Logger log = Logger.getLogger(CheckoutFunctionSteps.class);

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

    @Then("^verify the success message$")
    public void verifyTheSuccessMessage() {
        castiPage.assertingConfirmationOfPurchase();
        log.info("verify the success message");
    }
}
