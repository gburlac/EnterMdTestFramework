package Functionalities;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.Driver;

public class AddProductToCart {
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @When("^user select category and add product to cart$")
    public void addProductToCart() throws Exception {
        mainPageAsLogged.openAllCategories();
        mainPageAsLogged.openAllTelefoaneCategories();
        mainPageAsLogged.goToSmartphones();
        mainPageAsLogged.openPhoneDetails();
        productPage.addProductToCart();
        productPage.clickOnCartIcon();
        productPage.goToCart();
    }

    @Then("^product is added to cart$")
    public void assertProductIsAddedToCart() throws Exception {
        cartPage.assertProductAddedToCart();
    }
}
