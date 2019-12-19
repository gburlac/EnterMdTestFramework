package steps;

import context.ScenarioContext;
import enums.Context;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CartPage;

public class DeleteProductFromCart {

    ScenarioContext scenarioContext = new ScenarioContext();
    CartPage cartPage = new CartPage();
    @FindBy(xpath = "//div[contains(@class, 'am-cart-item')]//div[contains(@class, 'ty-center')]//input")
    WebElement phoneQuantity;
    @FindBy(xpath = "//div[@id='quantity_update_2776009334']//a[@class='cm-decrease ty-value-changer__decrease']")
    WebElement phoneQuantityDecreaser;

    @When("^user delete (.*?) product$")
    public void deleteProduct(String product) throws InterruptedException {
        switch (product) {
            case "Phones":
                cartPage.deletePhoneFromCart();
                break;
            case "TV":
               cartPage.deleteTVFromCart();
                break;
            case "Transport":
                cartPage.deleteTransportFromCart();
                break;
        }
    }

    @Then("^product is deleted$")
    public void assertProductDeleted() throws Exception {
        String prodName = (String) scenarioContext.getContex(Context.PRODUCT_NAME);
        cartPage.assertProductDeletedFromCart(prodName);
//        cartPage.assertProductName();
    }
}
