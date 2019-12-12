package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import util.*;


public class BeforeAfterSteps {
    static PropertiesReader properties = PropertiesReader.getInstatnce();

    @Before
    public void before() {

        switch (properties.getBrowser()) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                break;
            }
            case "ie": {
                WebDriverManager.iedriver().setup();
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
