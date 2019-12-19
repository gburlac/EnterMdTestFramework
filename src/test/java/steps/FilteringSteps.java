package steps;

import enums.Context;
import context.ScenarioContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import pages.Page;
import pages.*;
import util.Waiter;

public class FilteringSteps<log> {
    Page page = new Page();
    ProductListPage productListPage = page.getProductListPage();
    static Logger log = Logger.getLogger(FilteringSteps.class);


    @And("^change value in Manufacturer field to '(.*)'$")
    public void changeValueInManufacturerFieldToManufacturer(int manufacturer) {
            productListPage.checkFilterCheckbox(manufacturer);
            log.info("Filter smartphones by manufacturer "+ ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER));
            Waiter.waitByXPathUntilDissapear("//div[@id=\"ajax_loading_box\"]");
    }

    @Then("^dislpays only products of manufacturer '(.*)'$")
    public void dislpaysOnlyProductsOfManufacturerManufacturer(int manufacturer) {
            productListPage.filterAssert();
            log.info("Displayed only "+ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER)+" smartphones");
            System.out.println(ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER));
    }
}
