package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

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
                    break;
                }
                case "ie": {
                    InternetExplorerOptions capabilities = new InternetExplorerOptions();
                    capabilities.disableNativeEvents().setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                    capabilities.disableNativeEvents();
                    capabilities.enablePersistentHovering();
                    capabilities.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
                    driver = new InternetExplorerDriver(capabilities);
                    driver.manage().window().maximize();
                    break;
                }
                case "firefox": {
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                }
            }
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver = null;
    }


}
