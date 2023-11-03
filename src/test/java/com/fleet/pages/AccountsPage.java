package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountsPage extends BasePage{

    @FindBy(css = ".btn.filter-criteria-selector.oro-drop-opener.oro-dropdown-toggle.filter-default-value")
    public List<WebElement>  filterItems;

    @FindBy(css = "[title='Filters']")
    public WebElement filters;

}
