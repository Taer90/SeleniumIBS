package base.steps;

import io.cucumber.java.After;

import io.cucumber.java.Scenario;
import managers.PageManager;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import managers.DriverManager;
import project.properties.TestProperties;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static managers.DriverManager.getInstance;


public class Hooks {

    private static DriverManager driverManager = getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    @Before
    public void before() {

        String baseUrl = ("https://training.appline.ru/user/login");
        driverManager.getDriver().get(baseUrl);
    }

    @After
    public static void after() {
        driverManager.getDriver().quit();
    }


//    @After
//    public void after() {
//        InitManager.quitFramework();
//    }
}
//final WebDriver driver = DriverManager.getInstance().getDriver();
//
////@After
////    public void tearDown(Scenario scenario){
////    String screenshotName = scenario.getName().replace(" ", "_");
////    try {
////        if (scenario.isFailed()){
////            scenario.log("Alarma!");
////            TakesScreenshot ts = (TakesScreenshot) driver;
////            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshot, "image/png", screenshotName);
////        }
////    } catch (Exception e){
////        e.printStackTrace();
////    }
////    DriverManager.getInstance().getDriver().quit();
////}
////
