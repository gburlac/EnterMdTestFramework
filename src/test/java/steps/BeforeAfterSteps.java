package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.*;



public class BeforeAfterSteps {
    @Before
    public void before() {
        Driver.createDriver();
    }

//    @After
    public void after() throws Exception {
        Driver.getDriver().quit();
    }
}
