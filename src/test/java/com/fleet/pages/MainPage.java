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


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Veichle;

    @FindBy(xpath = "//a[.='...']")
    public WebElement EditCarIcon;


    @FindBy(xpath= "//span[normalize-space()='Vehicles Model']")
    public WebElement vehicleModelPageLink;


    @FindBy(xpath = "//li[@data-route='oro_campaign_index']/a/span")
    public WebElement campaignsButton;


    @FindBy(xpath = "//span[normalize-space()='Vehicle Odometer']")
    public WebElement vehicleOdometerPageLink;


    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calenderEventsButton;


    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinbar;


    @FindBy(xpath = "//p[normalize-space()='Use pin icon on the right top corner of page to create fast access link in the pinbar.']")
    public WebElement pinIcon;


    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinbarImage;


    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractsPageLink ;

    @FindBy(xpath = "//th[@class='select-all-header-cell renderable grid-cell grid-header-cell grid-header-cell-massAction']//input[@type='checkbox']")
    public WebElement allCheckboxes;

    @FindBy(xpath = "(//td/input[@type='checkbox'])[2]")
    public WebElement checkBoxAnyVeichle;

    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement ViewEditDeleteIcons;



    ////span[.='Vehicle Contracts']



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
