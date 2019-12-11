package steps;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import pages.*;
import util.*;

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

