package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class UserStory7_StepDef {

MainPage mainPage = new MainPage();


    @Then("the user checks whether all the checkboxes are unchecked")
    public void the_user_checks_whether_all_the_checkboxes_are_unchecked() {
        Assert.assertFalse(mainPage.allCheckboxes.isSelected());

    }

    @When("the user clicks first checkbox to check all the checkboxes")
    public void the_user_clicks_first_checkbox_to_check_all_the_checkboxes() {
BrowserUtils.sleep(10);
        mainPage.allCheckboxes.click();
        BrowserUtils.sleep(10);
        Assert.assertTrue(mainPage.allCheckboxes.isSelected());
        BrowserUtils.sleep(10);
    }
    @Then("the user ensures that all the checkboxes are checked")
    public void the_user_ensures_that_all_the_checkboxes_are_checked() {

    }


    @Then("user selects any veichle checkbox")
    public void user_selects_any_veichle_checkbox() {
        BrowserUtils.sleep(10);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.checkBoxAnyVeichle).perform();
        BrowserUtils.sleep(10);

        mainPage.checkBoxAnyVeichle.click();
    }
}
