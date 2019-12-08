package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;


public class Driver {

    static PropertiesReader properties = PropertiesReader.getInstatnce();
    static Logger log = Logger.getLogger(Driver.class);

    public static WebDriver driver;

    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        properties.getBrowser();
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        }
        log.error("Driver exeption", new RuntimeException("initialising exeption"));
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
