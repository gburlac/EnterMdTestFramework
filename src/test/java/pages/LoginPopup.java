package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
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

    public void inputEmail(String email){
//        dB.drawBorder(emailField, driver);
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
        loginButton.click();
    }
    public void loginFB(){
//        dB.drawBorder(loginButton, driver);
        loginButton.click();
        WindowsHandler.switchWindow();
    }




}
