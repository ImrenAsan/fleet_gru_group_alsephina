package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage;
import com.fleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class UserStory12_StepDefs {

    AccountsPage accountsPage = new AccountsPage();
    LoginPage loginPage = new LoginPage();

    @When("the users navigate to {string}")
    public void the_users_navigate_to(String navigatetoModul)  {
        loginPage.moduleNavigate(navigatetoModul);
    }

    @Then("the users see filter  items on the Accounts page")
    public void the_users_see_filter_items_on_the_accounts_page(List<String> expectedData)  {

        int i=0;
        accountsPage.wait.until(ExpectedConditions.invisibilityOf(accountsPage.loaderFrame));

        if(!accountsPage.filters.getAttribute("class").contains("pressed")) accountsPage.filters.click();

        for (WebElement eachFilter : accountsPage.filterItems) {
            Assert.assertEquals(expectedData.get(i++), eachFilter.getText().split(":")[0]);
        }
    }
}
