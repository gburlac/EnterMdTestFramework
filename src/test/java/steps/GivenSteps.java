package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class GivenSteps {
    WebDriver driver = Driver.getDriver();
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        driver.get("https://enter.online/");
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
//        Waiter.waitbyClassName("ty-banner__image-item");
        TakeScreens.takeScreenshot(driver, "home_page");
    }
}
