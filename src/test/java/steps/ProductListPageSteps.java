package steps;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import pages.*;

public class ProductListPageSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    Smartphones smartphones = page.getSmartphones();
    ProductListPage productListPage = page.getProductListPage();
    static Logger log = Logger.getLogger(FilteringSteps.class);

    @And("^User selects product$")
    public void userSelectsProduct() {
        productListPage.product1OpenProductPageClick();
        log.info("Product page is opened");
    }
}
