package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import util.*;

public class GivenSteps {
    WebDriver driver = Driver.getDriver();
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        driver.get("https://enter.online/");
        Waiter.waiter();
        TakeScreens.takeScreenshot(driver, "home_page");
    }
}
