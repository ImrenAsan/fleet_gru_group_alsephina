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

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCostsButton;

}
