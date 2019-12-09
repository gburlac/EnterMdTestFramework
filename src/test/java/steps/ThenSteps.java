package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import pages.CadouPentruEa;
import pages.Electrocasnice;
import pages.MainPage;
import pages.ToateCategoriile;
import util.*;

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

    }

    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        electrocasnice.tehnicaDeBucatarieLabel();
    }

    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        electrocasnice.aparateDeUzCasnicePart();
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        electrocasnice.ingrijirePersonala();
    }
    @Then("^verify is in wishlist$")
    public void verifyIsInWishlist() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        mainPage.assertProductInWischlist();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
