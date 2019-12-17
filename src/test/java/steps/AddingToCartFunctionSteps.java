package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.CadouPentruEaPage;
import pages.*;
import pages.ToateCategoriilePage;
import util.Waiter;

public class AddingToCartFunctionSteps {
    Page page = new Page();
    CadouPentruEaPage cadouPentruEaPage = page.getCadouPentruEaPage();
    ToateCategoriilePage toateCategoriilePage = page.toateCategoriilePage();
    static Logger log = Logger.getLogger(AddingToCartFunctionSteps.class);

    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEaPage.clickCadouPentruEaLink();
        log.info("go to cadou pentru ea category");
    }

    @When("^select a product from the page$")
    public void selectAProductFromThePage() {
        cadouPentruEaPage.clickproductFromCadouPentruEa();
        log.info("select a product from the page");
    }

    @When("^go to cart$")
    public void goToCart() {
        cadouPentruEaPage.clickButtonGoToCart();
        log.info("go to cart");
    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {
        cadouPentruEaPage.assertInCartItem();
        log.info("verify is in cart");
    }

    @When("^go to periferice$")
    public void goToPeriferice() {
        toateCategoriilePage.clickButonToateCategoriile();
        log.info("go to periferice");
    }

    @When("^select PC si periferice$")
    public void selectPCSiPeriferice() {
        toateCategoriilePage.clickpcPeriferice();
        log.info("select PC si periferice");
    }

    @When("^select tastaturi$")
    public void selectTastaturi() {
        toateCategoriilePage.clickbuttonTastaturi();
        log.info("select tastaturi");
    }

    @When("^select option from filter$")
    public void selectTwoOptionFromFilter() {
        toateCategoriilePage.selectOptionTastaturi();
        log.info("select option from filter");
    }

    @When("^select and add to cart$")
    public void selectAndAddToCart() {
        Waiter.waitByXPath("//button[@id='button_cart_98934']");
        toateCategoriilePage.clickAddToCart();
        log.info("select and add to cart");
    }

    @When("^go to see the cart$")
    public void goToSeeTheCart() {
        toateCategoriilePage.clickbuttonVizualizatiCosul();
        log.info("go to see the cart");
    }

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriilePage.assertCheckIsInCart();
        log.info("verify selected product is in cart");
    }

}
