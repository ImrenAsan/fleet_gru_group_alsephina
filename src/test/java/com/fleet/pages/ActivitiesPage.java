package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage extends BasePage {

    public ActivitiesPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
   // @FindBy(xpath = "//div[@class='pull-right title-buttons-container']")

    @FindBy(xpath = "//a[normalize-space(text())='Create Calendar event']")
    public WebElement createCalenderEventButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInput;

    @FindBy(xpath = "(//span[normalize-space()='This value should not be blank.'])[2]")
    public WebElement emptyFieldErrorMessage;


}