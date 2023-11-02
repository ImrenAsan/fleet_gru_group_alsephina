package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.pages.VehicleModelPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class UserStory5_StepDefs {

    MainPage mainPage = new MainPage();
    VehicleModelPage vehicleModelPage = new VehicleModelPage();


    @When("user hovers over Fleet module and clicks the Vehicle Model page")
    public void userHoversOverFleetModuleAndClicksTheVehicleModelPage() {

        mainPage.hoverOver("fleet");

        //BrowserUtils.sleep(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.vehicleModelPageLink));


        mainPage.vehicleModelPageLink.click();

        BrowserUtils.sleep(5);


    }



    @Then("user should be able to see columns below on the page")
    public void userShouldBeAbleToSeeColumnsBelowOnThePage(List<String> expectedColumns) {

        BrowserUtils.sleep(3);

        List<String> actualColumns = new ArrayList<>();


        for (WebElement eachColumn : vehicleModelPage.allColumnsInVehicleModel) {
            actualColumns.add(eachColumn.getText());
        }

        Assert.assertEquals(expectedColumns, actualColumns);


    }


    @Then("user should be able to see the error message")
    public void userShouldBeAbleToSeeTheErrorMessage() {

        Assert.assertTrue(vehicleModelPage.errorMessageInVehicleModel.isDisplayed());

    }
}
