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

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");
        log.info("User is on homepage");
    }

    @Given("^Home page is displayed$")
    public void homePageIsDisplayed() {
        Driver.getDriver().get("https://enter.online/");
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
        TakeScreens.takeScreenshot(Driver.getDriver(), "home_page");
        log.info("Enter.Online home page is opened.");
    }

    @When("^User changes language$")
    public void userChangesLanguage() {
        mainPage.langChangerClick();
        log.info("User changes language on Russian");
    }

}
