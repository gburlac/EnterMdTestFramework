package steps;

import context.ScenarioContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import enums.Context;
import org.apache.log4j.Logger;
import pages.*;
import pages.Page;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class CommonSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    static Logger log = Logger.getLogger(CommonSteps.class);

    @When("^User selects Smartphones category$")
    public void userSelectsAnyCategory() {
        mainPage.selectSmartphonesCategory();
        Waiter.waitByXPathUntilDissapear("//span[contains(@class,'support-trigger-round-icon support-icon-comments-o')]");
        Waiter.waitByXPath("//img[@class='ty-pict    cm-image']");
        log.info("Smartphones is selected");
    }

    @Given("^Home page is displayed$") // leave
    public void homePageIsDisplayed() {
        Driver.getDriver().get("https://enter.online/");
        Waiter.waitByXPath("//*[name()='path' and contains(@class,'svg-accoun')]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "home_page");
        log.info("Enter.Online home page is opened.");
    }

}
