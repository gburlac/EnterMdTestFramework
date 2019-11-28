package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import static junit.framework.Assert.assertTrue;

public class EnterPageGB {
    //initializing
    private static final String URL = "https://enter.online/";

    public static void initialisePage() {
        Driver.createDriver().get(URL);
        PageFactory.initElements(Driver.createDriver(),EnterPageGB.class);
    }
    //find elements
    @FindBy(xpath = "//div[contains(@class, 'ty-wysiwyg-content')]/ul/li[1]/a")
    private static WebElement electroCasniceCategory;
    @FindBy(xpath = "//h1")
    private static WebElement electroCasniceCategoryIsDisplayed;

    //method
    public static void electroCasniceCategoryIsDisplayed() {
        assertTrue(electroCasniceCategoryIsDisplayed.isDisplayed());
    }
    public static void electroCasniceCategory() {
        electroCasniceCategory.click();
    }
}
