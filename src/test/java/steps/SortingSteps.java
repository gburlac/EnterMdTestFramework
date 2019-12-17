package steps;

import cucumber.api.java.en.And;
import pages.Page;
import pages.ProductPage;

public class SortingSteps {
    Page page = new Page();
    ProductPage productPage = page.getProductPage();
    @And("^change values in sorting dropdowns$")
    public void changeValuesInSortingDropdowns() throws InterruptedException {
        productPage.sortingByNameAscendingOrder();
        Thread.sleep(55000);
    }
}
