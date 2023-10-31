package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory1_StepDefs {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Then("the users see on the {string} page")
    public void the_user_see_on_the_page(String expectSubtitle) {
        BrowserUtils.waitForInvisibilityOf(loginPage.loading);
        String actualSubtitle = mainPage.subTitle.getText();
        Assert.assertEquals(expectSubtitle,actualSubtitle);
    }

    @Then("user is as {string} user should see following options")
    public void user_is_as_user_should_see_following_options(String type, List<String> expectedModels){
        int i=0;
        for (WebElement actualModel : loginPage.actualModels) {
            Assert.assertEquals(expectedModels.get(i++),actualModel.getText());
        }


    }
}
