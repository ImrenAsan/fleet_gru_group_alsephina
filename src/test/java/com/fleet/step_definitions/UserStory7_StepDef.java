package com.fleet.step_definitions;

import com.fleet.pages.MainPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class UserStory7_StepDef {

MainPage mainPage = new MainPage();
    @Then("user selects any veichle checkbox")
    public void user_selects_any_veichle_checkbox() {
        BrowserUtils.sleep(10);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.checkBoxAnyVeichle).perform();
        BrowserUtils.sleep(10);

        mainPage.checkBoxAnyVeichle.click();
    }
}
