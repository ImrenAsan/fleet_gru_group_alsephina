package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createCalenderEventButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInput;

    @FindBy(xpath = "(//span[normalize-space()='This value should not be blank.'])[2]")
    public WebElement emptyFieldErrorMessage;

    @FindBy(xpath = "(//span[normalize-space()='The value have not to be less than 1.'])[3]")
    public WebElement lessThan1ErrorMessage;

    @FindBy(xpath = "(//span[normalize-space()='The value have not to be more than 99.'])[3]")
    public WebElement moreThan99ErrorMessage;

    @FindBy(xpath = "//*[@id=\"tinymce\"]/p")
    public WebElement textArea;

    @FindBy(xpath = "//iframe[contains(@id,'oro_calendar_event_form_description')]")
    //input[contains(@id,'Email')]
    public WebElement iFrame;


}
