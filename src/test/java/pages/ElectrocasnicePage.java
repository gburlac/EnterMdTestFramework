package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import static junit.framework.Assert.assertTrue;

public class ElectrocasnicePage extends Page {
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    private WebElement electroCasniceCategory;
    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/div[2]/div/div/div/h1")
    private WebElement electroCasniceCategoryMainLabel;
    @FindBy(xpath = "//div[@id='block1']/h2[contains(@class, 'uk-cover tm-landing-white-title')]")
    private WebElement tehnicaDeBucatarieLabel;
    @FindBy(xpath = "//*[@id=\"block2\"]/h2")
    private WebElement aparateDeUzCasnicePart;
    @FindBy(xpath = "//*[@id=\"block3\"]/h2")
    private WebElement ingrijirePersonala;

    public void ClickOnelectroCasniceCategory() {
        electroCasniceCategory.click();
    }

    public void ingrijirePersonala() {
        actions.moveToElement(ingrijirePersonala).build().perform();
        assertTrue(ingrijirePersonala.isDisplayed());
    }

    public void aparateDeUzCasnicePart() {
        actions.moveToElement(aparateDeUzCasnicePart).build().perform();
        assertTrue(aparateDeUzCasnicePart.isDisplayed());
    }

    public void tehnicaDeBucatarieLabel() {
        actions.moveToElement(tehnicaDeBucatarieLabel).build().perform();
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void electroCasniceCategory() {
        actions.moveToElement(electroCasniceCategoryMainLabel).build().perform();
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());

    }
}
