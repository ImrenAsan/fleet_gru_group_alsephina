package com.fleet.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.fleet.pages.MainPage;
import com.fleet.utilities.Driver;
import org.junit.Assert;

import java.util.Set;

public class UserStory2_StepDefs {
    MainPage mainPage= new MainPage();

    @When("the user click the question mark")
    public void the_user_click_the_question_mark() {

        mainPage.questionMark.click();

    }
    @Then("{string} site should be opened")
    public void site_should_be_opened(String expectedURL) {

        Set<String >windowAllWindows=Driver.getDriver().getWindowHandles();
        for (String each : windowAllWindows) {
            Driver.getDriver().switchTo().window(each);
        }
        String actualURL= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

}
