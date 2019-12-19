package functionalities;

import cucumber.api.java.en.When;
import pages.MainPageAsLogged;
import pages.UserPage;

import java.util.HashMap;

public class ModifyUserDetailsFunctionality {
    UserPage userPage = new UserPage();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();

    @When("^user go to user profile page and edit the details$")
    public void editUserdetails(HashMap<String, String> userData) throws Exception {

        userPage.prenumeField.sendKeys(userData.get("Prenume"));
        userPage.numeField.sendKeys(userData.get("Nume"));
        userPage.passwordField.sendKeys(userData.get("Parola"));
        userPage.confirmPasswordField.sendKeys((userData.get("Confirma_parola")));
        userPage.phoneField.sendKeys(userData.get("Phone"));
        userPage.cityField.sendKeys(userData.get("City"));
        userPage.saveButton.click();

    }
}
