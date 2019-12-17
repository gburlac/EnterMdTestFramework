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


    @Then("^All non-changeable elements is present$")
    public void allNonChangeableElementsIsPresent() {
        Waiter.waitByXPath("//*[@id=\"index\"]/div[1]/div/div[2]/div/div/div[2]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Is on main page");
        mainPage.assertLogoEnter();
        mainPage.assertNouatiSiPromotiiButton();
        mainPage.asserttElectrocasniceButton();
        mainPage.assertGadgeturiPentruOriceVirstaButton();
        mainPage.assertSfaturiUtileButton();
        TakeScreens.takeScreenshot(Driver.getDriver(), "UI elements checked");
        log.info("UI elements are present");
    }

    @Then("^Then all non-changeable elements with text are displayed on selected language$")
    public void thenAllNonChangeableElementsWithTextAreDisplayedOnSelectedLanguage() {
        Waiter.waitByXPath("//*[@id=\"index\"]/div[1]/div/div[2]/div/div/div[2]");
        TakeScreens.takeScreenshot(Driver.getDriver(), "Is on main page");
        mainPage.assertLogoEnter();
        mainPage.assertNouatiSiPromotiiButton();
        mainPage.asserttElectrocasniceButton();
        mainPage.assertGadgeturiPentruOriceVirstaButton();
        mainPage.assertSfaturiUtileButton();
        TakeScreens.takeScreenshot(Driver.getDriver(), "UI elements checked");
        log.info("UI elements are present");
    }
}
