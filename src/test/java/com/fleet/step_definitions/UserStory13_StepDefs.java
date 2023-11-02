package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.pages.VehicleCostsPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class UserStory13_StepDefs {

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
/*
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(mainPage.fleetButton).perform();
*/
        mainPage.hoverOver("fleet");

        BrowserUtils.sleep(2);
        mainPage.vehicleCostsButton.click();

    }
    
    @Then("user should be able to see following columns")
    public void user_should_be_able_to_see_following_columns(List<String> expectedColumns) {

       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
       wait.until(ExpectedConditions.titleIs("Vehicle Costs - Entities - System - Car - Entities - System"));

      List<String> actualColumns = new ArrayList<>();

        for (WebElement eachColumn : vehicleCostsPage.allTopColumns) {
            actualColumns.add(eachColumn.getText());
        }
        Assert.assertEquals(expectedColumns,actualColumns);
    }

    @When("user logs in as store manager with correct credentials")
    public void user_logs_in_as_store_manager_with_correct_credentials() {
       loginPage.login("storemanager");
    }

    @When("user logs in as sales manager with correct credentials")
    public void user_logs_in_as_sales_manager_with_correct_credentials() {
        loginPage.login("salesmanager");
    }

    @Then("user should select all the Vehicle Costs")
    public void user_should_select_all_the_vehicle_costs() {
        BrowserUtils.sleep(3);

        for (WebElement eachCheckBox : vehicleCostsPage.allCheckButtons) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }


    }

    @And("user clicks the first checkbox")
    public void userClicksTheFirstCheckbox() {

        //  BrowserUtils.sleep(5);
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(vehicleCostsPage.firstCheckbox));
        vehicleCostsPage.firstCheckbox.click();
    }
}
