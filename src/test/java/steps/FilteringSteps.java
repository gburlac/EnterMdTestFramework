package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.MainPage;
import pages.Page;
import pages.*;
import util.Waiter;

public class FilteringSteps<log> {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    Smartphones smartphones = page.getSmartphones();
    static Logger log = Logger.getLogger(FilteringSteps.class);

    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() throws InterruptedException {
        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        log.info("Smartphones is selected");
    }

    @And("^change value in Manufacturer field to '(.*)'$")
    public void changeValueInManufacturerFieldToManufacturer(String manufacturer) throws InterruptedException {
        if(manufacturer.equals("Apple")) {
            smartphones.checkFilterAppleCheckbox();
            log.info("Filter Apple smartphones");
        } else if (manufacturer.equals("Xiaomi")) {
            smartphones.checkFilterXiaomiCheckbox();
            log.info("Filter Xiaomi smartphones");
        }
        Waiter.waitByXPathUntilDissapear("//*[@id=\"ajax_loading_box\"]");
    }

    @Then("^dislpays only products of manufacturer '(.*)'$")
    public void dislpaysOnlyProductsOfManufacturerManufacturer(String manufacturer) {
        if (manufacturer.equals("Apple")) {
            smartphones.filterAppleAssert();
            log.info("Displayed only Apple smartphones");
        } else if (manufacturer.equals("Xiaomi")) {
            smartphones.filterXiaomiAssert();
            log.info("Displayed only Xiaomi smartphones");
        }
    }
}
