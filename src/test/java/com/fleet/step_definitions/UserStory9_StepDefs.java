package com.fleet.step_definitions;

import com.fleet.pages.ActivitiesPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserStory9_StepDefs {

    ActivitiesPage activitiesPage = new ActivitiesPage();
    @When("user enters a number less than 1")
    public void userEntersANumberLessThan1() {
        activitiesPage.repeatEveryInput.sendKeys("-1");

    }

    @Then("user should see \"The value have not to be less than 1.\"")
    public void user_should_see_less_than_1_message() {

        BrowserUtils.sleep(10);
        Assert.assertTrue(activitiesPage.lessThan1ErrorMessage.isDisplayed());
    }


    @When("user enters a number more than 99")
    public void userEntersANumberMoreThan99() {
        activitiesPage.repeatEveryInput.sendKeys("134");
    }

    @Then("user should see \"The value have not to be more than 99.\"")
    public void userShouldSeeMoreThan99Message() {

        BrowserUtils.sleep(10);
        Assert.assertTrue(activitiesPage.moreThan99ErrorMessage.isDisplayed());
    }


}
