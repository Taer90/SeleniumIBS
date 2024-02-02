package base.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTripPage extends BasePage {
    @FindBy(xpath = "//select[@name='crm_business_trip[businessUnit]']")
    private WebElement subdivisionList;

    @FindBy(xpath = "//option[text()='Администрация']")
    private WebElement subdivisionAdministration;
    @FindBy(xpath = "//a[@id='company-selector-show']")
    private WebElement openOrganizationListButton;
    @FindBy(xpath = "//div[@class='company-container']//div[1]")
    private WebElement organizationList;

    @FindBy(xpath = "//li[contains(@class, 'select2-results-dept-0')][6]")
    private WebElement someOrganization;
    @FindBy(xpath = "//input[@data-ftid='crm_business_trip_tasks_1']")
    private WebElement orderTicketsCheckBox;
    @FindBy(xpath = "//input[@data-ftid='crm_business_trip_departureCity']")
    private WebElement departureCityField;
    @FindBy(xpath = "//input[@data-ftid='crm_business_trip_arrivalCity']")
    private WebElement arrivalCityField;
    @FindBy(xpath = "//div[contains(@class,'control-group-date')][1]//input[contains(@class, 'datepicker-input')]")
    private WebElement departureDateField;
    @FindBy(xpath = "//div[contains(@class,'control-group-date')][2]//input[contains(@class, 'datepicker-input')]")
    private WebElement arrivalDateField;
    @FindBy(xpath = "//span[@class='validation-failed']")
    private WebElement dateError;
    @FindBy(xpath = "//div[contains(@class,'title-buttons-container')]//div[@class='btn-group'][2]//button")
    private WebElement saveAndCloseButton;
    @FindBy(xpath = "//span[text()='Список командируемых сотрудников не может быть пустым']")
    private WebElement employeesListError;
    @FindBy(xpath = "//html")
    private WebElement blankArea;
    @Step
    public CreateTripPage fillNotAllFields() {
        selectFromList(subdivisionList, subdivisionAdministration);
        openOrganizationListButton.click();
        selectFromList(organizationList, someOrganization);
        orderTicketsCheckBox.click();
        fillInputField(departureCityField, "Россия, Владивосток");
        fillInputField(arrivalCityField, "Россия, Москва");
        fillInputField(departureDateField, "12.12.2024");
        blankArea.click();
        fillInputField(arrivalDateField, "24.12.2024");
        blankArea.click();
        saveAndCloseButton.click();
        Assert.assertTrue(employeesListError.isDisplayed());
        return pageManager.getCreateTripPage();
    }
}

