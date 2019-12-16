package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import util.Driver;
import pages.*;
import pages.Page;

public class CommonSteps {

    static Logger log = Logger.getLogger(CommonSteps.class);
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");
        log.info("User is on homepage");
    }
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    @When("^User changes language$")
    public void userChangesLanguage() {
        mainPage.langChangerClick();
    }


}
