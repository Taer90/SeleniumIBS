package base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessTripPage extends BasePage{
    @FindBy(xpath = "//div[contains(@class,'navbar-extra-righ')]//a[@title='Создать командировку']/..")
    private WebElement createTripButton;

    public CreateTripPage goToCreateTripPage(){
        createTripButton.click();
        return pageManager.getCreateTripPage();
    }
}
