package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometerPage extends BasePage{

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessageInVehicleOdometer;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPageValue;

    @FindBy(xpath = "//button[normalize-space()='25']")
    public WebElement viewPerPageValue;



}
