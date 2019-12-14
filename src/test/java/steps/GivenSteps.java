package steps;

import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Page;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class GivenSteps <log>{
    WebDriver driver = Driver.getDriver();
    static Logger log = Logger.getLogger(ThenSteps.class);
    WhenStep whenStep = new WhenStep();
    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws InterruptedException {
        Driver.getDriver().get("https://enter.online/");
        Waiter.waitByXPath("//*[@id=\"banner_slider_5414\"]/div[1]/div/div[1]/div/div/div/a/picture/img");
        log.info("Get the enter.online");
    }
    @Given("^user is logged in$")
    public void login() throws Exception {
        userIsOnHomepage();
        whenStep.loginViaFB();
    }
}
