package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private static WebDriverWait wait;

    public static void waitbyClassName(String elementClassName){
        wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementClassName)));
    }
    public static void waitById(String elementId){
        wait = new WebDriverWait(Driver.getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }
    public static void waitByXPath(String elementXPath){
        wait = new WebDriverWait(Driver.getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    }
    public static void waitbyClassNameUntilDissapear(String elementClassName){
        wait = new WebDriverWait(Driver.getDriver(), 40);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(elementClassName)));
    }
    public static void waitByIdUntilDissapear(String id){
        wait = new WebDriverWait(Driver.getDriver(), 40);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }
    public static void waitByXPathUntilDissapear(String elementXPath){
        wait = new WebDriverWait(Driver.getDriver(), 40);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXPath)));
    }



}