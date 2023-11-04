package com.fleet.step_definitions;

import com.fleet.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Running before each scenario->>>>>");
    }

    @After
    public void tearDown(Scenario scenario){
        String str="";

        if (scenario.isFailed()){
            byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();

        System.out.println("->>>>> @After: Running after each scenario");
    }
}
