package steps;

import context.ScenarioContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;


public class PaginationContentSteps {
    Page page = new Page();
    ProductListPage productListPage = page.getProductListPage();
    static org.apache.log4j.Logger log = Logger.getLogger(PaginationContentSteps.class);
    @And("changes value in pagination content to '(.*)' dropdown")
    public void changeValuesInSortingDropdowns(String dropdownValue)  {
        productListPage.changingCountOfItemsOnPage(dropdownValue);
        log.info("selecting value in dropdown: " + dropdownValue);
        Waiter.waitByXPathUntilDissapear("//div[@id=\"ajax_loading_box\"]");
        TakeScreens.takeScreenshot(Driver.getDriver(), dropdownValue + " value in dropdown is selected");
    }


    @Then("^The (.*?) of displayed products on page is the same with selected$")
    public void theCountOfDisplayedProductsOnPageIsTheSameWithSeleced(int count) {
        productListPage.checkCountOfItemsOnPage(count);
        log.info("Items checked. Actual result: " + count + " Expected: ");
    }
}
