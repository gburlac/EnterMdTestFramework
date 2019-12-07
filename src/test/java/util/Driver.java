package util;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import sun.rmi.runtime.Log;


public class Driver {

    static PropertiesReader properties = PropertiesReader.getInstatnce();
    static Logger log = Logger.getLogger(Driver.class);

    private static WebDriver driver;
    public static WebDriver createDriver() {
        if (driver == null)
        {
            switch (properties.getBrowser()) {
                    case "chrome" :{
                        driver = new ChromeDriver();
                        break;
                    }
                    case "ie":{
                        InternetExplorerOptions capabilities= new InternetExplorerOptions();
                        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                        driver = new InternetExplorerDriver(capabilities);
                        driver.manage().window().maximize();
                        break;
                    }
            }
//            OperaOptions options = new OperaOptions();
//            options.setBinary("C:\\Users\\Vatamanenco\\AppData\\Local\\Programs\\Opera\\65.0.3467.48\\opera.exe");
//            driver = new OperaDriver(options);
//            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//            capabilities.setCapability("marionette", true);
//            driver = new FirefoxDriver(capabilities);
        }
        log.error("Driver exeption", new RuntimeException("initialising exeption"));
        return driver;

    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void closeDriver(){
        driver.quit();
        driver = null;
    }


}
