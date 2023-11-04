package com.fleet.step_definitions;

import com.fleet.pages.ActivitiesPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class UserStory3_StepDefs {


    MainPage mainPage = new MainPage();





    @And("the users click on the learn how to use space link")
    public void theUsersClickOnTheLearnHowToUseSpaceLink()
    {

        BrowserUtils.sleep(10);

        mainPage.learnHowToUseThisSpace.click();

        BrowserUtils.sleep(10);


    }


    @Then("user should see how to use Pinbar and use Pin Icon")
    public void userShouldSeeHowToUsePinbarAndUsePinIcon() {

        Assert.assertTrue( mainPage.howToUsePinbar.isDisplayed());
        Assert.assertTrue(mainPage.pinIcon.isDisplayed());



    }

    @Then("user should see the image on the page.")
    public void userShouldSeeTheImageOnThePage() {

        Assert.assertTrue( mainPage.pinbarImage.isDisplayed());


    }








}

