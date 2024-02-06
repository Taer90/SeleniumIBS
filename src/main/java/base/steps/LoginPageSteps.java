package base.steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class LoginPageSteps {
    private final PageManager pageManager = PageManager.getInstance();

@И("Пройти авторизацию: водим логин \"([^\"]*)\" и пароль \"([^\"]*)\"$")
    public void successLogin(String login, String password){
    pageManager.getLoginPage().successLogin(login, password);
}

//    @И("^Закрытия сообщения cookies$")
//    public void closeCookiesDialog() {
//        pageManager.getHomePage().closeCookiesDialog();
//    }
//
//    @И("^Выбираем \"(.+)\" в главном меню$")
//    public void selectBaseMenu(String nameMenu) {
//        pageManager.getHomePage().selectBaseMenu(nameMenu);
//    }
//
//    @И("^Выбираем \"(.+)\" в подменю главного меню$")
//    public void closeCookiesDialog(String nameSubMenu) {
//        pageManager.getHomePage().selectSubMenu(nameSubMenu);
//    }
}
