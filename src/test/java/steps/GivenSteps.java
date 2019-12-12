package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class GivenSteps {
    WebDriver driver = Driver.getDriver();
    WhenStep whenStep = new WhenStep();
    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws InterruptedException {
        Driver.getDriver().get("https://enter.online/");
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
//        Thread.sleep(5000);
        TakeScreens.takeScreenshot(driver, "home_page");
    }
    @Given("^user is logged in$")
    public void login() throws Exception {
        userIsOnHomepage();
        whenStep.loginViaFB();
    }
}
