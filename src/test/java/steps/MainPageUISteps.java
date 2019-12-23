package steps;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import pages.MainPage;
import pages.Page;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class MainPageUISteps {
    Page page = new Page();
    MainPage mainPage = page.getMainPage();
    static Logger log = Logger.getLogger(MainPageUISteps.class);


    @Then("^All non-changeable elements with text are displayed on selected language$")
    public void thenAllNonChangeableElementsWithTextAreDisplayedOnSelectedLanguage() {
        Waiter.waitByXPath("//div[contains(@class,'uk-flex-middle attar-header')]//div[contains(@class,'uk-width-auto@m')]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Language is changed, user is on main page");
        mainPage.assertMainPageUIElements();
        TakeScreens.takeScreenshot(Driver.getDriver(), "UI elements checked");
        log.info("UI elements are present");
    }

    @Then("^All non-changeable elements is present and selected language is romanian$")
    public void allNonChangeableElementsIsPresentAndSelectedLanguageIsRomanian() {
        Waiter.waitByXPath("//div[contains(@class,'uk-flex-middle attar-header')]//div[contains(@class,'uk-width-auto@m')]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Is on main page");
        mainPage.assertMainPageUIElements();
        TakeScreens.takeScreenshot(Driver.getDriver(), "UI elements checked");
        log.info("UI elements are present");
    }
}
