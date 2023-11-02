package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(className = "oro-subtitle")
    public WebElement subTitle;

    @FindBy(className = "fa-question-circle")
    public WebElement questionMark;

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseThisSpace;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Sales']")
    public WebElement salesButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Customers']")
    public WebElement customersButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Activities']")
    public WebElement activitiesButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space(.)='Marketing']")
    public WebElement marketingButton;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCostsButton;


    @FindBy(xpath= "//span[normalize-space()='Vehicles Model']")
    public WebElement vehicleModelPageLink;




    @FindBy(xpath = "//li[@data-route='oro_campaign_index']/a/span")
    public WebElement campaignsButton;



    public void hoverOver(String moduleName){

        Actions action = new Actions(Driver.getDriver());

        switch (moduleName){
            case "dashboard":
                BrowserUtils.sleep(3);
                action.moveToElement(dashboardButton).perform();
                break;

            case "fleet":
                BrowserUtils.sleep(3);
                action.moveToElement(fleetButton).perform();
                break;

            case "customers":
                BrowserUtils.sleep(3);
                action.moveToElement(customersButton).perform();
                break;

            case "sales":
                BrowserUtils.sleep(3);
                action.moveToElement(salesButton).perform();
                break;

            case "activities":
                BrowserUtils.sleep(3);
                action.moveToElement(activitiesButton).perform();
                break;

            case "marketing":
                BrowserUtils.sleep(3);
                action.moveToElement(marketingButton).perform();
                break;

        }

    }

}
