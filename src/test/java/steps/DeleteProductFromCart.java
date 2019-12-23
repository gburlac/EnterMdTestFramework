package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pages.CartPage;

public class DeleteProductFromCart {

    CartPage cartPage = new CartPage();

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
        String prodName = (String) ScenarioContext.getContext(Context.PRODUCT_NAME);
        cartPage.assertProductDeletedFromCart(prodName);
    }
}
