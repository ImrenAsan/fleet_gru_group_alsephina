package com.fleet.step_definitions;

import com.fleet.pages.ActivitiesPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserStory10_StepDefs {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    ActivitiesPage activitiesPage = new ActivitiesPage();
    @Then("user should be able to write message in the Description field")
    public void userShouldBeAbleToWriteMessageInTheDescriptionField() {


        BrowserUtils.sleep(10);

        Driver.getDriver().switchTo().frame(activitiesPage.iFrame);

        BrowserUtils.sleep(10);

        String writtenText = "Scrum daily meeting";

        activitiesPage.textArea.sendKeys(writtenText);

        BrowserUtils.sleep(10);

        //Driver.getDriver().switchTo().defaultContent();


    }
}
