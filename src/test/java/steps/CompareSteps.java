package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Pa;
import org.apache.log4j.Logger;
import org.mortbay.log.Log;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class CompareSteps {
    Page page = new Page();
    ProductListPage productListPage = page.getProductListPage();
    ProductPage productPage = page.getProductPage();
    ComparingPage comparingPage = page.getComparingPage();
    static org.apache.log4j.Logger log = Logger.getLogger(CommonSteps.class);

    @And("^clicks \\[Compare\\] button on 2 any products$")
    public void clicksCompareButtonOnAnyProducts() {
        productListPage.addingProductsInCompareList(1);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        productListPage.addingProductsInCompareList(4);
    }

    @And("^User clicks on \\[List of comparing\\] button$")
    public void userClicksOnListOfComparingButton() {
        productListPage.compareButtonClick();
        TakeScreens.takeScreenshot(Driver.getDriver(), "List of comparing is displayed");
    }

    @And("^clicks \\[Compare\\] button$")
    public void clicksCompareButton() {
        productPage.addToCompareListButtonClick();
        log.info("Add product to compare list button is clicked");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Add product to compare list button is clicked");
    }

    @Then("^appears page with comparing of selected products$")
    public void appearsPageWithComparingOfSelectedProducts() {
        comparingPage.assertNumberOfAddToCartButtons();
        Log.info("List of comparing is displayed");
    }
}
