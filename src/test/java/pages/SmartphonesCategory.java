package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


public class SmartphonesCategory extends Page {
    @FindBy(xpath = "//*[@id=\"ranges_376_239\"]/li[1]/label")
    private WebElement filterAppleCheckbox;
    @FindBy(xpath = "//*[@id=\"ranges_376_239\"]/li[3]/label/a")
    private WebElement filterXiaomiCheckbox;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[1]/div/div[2]/form/div/a/div[2]/span")
    private WebElement productnameLabel;

    public void checkFilterAppleCheckbox() {
        filterAppleCheckbox.click();
    }
    public void checkFilterXiaomiCheckbox() {
        filterXiaomiCheckbox.click();
    }


    public void filterAppleAssert() {
        for (int i = 1; i <= 20 ; i++) {
            String value;
            value = Driver.getDriver().findElement(By.xpath("//*[@id=\"pagination_contents\"]/div[4]/div["+i+"]/div/div/form/div/a/div[2]/span")).getText();
            assertTrue(value.contains("Apple"));
        }
    }
    public void filterXiaomiAssert() {
        for (int i = 1; i <= 20 ; i++) {
            String value;
            value = Driver.getDriver().findElement(By.xpath("//*[@id=\"pagination_contents\"]/div[4]/div["+i+"]/div/div/form/div/a/div[2]/span")).getText();
            assertTrue(value.contains("Xiaomi"));
        }
    }
}
