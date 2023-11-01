package com.fleet.step_definitions;


import com.fleet.pages.MainPage;
import com.fleet.pages.MarketingPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class UserStory14_StepDefs {

    MainPage mainPage = new MainPage();
    MarketingPage marketingPage = new MarketingPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("user hovers over Marketing module and clicks the Campaigns")
    public void user_hovers_over_marketing_module_and_clicks_the_campaigns() {
        mainPage.hoverOver("marketing");

        wait.until(ExpectedConditions.elementToBeClickable(mainPage.marketingButton));

        mainPage.campaignsButton.click();
    }

    @When("user clicks the Manage filters button")
    public void user_clicks_the_manage_filters_button() {

        wait.until(ExpectedConditions.elementToBeClickable(marketingPage.filterButton));

        marketingPage.filterButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(marketingPage.manageFilterButton));
        marketingPage.manageFilterButton.click();
    }

    @Then("all filter options should checked by default.")
    public void allFilterOptionsShouldCheckedByDefault() {
        for (WebElement eachOption : marketingPage.filterOptions) {
            Assert.assertTrue(eachOption.isSelected());
        }
    }

    @Then("user should be unchecked any amount of boxes")
    public void userShouldBeUncheckedAnyAmountOfBoxes() {

        marketingPage.nameBox.click();
        marketingPage.budgetBox.click();

        Assert.assertTrue(!marketingPage.nameBox.isSelected());
        Assert.assertTrue(!marketingPage.budgetBox.isSelected());
    }
}
