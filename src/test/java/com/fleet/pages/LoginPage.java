package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {


    @FindBy(id = "prependedInput")
    public WebElement userNameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(xpath = "//div//h3")
    public WebElement loading;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    public void login(String userType) {

        String userName = "";
        String password = "";

        switch (userType) {

            case "driver":
                userName = ConfigurationReader.getProperty("driver.username");
                password = ConfigurationReader.getProperty("driver.password");
                break;
            case "storemanager":
                userName = ConfigurationReader.getProperty("store.managerusername");
                password = ConfigurationReader.getProperty("store.managerpassword");
                break;
            case "salesmanager":
                userName = ConfigurationReader.getProperty("sales.managerusername");
                password = ConfigurationReader.getProperty("sales.managerpassword");
                break;
            default:
                System.out.println("Invalid user type");
        }

        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
