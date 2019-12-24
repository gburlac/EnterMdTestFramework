package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;

import util.*;


public class BeforeAfterSteps <log>{
    static PropertiesReader properties = PropertiesReader.getInstatnce();
    static Logger log = Logger.getLogger(BeforeAfterSteps.class);
    @Before
    public void before() {
        log.info("----------------------TEST STARTED----------------------");
        switch (properties.getBrowser()) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                break;
            }
            case "ie": {
                WebDriverManager.iedriver().setup();
                break;
            }
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
            break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + properties.getBrowser());
        }
        Driver.createDriver();
    }

  @After
    public void after() {
        Driver.closeDriver();
    }
}
