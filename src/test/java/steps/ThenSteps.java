package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.message.TimestampMessage;
import pages.CadouPentruEa;
import pages.Electrocasnice;
import pages.MainPage;
import pages.ToateCategoriile;
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

}
