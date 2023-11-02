package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.pages.VehicleOdometerPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory11_StepDefs {

    MainPage mainPage = new MainPage();

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


    @When("user hovers over Fleet module and clicks the Vehicle Odometer page")
    public void user_hovers_over_fleet_module_and_clicks_the_vehicle_odometer_page() {

        mainPage.hoverOver("fleet");

        BrowserUtils.sleep(5);

        mainPage.vehicleOdometerPageLink.click();

        BrowserUtils.sleep(5);

    }


    @Then("user displays the error message")
    public void user_displays_the_error_message() {

        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = vehicleOdometerPage.errorMessageInVehicleOdometer.getText();

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        Assert.assertTrue(vehicleOdometerPage.errorMessageInVehicleOdometer.isDisplayed());


    }

    @Then("user displays default page as {string}")
    public void userDisplaysDefaultPageAs(String expectedDefaultPageValue) {

        String actualDefaultPageValue = vehicleOdometerPage.defaultPageValue.getText();

        Assert.assertTrue(vehicleOdometerPage.defaultPageValue.isDisplayed());


    }

    @Then("user displays View Per Page as {string}")
    public void userDisplaysViewPerPageAs(String expectedViewPage) {

        BrowserUtils.sleep(3);

        Assert.assertTrue(vehicleOdometerPage.viewPerPageValue.isDisplayed());

    }
}
