package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.CastiPage;
import pages.Page;
import util.Waiter;

import java.util.List;

public class CheckoutFunctionSteps {
    Page page = new Page();
    CastiPage castiPage = page.getCastiPage();
    static Logger log = Logger.getLogger(CheckoutFunctionSteps.class);

    @When("^go to casti category$")
    public void goToCastiCategory() {
        castiPage.clickButonCasti();
        log.info("Go to casti category");
    }

    @When("^select a product$")
    public void selectAProduct() {
        castiPage.clickButonAddtocartProduct();
        log.info("Select a product");
    }

    @When("^place a order$")
    public void placeAOrder() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        castiPage.clickButonCartStatusPopUp();
        Waiter.waitByXPath("//button[@name='dispatch[checkout.customer_info]']");
        castiPage.clickButonCartProcessFaraInregistrare();
        log.info("Place a order");
    }


    @When("^fill out the delivery info$")
    public void fillOutTheDeliveryInfo(DataTable dt) {
        List<String> value = dt.asList(String.class);
        Waiter.waitById("elm_15");
        castiPage.fillInputPrenume(value.get(0));
        castiPage.fillInputNume(value.get(1));
        castiPage.fillInputEmail(value.get(2));
        castiPage.fillInputPhoneNumber(value.get(3));
        castiPage.fillInputCity(value.get(4));
        castiPage.fillInputAddres(value.get(5));
        castiPage.clickButtonContinue();
        Waiter.waitById("step_three_but");
        castiPage.clickButtonDeliveryOption();
        castiPage.clickButtonAmplaseazaComanda();
        log.info("Fill out the delivery info");

    }

    @Then("^verify the success message$")
    public void verifyTheSuccessMessage() {
        castiPage.assertingConfirmationOfPurchase();
        log.info("Verify the success message");
    }
}
