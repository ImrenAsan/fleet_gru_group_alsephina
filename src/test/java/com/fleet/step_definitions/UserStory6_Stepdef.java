package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class UserStory6_Stepdef {
    MainPage mainPage = new MainPage();


    @And("the user hovers Fleet and clicks on veichle")
    public void the_user_hovers_fleet_and_clicks_on_veichle() {
        BrowserUtils.sleep(5);
        mainPage.hoverOver("fleet");
        BrowserUtils.sleep(5);
        mainPage.Veichle.click();

    }


    @Then("the user should see edit car info icon")
    public void the_user_should_see_edit_car_info_icon() {
        BrowserUtils.sleep(5);

        Assert.assertTrue(mainPage.EditCarIcon.isDisplayed());
    }


}
