package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver driver;

    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        if (driver == null)
            driver = new ChromeDriver();
//            driver = new FirefoxDriver();
        return driver;
    }


}
