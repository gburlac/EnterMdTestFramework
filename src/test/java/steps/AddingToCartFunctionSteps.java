package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import org.apache.log4j.Logger;
import pages.*;

public class AddingToCartFunctionSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    ProductPage productPage = page.getProductPage();
    CartPage cartPage = page.getCartPage();
    static Logger log = Logger.getLogger(AddingToCartFunctionSteps.class);

    @When("^user select (.*?) category and add productId (.*?) product to cart$")
    public void addProductToCart(String category, int productId) {
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
