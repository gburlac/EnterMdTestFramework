package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.concurrent.TimeUnit;


public class Driver {

    static PropertiesReader properties = PropertiesReader.getInstatnce();
    static Logger log = Logger.getLogger(Driver.class);

    private static WebDriver driver;

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (properties.getBrowser()) {
                case "chrome": {
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
                    break;
                }
                case "ie": {
                    InternetExplorerOptions capabilities = new InternetExplorerOptions();
                    capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                    driver = new InternetExplorerDriver(capabilities);
                    driver.manage().window().maximize();
                    break;
                }
            }
        }
        log.info("Initialising Driver");
        return driver;

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }


}
