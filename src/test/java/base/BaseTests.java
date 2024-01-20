package base;

import managers.DriverManager;
import managers.PageManager;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private static DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    @Before
    public void before() {
        String baseUrl = "https://training.appline.ru/user/login";
        driverManager.getDriver().get(baseUrl);
    }

    @AfterClass
    public static void after() throws IOException {
        var sourceFile = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("D:\\Download\\Обучение\\IBS\\Selenium — применение в автоматизированном тестировании\\screenshot.png"));
        driverManager.getDriver().quit();
    }

}
