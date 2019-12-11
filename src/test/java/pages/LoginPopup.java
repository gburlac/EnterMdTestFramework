package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.WindowsHandler;

public class LoginPopup extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    @FindBy (xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@id='pass']")
    WebElement passwordField;
    @FindBy (xpath = "//button[@id='loginbutton']")
    WebElement loginButton;

    public void inputEmail(String email) throws Exception {
//        dB.drawBorder(emailField, driver);
        assertLoginWindowPopup();
        TakeScreens.takeScreenshot(driver, "login_popup_window");
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
//        dB.drawBorder(passwordField, driver);
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void login(){
//        dB.drawBorder(loginButton, driver);
        TakeScreens.takeScreenshot(driver, "login_and_password_filled");
        loginButton.click();
    }

    public void assertLoginWindowPopup() throws Exception {
        try {
            emailField.isDisplayed();
            System.out.println(">>>>> Login window popup is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> Login window popup is NOT displayed! <<<<<");
        }
    }




}
