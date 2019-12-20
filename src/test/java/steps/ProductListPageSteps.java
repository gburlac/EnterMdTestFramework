package steps;

import context.ScenarioContext;
import cucumber.api.java.en.And;
import enums.Context;
import org.apache.log4j.Logger;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ProductListPageSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    ProductListPage productListPage = page.getProductListPage();
    static Logger log = Logger.getLogger(ProductListPageSteps.class);

    @And("^User selects product$")
    public void userSelectsProduct() {
        productListPage.openProductPageByID();
        TakeScreens.takeScreenshot(Driver.getDriver(), "product "+ ScenarioContext.getContext(Context.PRODUCT_NAME)+" is selected");
        log.info(ScenarioContext.getContext(Context.PRODUCT_NAME)+" Product page is opened");
    }
}
