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
    static Logger log = Logger.getLogger(FilteringSteps.class);

    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() throws InterruptedException {
        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        log.info("Smartphones is selected");
    }

}
