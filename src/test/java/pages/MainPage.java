package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    //find elements
    //*[@id="index"]/div[3]/div/div[1]/div/div/ul/li[1]/a
    //div[contains(@class, 'ty-wysiwyg-content')]/ul/li[1]/a
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
    @FindBy (xpath = "//span[contains(text(),'în cont')]")
    WebElement loginOption;
    @FindBy (xpath = "//button[@name='dispatch[auth.login]']")
    WebElement loginButton;
    @FindBy (xpath = "//a[3]//img[1]")
    WebElement facebookIcon;
    @FindBy(xpath = "//span[contains(text(),'în cont')]")
    WebElement loginMenu;

    //method
    public void ingrijirePersonala() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void aparateDeUzCasnicePart() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void tehnicaDeBucatarieLabel() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void electroCasniceCategoryIsDisplayed() {
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());
    }

    public void ClickOnelectroCasniceCategory() {
        electroCasniceCategory.click();
    }

    public void accessLoginMenu(){
        loginOption.click();
    }
    public void loginViaFacebook(){
        facebookIcon.click();
    }
    public void showAssertsLoginMenu(){
        try {
            Assert.assertTrue(loginButton.isDisplayed());
            System.out.println(">>Login pop up is displayed!<<<");
        } catch (Exception e){
            System.out.println(">>>Login pop up is not displayed!<<<");
        }
    }
    public void checkThatUserIsLoggedIn() throws Exception {
        if (loginMenu.getText() != "în cont"){
            System.out.println(">>>User is logged in!<<<");
        } else {
            throw new Exception("Login failed!");
        }
    }
    public void getTextFromElement(){
        loginMenu.getText();
    }
}
