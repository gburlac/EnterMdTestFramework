package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import util.*;




public class BeforeAfterSteps {
    static PropertiesReader properties = PropertiesReader.getInstatnce();
    @Before
    public void before() {
        switch (properties.getBrowser()) {
            case "chrome" :{
                WebDriverManager.chromedriver().setup();
                break;
            }
            case "ie":{
                WebDriverManager.iedriver().setup();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + properties.getBrowser());
        }
        Driver.createDriver();
    }

    @After
    public void after() throws Exception {
        Driver.getDriver().quit();
    }
}
