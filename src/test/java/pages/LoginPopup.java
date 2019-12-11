package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopup extends Page {
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@id='loginbutton']")
    WebElement loginButton;

    public void inputEmail(String email) {
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void login() {
        loginButton.click();
    }


}
