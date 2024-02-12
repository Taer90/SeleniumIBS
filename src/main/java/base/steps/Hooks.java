package base.steps;

import io.cucumber.java.After;
import managers.DriverManager;
import managers.PageManager;
import org.junit.Before;

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
