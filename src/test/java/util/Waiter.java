package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public static void waitbyClassName(String elementClassName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementClassName)));
    }
    public static void waitById(String elementId){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }
    public static void waitByXPath(String elementXPath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    }

}