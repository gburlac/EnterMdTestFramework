package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;


public class WhenStep <log>{
    WebDriver driver = Driver.getDriver();
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    SmartphonesCategory smartphonesCategory = page.getSmartphonesCategory();
    static Logger log = Logger.getLogger(ThenSteps.class);

    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() throws InterruptedException {

        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        log.info("Smartphones is selected");
    }

    @And("^change value in Manufacturer field to '(.*)'$")
    public void changeValueInManufacturerFieldToManufacturer(String manufacturer) throws InterruptedException {
        if(manufacturer.equals("Apple")) {
            smartphonesCategory.checkFilterAppleCheckbox();
            log.info("Filter Apple smartphones");
        } else if (manufacturer.equals("Xiaomi")) {
            smartphonesCategory.checkFilterXiaomiCheckbox();
            log.info("Filter Xiaomi smartphones");
        }
        Waiter.waitByXPathUntilDissapear("//*[@id=\"ajax_loading_box\"]");
    }

    @When("^User changes language$")
    public void userChangesLanguage() {
        mainPage.langChangerClick();
    }

}
