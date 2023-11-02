package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MarketingPage extends BasePage{

    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filterButton;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;

    @FindBy(xpath = "//input[@name='multiselect_1']")
    public List<WebElement> filterOptions;

    @FindBy(xpath = "//input[@value='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@value='budget']")
    public WebElement budgetBox;
}
