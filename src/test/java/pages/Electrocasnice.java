package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import util.*;

import static junit.framework.Assert.assertTrue;

public class Electrocasnice extends Page {

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
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(ingrijirePersonala).build().perform();
        assertTrue(ingrijirePersonala.isDisplayed());
    }

    public void aparateDeUzCasnicePart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(aparateDeUzCasnicePart).build().perform();
        assertTrue(aparateDeUzCasnicePart.isDisplayed());
    }

    public void tehnicaDeBucatarieLabel() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tehnicaDeBucatarieLabel).build().perform();
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void electroCasniceCategory() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(electroCasniceCategoryMainLabel).build().perform();
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());

    }
}
