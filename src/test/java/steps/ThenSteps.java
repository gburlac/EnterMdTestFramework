package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.message.TimestampMessage;
import pages.*;
import util.*;

import java.security.Timestamp;
import java.util.concurrent.TimeUnit;

import pages.ToateCategoriile;
import util.*;

import java.util.concurrent.TimeUnit;

public class ThenSteps<log> {
    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    CastiPage castiPage = new CastiPage();
    static Logger log = Logger.getLogger(ThenSteps.class);

    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        electrocasnice.electroCasniceCategory();
        TakeScreens.takeScreenshot(Driver.getDriver(), "electrcasnice");
        log.info("Electrocasnice category is displayed");
    }

    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        electrocasnice.tehnicaDeBucatarieLabel();
        TakeScreens.takeScreenshot(Driver.getDriver(), "tehnicaDeBucatarieLabel");
        log.info("Tehnica de bucatarie part is displayed");
    }

    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        electrocasnice.aparateDeUzCasnicePart();
        TakeScreens.takeScreenshot(Driver.getDriver(), "aparateDeUzCasnicePartIsDisplaed");
        log.info("Aparate de uz casnice part is displaed");
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        electrocasnice.ingrijirePersonala();
        TakeScreens.takeScreenshot(Driver.getDriver(), "ingrijirePersonalaPartIsDisplayed");
        log.info("Ingrijire personala part is displayed");
    }

    @Then("^verify '(.*)' is in wishlist$")
    public void verifyIsInWishlist(String manufacture) throws InterruptedException {
        Waiter.waitByXPath("//*[@id=\"det_img_98549\"]");
        if (manufacture.equals("Iphone 11"))
            mainPage.assertbuttonCheckProductInWischlistIphone();
        else if (manufacture.equals("OnePlus 7 Pro"))
            mainPage.assertProductInWischlist();
        log.info("verify if  product is in wishlist");
    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {
        cadouPentruEa.assertInCartItem();
        log.info("verify is in cart");
    }

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriile.assertCheckIsInCart();
        log.info("verify selected product is in cart");
    }

    @Then("^verify credit page is displayed$")
    public void verifyCreditPageIsDisplayed() throws InterruptedException {
        Waiter.waitByXPath("//div[@class='tab-credit-submit']//input[2]");
        mainPage.assertcheckCreditPage();
        log.info("verify credit page is displayed");
    }

    @Then("^verify the success message$")
    public void verifyTheSuccessMessage() {
        castiPage.assertingConfirmationOfPurchase();
        log.info("verify the success message");
    }
}
