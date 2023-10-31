package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MarketingPage extends BasePage{

    @FindBy(xpath = "//a[@class='action btn mode-icon-only pressed']")
    public WebElement manageFilterButton;

    @FindBy(xpath = "//input[@name='multiselect_1']")
    public List<WebElement> filterOptions;
}
