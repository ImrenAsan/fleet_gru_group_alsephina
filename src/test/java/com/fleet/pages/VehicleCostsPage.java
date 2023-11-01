package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostsPage extends BasePage{

    @FindBy(css = ".grid-header-cell__label")
    public List<WebElement> allTopColumns;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input")
    public WebElement firstCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> allCheckButtons;
}
