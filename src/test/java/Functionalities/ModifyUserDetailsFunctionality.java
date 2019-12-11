package Functionalities;

import cucumber.api.java.en.When;
import pages.MainPage;
import pages.MainPageAsLogged;
import pages.UserPage;

public class ModifyUserDetailsFunctionality {
    UserPage userPage = new UserPage();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();

    @When("^user go to user profile page and edit the details$")
    public void editUserdetails() throws Exception {
        mainPageAsLogged.goToAccountDetails();
        userPage.enterInformatiiDeContactData();
        userPage.enterSecuritateData();
        userPage.enterAdresaDeLivrareData();
        userPage.saveChanges();
    }

}
