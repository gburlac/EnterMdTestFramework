package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import org.apache.log4j.Logger;
import pages.*;
import util.Waiter;

public class AddingToCartFunctionSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    ProductPage productPage = page.getProductPage();
    CartPage cartPage = page.getCartPage();
    CadouPentruEaPage cadouPentruEaPage = page.getCadouPentruEaPage();
    ToateCategoriilePage toateCategoriilePage = page.getToateCategoriilePage();
    static Logger log = Logger.getLogger(AddingToCartFunctionSteps.class);


    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEaPage.clickCadouPentruEaLink();
        log.info("Go to cadou pentru ea category");
    }

    @When("^select product from the page$")
    public void selectAProductFromThePage() {
        cadouPentruEaPage.clickSelectProductName();
        ScenarioContext.setContext(Context.PRODUCT_NAME, cadouPentruEaPage.getProductName());
        cadouPentruEaPage.clickButtonAddToCartFromProd();
        log.info("Select a product from the page");
    }

    @When("^go to cart from popup$")
    public void goToCartFromPopup() {
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        cadouPentruEaPage.clickButtonGoToCart();
        log.info("Go to cart");
    }

    @Then("^verify is in cart$")
    public void verifyIsInCart() {
        cadouPentruEaPage.assertInCartItem();
        log.info("Verify is in cart");
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

    @When("^select a product and add to cart$")
    public void selectAndAddToCart() {
        Waiter.waitById("button_cart_98934");
        toateCategoriilePage.clickAddToCart();
        Waiter.waitByXPath("//a[contains(@class, 'ty-btn ty-btn__primary')]");
        toateCategoriilePage.clickbuttonVizualizatiCosul();
        log.info("Select and add to cart");
    }

    @Then("^verify selected product is in cart$")
    public void verifySelectedProductIsInCart() {
        toateCategoriilePage.assertCheckIsInCart();
        log.info("Verify selected product is in cart");
    }

    @When("^user select (.*?) category and add productId (.*?) product to cart$")
    public void addProductToCart(String category, int productId) throws Exception {
        mainPage.openAllCategories();
        switch (category) {
            case "Phones":
                mainPage.openAllTelefoaneCategories();
                mainPage.goToSmartphones();
                mainPage.selectProduct(productId);
                break;
            case "TV":
                mainPage.openAllTVCategories();
                mainPage.goToTelevizoare();
                mainPage.selectProduct(productId);
                break;
            case "Transport":
                mainPage.openAllTransportCategories();
                mainPage.goToTransportElectric();
                mainPage.selectProduct(productId);
                break;
        }
        ScenarioContext.setContext(Context.PRODUCT_NAME, productPage.getProductName());
        productPage.addProductToCart();
        log.info(category + " category is selected and product " + productId + " is added to cart.");
    }

    @When("user goes to cart")
    public void goToCart() throws Exception {
        productPage.clickOnCartIcon();
        productPage.goToCart();
        log.info("Opening cart page.");
    }

    @Then("^product is added to cart$")
    public void assertProductIsAddedToCart() throws Exception {
        String prodName = (String) ScenarioContext.getContext(Context.PRODUCT_NAME);
        cartPage.assertProductAddedToCart(prodName);
    }
}
