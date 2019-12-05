package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;

public class BeforeAfterSteps {
    @Before
    public void before() {
            Driver.createDriver();
    }

    @After
    public void after() throws Exception {
        Thread.sleep(2000);
        Driver.getDriver().quit();
    }
}
