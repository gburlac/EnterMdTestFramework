package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pages.CartPage;
import pages.MainPage;
import pages.ProductPage;

public class AddProductToCart {

    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    ScenarioContext scenarioContext = new ScenarioContext();


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
        scenarioContext.setContext(Context.PRODUCT_NAME, productPage.getProductName());
        productPage.addProductToCart();
    }

    @When("user goes to cart")
    public void goToCart() throws Exception {
        productPage.clickOnCartIcon();
        productPage.goToCart();
    }

    @Then("^product is added to cart$")
    public void assertProductIsAddedToCart() throws Exception {
        String prodName = (String) scenarioContext.getContex(Context.PRODUCT_NAME);
        cartPage.assertProductAddedToCart(prodName);
    }
}
