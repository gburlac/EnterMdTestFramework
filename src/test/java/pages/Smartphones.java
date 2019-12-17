package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import static junit.framework.Assert.assertTrue;

public class Smartphones extends Page {
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
    WebElement assertSmartphonesCategory;
    @FindBy(xpath = "//h1[@id='product_filters_page_title' and contains(text(),'Telefoane Samsung')]")
    WebElement assertSamsungPhones;
    @FindBy(xpath = "//*[@id=\"ranges_376_239\"]/li[1]/label/a")
    private WebElement filterAppleCheckbox;
    @FindBy(xpath = "//*[@id=\"ranges_376_239\"]/li[3]/label/a")
    private WebElement filterXiaomiCheckbox;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[1]/div/div[2]/form/div/a/div[2]/span")
    private WebElement productnameLabel;

    public void showSmartphonesAssert() throws Exception {
        try {
            Assert.assertTrue(assertSmartphonesCategory.isDisplayed());
            System.out.println(">>>>> Smartphones category is opened! <<<<<");
        } catch (Exception e){
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Smartphones category is NOT opened! <<<<<");
        }
    }

    public void showSamsungAssert() throws Exception {
        try {
            Assert.assertTrue(assertSamsungPhones.isDisplayed());
            System.out.println(">>>>> Samsung phones are displayed! <<<<<");
        } catch (Exception e){
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Samsung phones are NOT displayed! <<<<<");
        }

    }
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
