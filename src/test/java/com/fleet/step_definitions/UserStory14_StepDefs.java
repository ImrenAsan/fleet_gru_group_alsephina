package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.pages.MarketingPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UserStory14_StepDefs {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    MarketingPage marketingPage = new MarketingPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }

    @When("user logs in as store manager with correct credentials")
    public void user_logs_in_as_store_manager_with_correct_credentials() {
        loginPage.login("storemanager");
    }

    @When("user hovers over Marketing module and clicks the Campaigns")
    public void user_hovers_over_marketing_module_and_clicks_the_campaigns() {
        mainPage.marketingButton.click();

        mainPage.campaignsButton.click();
    }

    @When("user clicks the Manage filters button")
    public void user_clicks_the_manage_filters_button() {

        BrowserUtils.sleep(10);

        marketingPage.manageFilterButton.click();
    }

    @When("user should be able to see following filter options")
    public void user_should_be_able_to_see_following_filter_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : marketingPage.filterOptions) {
            actualOptions.add(eachOption.getText());
        }
        Assert.assertEquals(actualOptions,expectedOptions);
    }

    @Then("all filter options should checked by default.")
    public void all_filter_options_should_checked_by_default() {

        for (WebElement eachOption : marketingPage.filterOptions) {
            Assert.assertTrue(eachOption.isSelected());
        }

    }

    @When("user logs in as sales manager with correct credentials")
    public void user_logs_in_as_sales_manager_with_correct_credentials() {
        loginPage.login("salesmanager");
    }

}
