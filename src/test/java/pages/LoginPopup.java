package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;

public class LoginPopup extends Page {

    WebDriver driver = Driver.getDriver();
    Logger log = Logger.getLogger(LoginPopup.class);

    @FindBy (xpath = "//input[@id='email']")
    private WebElement emailField;
    @FindBy (xpath = "//input[@id='pass']")
    private WebElement passwordField;
    @FindBy (xpath = "//button[@id='loginbutton']")
    private WebElement loginButton;

    public void inputEmail(String email) throws Exception {
        assertLoginWindowPopup();
        TakeScreens.takeScreenshot(driver, "login_popup_window");
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void login() throws Exception {
        TakeScreens.takeScreenshot(driver, "login_and_password_filled");
        try {
            loginButton.isDisplayed();
            loginButton.click();
        } catch (Exception e){
            throw new Exception("An error occured while clicking Login button.");
        }
    }

    public void assertLoginWindowPopup() throws Exception {
        try {
            emailField.isDisplayed();
            log.info(">>>>> Login window popup is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> Login window popup is NOT displayed! <<<<<");
        }
    }
}
