package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertTrue;

public class Electrocasnice extends Page {
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    private WebElement electroCasniceCategory;
    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/div[2]/div/div/div/h1")
    private WebElement electroCasniceCategoryMainLabel;
    @FindBy(xpath = "//div[@id='block1']/h2[contains(@class, 'uk-cover tm-landing-white-title')]")
    private WebElement tehnicaDeBucatarieLabel;
    @FindBy(xpath = "//div[@id='block1']/h2[contains(@class, 'uk-cover tm-landing-white-title')]")
    private WebElement aparateDeUzCasnicePart;
    @FindBy(xpath = "//*[@id=\"block3\"]/h2")
    private WebElement ingrijirePersonala;

    public void ClickOnelectroCasniceCategory() {
        electroCasniceCategory.click();
    }

    public void ingrijirePersonala() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void aparateDeUzCasnicePart() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void tehnicaDeBucatarieLabel() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void electroCasniceCategory() {
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());
    }
}
