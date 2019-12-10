package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


public class SmartphonesCategory extends Page{
    @FindBy(xpath = "//*[@id=\"ranges_376_239\"]/li[1]/label")
    private WebElement filterAppleCheckbox;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[1]/div/div[2]/form/div/a/div[2]/span")
    private WebElement productnameLabel;
    public void checkFilterAppleCheckbox() throws InterruptedException{
        filterAppleCheckbox.click();
        Thread.sleep(5000);
    }
    public void filterAssert(){
        String value;
        value = productnameLabel.getText();
        assertTrue(value.contains("Apple"));
    }
}
