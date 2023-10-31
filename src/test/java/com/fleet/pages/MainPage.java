package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(className = "oro-subtitle")
    public WebElement subTitle;

    @FindBy(className = "fa-question-circle")
    public WebElement questionMark;

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseThisSpace;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Marketing']")
    public WebElement marketingButton;
    @FindBy(xpath = "//a[@href='/campaign/']/span")
    public WebElement campaignsButton;
   
}
