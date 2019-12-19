package steps;

import context.ScenarioContext;
import cucumber.api.DataTable;
import enums.Context;
import cucumber.api.java.en.When;
import pages.MainPage;
import pages.UserPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModifyUserDetailsFunctionality {
    UserPage userPage = new UserPage();
    MainPage mainPage = new MainPage();

    @When("user goes to user account details")
    public void goToAccountDetails() throws Exception {
        mainPage.goToUserAccountDetails();
    }

    @When("^edit user details$")
//    public void editUserdetails(HashMap<String, String> userData) throws Exception {
//        userPage.prenumeField.sendKeys(userData.get("Prenume"));
//        userPage.numeField.sendKeys(userData.get("Nume"));
//        userPage.passwordField.sendKeys(userData.get("Parola"));
//        scenarioContext.setContext(Context.CHANGED_PASSWORD, userData.get("Parola"));
//        userPage.confirmPasswordField.sendKeys((userData.get("Confirma_parola")));
//        userPage.phoneField.sendKeys(userData.get("Phone"));
//        userPage.cityField.sendKeys(userData.get("City"));
//        userPage.saveButton.click();
//    }
    public void editUserDetails(DataTable dataTable){
        Map<String, String> dataList = dataTable.asMap(String.class, String.class);
        userPage.prenumeField.clear();
        userPage.prenumeField.sendKeys(dataList.get("Prenume"));
        userPage.numeField.clear();
        userPage.numeField.sendKeys(dataList.get("Nume"));
        userPage.passwordField.clear();
        userPage.passwordField.sendKeys(dataList.get("Parola"));
        ScenarioContext.setContext(Context.CHANGED_PASSWORD, dataList.get("Parola"));
        userPage.confirmPasswordField.clear();
        userPage.confirmPasswordField.sendKeys((dataList.get("Confirma_parola")));
        userPage.phoneField.clear();
        userPage.phoneField.sendKeys(dataList.get("Phone"));
        userPage.cityField.clear();
        userPage.cityField.sendKeys(dataList.get("City"));
        userPage.saveButton.click();
    }
}
