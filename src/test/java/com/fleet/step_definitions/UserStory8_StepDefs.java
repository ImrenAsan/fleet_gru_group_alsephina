package com.fleet.step_definitions;

import com.fleet.pages.ActivitiesPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserStory8_StepDefs {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    ActivitiesPage activitiesPage = new ActivitiesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));


    @When("user hovers over Activities module and clicks the Calender Events")
    public void user_hovers_over_activities_module_and_clicks_the_calender_events() {
        mainPage.hoverOver("activities");
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.calenderEventsButton));
        mainPage.calenderEventsButton.click();
    }

    @When("user clicks on the Create Calender Event button")
    public void user_clicks_on_the_create_calender_event_button() {
        BrowserUtils.sleep(10);
        activitiesPage.createCalenderEventButton.click();
        BrowserUtils.sleep(10);
    }

    @When("user selects the Repeat checkbox")
    public void user_selects_the_repeat_checkbox() {
        BrowserUtils.sleep(5);
        activitiesPage.repeatCheckbox.click();
    }

    @Then("user should see the number {int} by default in the Repeat Every input")
    public void user_should_see_the_number_by_default_in_the_repeat_every_input(Integer expectedNumber) {
        Integer actualNumber = Integer.valueOf(activitiesPage.repeatEveryInput.getAttribute("value"));

        Assert.assertEquals(expectedNumber, actualNumber);
    }


    @When("user clears the Calender event repeat field")
    public void user_clears_the_calender_event_repeat_field() {
        activitiesPage.repeatEveryInput.clear();

    }

    @Then("user sees an error message")
    public void userSeesAnErrorMessage() {
        activitiesPage.repeatEveryInput.clear();
        BrowserUtils.sleep(10);
        Assert.assertTrue(activitiesPage.emptyFieldErrorMessage.isDisplayed());
    }
}


