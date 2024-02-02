package base.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement title;

    @FindBy(xpath = "//ul[contains(@class, 'main-menu')]/li[@class='dropdown'][2]")
    private WebElement expensesDropMenu;

    @FindBy(xpath = "//ul[contains(@class, 'main-menu')]/li[@class='dropdown'][2]//li[@data-route='crm_business_trip_index']")
    private WebElement businessTripsButton;
    @Step
public MainPage checkTitle(){
    Assert.assertEquals("Панель быстрого запуска", title.getText());
    return pageManager.getMainPage();
}
    @Step
public BusinessTripPage goToBusinessTrips(){
    selectFromList(expensesDropMenu, businessTripsButton);
    return pageManager.getBusinessTripPage();
}


}
