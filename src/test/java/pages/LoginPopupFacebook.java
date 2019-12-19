package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;

public class LoginPopupFacebook extends Page {

    Logger log = Logger.getLogger(LoginPopupFacebook.class);
    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    @FindBy (xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@id='pass']")
    WebElement passwordField;
    @FindBy (xpath = "//button[@id='loginbutton']")
    WebElement loginButton;

    public void assertLoginWindowPopup() throws Exception {
        try {
            emailField.isDisplayed();
            log.info(">>>>> Login via Facebook window popup is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> Login via Facebook window popup is NOT displayed! <<<<<");
        }
    }

    public void inputEmail(String email) throws Exception {
//        dB.drawBorder(emailField, driver);
        assertLoginWindowPopup();
        TakeScreens.takeScreenshot(driver, "login_popup_window_FB");
        if (emailField.isDisplayed()) {
            emailField.click();
            emailField.clear();
            emailField.sendKeys(email);
        } else {
            throw new Exception(">>>>> Cannot find EMAIL field! <<<<<");
        }
    }

    public void inputPassword(String password) throws Exception {
//        dB.drawBorder(passwordField, driver);
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(password);
            TakeScreens.takeScreenshot(driver, "login_and_password_filled");
        } else {
            throw new Exception(">>>>> Cannot find PASSWORD field! <<<<<");
        }
    }

    public void login() throws Exception {
//        dB.drawBorder(loginButton, driver);
        if (loginButton.isDisplayed()) {
            loginButton.click();
        } else {
            throw new Exception(">>>>> Cannot find LOGIN button! <<<<<");
        }
    }
}
