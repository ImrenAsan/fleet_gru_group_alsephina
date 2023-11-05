package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractPage extends BasePage {


    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessageInVehicleContracts;

}
