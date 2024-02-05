package base.pages;

import io.qameta.allure.Step;
import managers.DriverManager;
import managers.PageManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), Duration.ofSeconds(10));



    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);

    }
@Step
    //Заполнение полей определенным значением
    protected void fillInputField(WebElement element, String value) {
        element.click();
        element.clear();
        element.sendKeys(value);
    }
    @Step
    protected void selectFromList(WebElement list, WebElement element) {
        list.click();
        element.click();
    }
    @Step
    //Проверка изменения цвета рамки поля при ошибке
    protected void borderRedColor(WebElement element) {
        String expected = "rgba(255, 16, 16, 1)";
        Assert.assertEquals("Рамка другого цвета", expected, element.getCssValue("color"));
    }

    @Step
    //Проверка текущего url
    public void checkUrl(String url) {
        Assert.assertEquals(url, driverManager.getDriver().getCurrentUrl());
    }
    @Step
    public void elementWait(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    @Step
    public void setTimer(){
        FluentWait wait = new FluentWait(driverManager.getDriver());
//Specify the timout of the wait
        wait.withTimeout(Duration.ofSeconds(10));
    }
    @Step
    public void enterDate(WebElement element, String value) {
        element.click();
        element.sendKeys(Keys.LEFT);
        element.sendKeys(Keys.LEFT);
        element.sendKeys(value);
    }
}