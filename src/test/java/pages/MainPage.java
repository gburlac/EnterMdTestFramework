package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {
    //find elements
    @FindBy(xpath = "//div[contains(@class, 'ty-wysiwyg-content')]/ul/li[1]/a")
    private  WebElement electroCasniceCategory;
    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/div[2]/div/div/div/h1")
    private  WebElement electroCasniceCategoryMainLabel;

    //method
    public void electroCasniceCategoryIsDisplayed() {
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());
    }
    public void ClickOnelectroCasniceCategory() {
        electroCasniceCategory.click();
    }
}
