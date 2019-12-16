package steps;

import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.MainPage;
import pages.Page;

public class CommonSteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    static Logger log = Logger.getLogger(WhenStep.class);

    @When("^User changes language$")
    public void userChangesLanguage() {
        mainPage.langChangerClick();
    }


}
