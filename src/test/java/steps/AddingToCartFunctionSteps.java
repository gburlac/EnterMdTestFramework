package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import org.apache.log4j.Logger;
import pages.CadouPentruEaPage;
import pages.Page;
import pages.ToateCategoriilePage;
import util.Waiter;

public class AddingToCartFunctionSteps {
    Page page = new Page();
    CadouPentruEaPage cadouPentruEaPage = page.getCadouPentruEaPage();
    ToateCategoriilePage toateCategoriilePage = page.getToateCategoriilePage();
    static Logger log = Logger.getLogger(AddingToCartFunctionSteps.class);
    ScenarioContext scenarioContext = new ScenarioContext();

    @When("^go to cadou pentru ea category$")

    public void goToCadouPentruEaCategory() {
        cadouPentruEaPage.clickCadouPentruEaLink();
        log.info("Go to cadou pentru ea category");
    }

    @When("^select product (.*?) from the page$")
    public void selectAProductFromThePage(int product) throws InterruptedException {
        cadouPentruEaPage.clickProductNameFromCategory(product);
        scenarioContext.setContext(Context.PRODUCT_NAME, cadouPentruEaPage.getProductName(product));
        cadouPentruEaPage.addToCart(product);
        log.info("Select a product from the page");
        // TODO: setProductName Scenario context
    }

    @When("^go to cart$")
    public void goToCart() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        cadouPentruEaPage.clickButtonGoToCart();
        log.info("Go to cart");
    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {
        cadouPentruEaPage.assertInCartItem();
        log.info("Verify is in cart");
        // TODO: assert getProductName Scenario context

    }

    @When("^go to periferice$")
    public void goToPeriferice() {
        toateCategoriilePage.clickButonToateCategoriile();
        log.info("Go to periferice");
    }

    @When("^select PC si periferice$")
    public void selectPCSiPeriferice() {
        toateCategoriilePage.clickpcPeriferice();
        log.info("Select PC si periferice");
    }

    @When("^select tastaturi$")
    public void selectTastaturi() {
        toateCategoriilePage.clickbuttonTastaturi();
        log.info("Select tastaturi");
    }

    @When("^select option from filter$")
    public void selectTwoOptionFromFilter() {
        Waiter.waitById("elm_checkbox_376_239_61352");
        toateCategoriilePage.selectOptionTastaturi();
        log.info("Select option from filter");
    }

    @When("^select and add to cart$")
    public void selectAndAddToCart() {
        Waiter.waitById("button_cart_98934");
        toateCategoriilePage.clickAddToCart();
        log.info("Select and add to cart");
    }

    @When("^go to see the cart$")
    public void goToSeeTheCart() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        toateCategoriilePage.clickbuttonVizualizatiCosul();
        log.info("Go to see the cart");
    }

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriilePage.assertCheckIsInCart();
        log.info("Verify selected product is in cart");
    }

}
