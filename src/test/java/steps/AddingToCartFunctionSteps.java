package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.CadouPentruEa;
import pages.ToateCategoriile;
import util.Waiter;

public class AddingToCartFunctionSteps {
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    static Logger log = Logger.getLogger(AddingToCartFunctionSteps.class);

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

    @When("^go to cart$")
    public void goToCart() {
        cadouPentruEa.clickButtonGoToCart();
        log.info("go to cart");
    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {
        cadouPentruEa.assertInCartItem();
        log.info("verify is in cart");
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

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriile.assertCheckIsInCart();
        log.info("verify selected product is in cart");
    }

}
