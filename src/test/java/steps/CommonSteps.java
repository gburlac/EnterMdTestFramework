package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import util.Driver;
import pages.*;
import pages.Page;
import util.TakeScreens;
import util.Waiter;

public class CommonSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    static Logger log = Logger.getLogger(CommonSteps.class);

    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() {
        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPath("//span[contains(@class,'support-trigger-round-icon support-icon-comments-o')]");
        log.info("Smartphones is selected");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Smartphones category is selected");
    }

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");
        log.info("User is on homepage");
    }

    @When("^User changes language of interface$")
    public void userChangesLanguage() {
        mainPage.langChangerClick();
        log.info("User changed language on Russian");
    }


}
