package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleModelPage extends BasePage {

    //   //span[normalize-space()='Vehicles Model']
    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[@class='grid-header-row']")
    public List<WebElement> allColumnsInVehicleModel;

    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement errorMessageInVehicleModel;






    // //span[normalize-space()='Vehicles Model']

    // body > div:nth-child(2) > div:nth-child(2) > header:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(9) > a:nth-child(1) > span:nth-child(1)


}
