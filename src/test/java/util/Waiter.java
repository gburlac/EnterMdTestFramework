package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private static WebDriverWait wait;

    public static void waitbyClassName(String elementClassName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementClassName)));
    }
    public static void waitById(String elementId){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }
    public static void waitByXPath(String elementXPath){
      wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    }
    public static void waitbyClassNameUntilDissapear(String elementClassName){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(elementClassName)));
    }
    public static void waitByXpathUntilDissapear(String elementXPath){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(elementXPath)));
    }
    public static void waitByXPathUntilDissapear(String elementXPath){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXPath)));
    }



}