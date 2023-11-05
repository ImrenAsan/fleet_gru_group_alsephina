package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.pages.VehicleContractPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserStory4_StepDefs {


    MainPage mainPage = new MainPage();

    VehicleContractPage vehicleContractPage = new VehicleContractPage();


    @When("user hovers over Fleet module and clicks the Vehicle Contracts page")
    public void user_hovers_over_fleet_module_and_clicks_the_vehicle_contract_page() {

        mainPage.hoverOver("fleet");

        //BrowserUtils.sleep(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.vehicleContractsPageLink));


        mainPage.vehicleContractsPageLink.click();

        BrowserUtils.sleep(5);

    }

    @Then("user should access the Vehicle contracts page.")
    public void user_should_access_the_vehicle_contracts_page() {
        String expectedURL = "https://qa.fleetgru.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

    }





    @Then("driver should be able to see the error message")
    public void driverShouldBeAbleToSeeTheErrorMessage() {

        Assert.assertTrue(vehicleContractPage.errorMessageInVehicleContracts.isDisplayed());

    }
}


