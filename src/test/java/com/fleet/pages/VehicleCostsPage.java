package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostsPage extends BasePage{

    @FindBy(css = ".grid-header-cell__label")
    public List<WebElement> actualColumns;
}
