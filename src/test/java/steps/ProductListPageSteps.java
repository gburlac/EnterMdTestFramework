package steps;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import pages.*;

public class ProductListPageSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    ProductListPage productListPage = page.getProductListPage();
    static Logger log = Logger.getLogger(ProductListPageSteps.class);

    @And("^User selects product$")
    public void userSelectsProduct() {
        productListPage.openProductPageByID();
        log.info("Product page is opened");
    }
}
