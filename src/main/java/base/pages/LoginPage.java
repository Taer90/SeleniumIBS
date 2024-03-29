package base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@type='text']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='_submit']")
    private WebElement enterButton;


    public MainPage successLogin(String login, String password) {
        fillInputField(loginField, login);
        fillInputField(passwordField, password);
        enterButton.click();
        return pageManager.getMainPage();
    }
}


