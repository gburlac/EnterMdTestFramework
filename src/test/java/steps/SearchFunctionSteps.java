package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.MainPage;
import util.Waiter;

public class SearchFunctionSteps {
    MainPage mainPage = new MainPage();
    static Logger log = Logger.getLogger(SearchFunctionSteps.class);

    @When("^input in search bar a '(.*)'$")
    public void inputInSearchBarAOnePlus(String value) {
        mainPage.searchBarMethod(value);
        log.info("Input in search bar ");
    }

    @When("^select '(.*)' device$")
    public void selectOnePlusProDevice(String manufacture) {
        if (manufacture.equals("Iphone 11")) {
            Waiter.waitByXPath("//li[2]//a[1]//div[1]//div[2]//div[1]");
            mainPage.clickbuttonselectIphone();
        } else if (manufacture.equals("OnePlus 7 Pro")) {
            Waiter.waitByXPath("//div[contains(text(),'OnePlus 7 Pro')]");
            mainPage.clickOnSelectOnePlus();
        }
        log.info("Select a device");
    }

    @When("^buy product in credit$")
    public void buyProductInCredit() {
        mainPage.clickButtonBuyInCredit();
        log.info("Buy product in credit");
    }

    @Then("^verify credit page is displayed$")
    public void verifyCreditPageIsDisplayed() {
//        Waiter.waitByXPath("//div[@class='tab-credit-submit']//input[2]");
//        Waiter.waitbyClassName("tab-credit-submit");
        mainPage.assertcheckCreditPage();
        log.info("Verify credit page is displayed");
    }
}
