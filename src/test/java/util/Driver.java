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


public class Driver {

    static PropertiesReader properties = PropertiesReader.getInstatnce();
    static Logger log = Logger.getLogger(Driver.class);

    private static WebDriver driver;
    public static WebDriver createDriver() {
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vatamanenco\\.m2\\repository\\webdriver\\geckodriver\\win64\\geckodriver.exe");
        WebDriverManager.chromedriver().setup();
        properties.getBrowser();
        if (driver == null)
        {
            driver = new ChromeDriver();
//            OperaOptions options = new OperaOptions();
//            options.setBinary("C:\\Users\\Vatamanenco\\AppData\\Local\\Programs\\Opera\\65.0.3467.48\\opera.exe");
//            driver = new OperaDriver(options);
//            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//            capabilities.setCapability("marionette", true);
//            driver = new FirefoxDriver(capabilities);
        }
        log.error("", new RuntimeException("dwadwadaw"));
        return driver;
    }
    public static WebDriver getDriver() {
        return driver;
    }


}
