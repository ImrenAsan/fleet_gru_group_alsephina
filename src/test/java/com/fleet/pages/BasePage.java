package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".title.title-level-1")
    public List<WebElement> actualModels;

    @FindBy(className = "shown")
    public WebElement loaderFrame;

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    Actions actions = new Actions(Driver.getDriver());


    public void moduleNavigate(String feature) {

        String[] navigate = feature.split("-");
        String mainMenu = navigate[0].trim();
        String tabMenu = navigate[1].trim();

        WebElement navigateTabMenu = Driver.getDriver().findElement(By.xpath("//*[text()='" + tabMenu + "']"));

        for (WebElement model : actualModels) {
            actions.moveToElement(model).perform();
            wait.until(ExpectedConditions.visibilityOf(model));
            if (model.getText().equals(mainMenu)) {
                navigateTabMenu.click();
                wait.until(ExpectedConditions.invisibilityOf(loaderFrame));
                break;
            }
        }

    }
}
