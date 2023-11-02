package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.fleet.utilities.ConfigurationReader;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("Users is on the login page")
    public void user_is_on_the_login_page() {

        String webSite = ConfigurationReader.getProperty("baseUrl");
        Driver.getDriver().get(webSite);
    }

    @When("the users logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        loginPage.login(userType);
        System.out.println("Currently this usertype is active : " + userType);

    }




}
