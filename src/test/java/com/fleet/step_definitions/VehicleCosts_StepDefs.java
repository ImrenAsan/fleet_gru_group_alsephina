package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.pages.VehicleCostsPage;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VehicleCosts_StepDefs {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }

    @When("user logs in as driver with correct credentials")
    public void user_logs_in_as_driver_with_correct_credentials() {
        loginPage.login("driver");
    }

    @When("user hovers over Fleet module and clicks the Vehicle Costs")
    public void user_hovers_over_fleet_module_and_clicks_the_vehicle_costs() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(mainPage.fleetButton);

        mainPage.vehicleCostsButton.click();

    }
    
    @Then("user should be able to see following columns")
    public void user_should_be_able_to_see_following_columns(String expectedColumns) {

        String expectedTitle = "Vehicle Costs - Entities - System - Car - Entities - System";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        List<String> actualColumns = new ArrayList<>();

        for (WebElement eachColumn : vehicleCostsPage.actualColumns) {
            actualColumns.add(eachColumn.getText());
            
        }




    }

}
