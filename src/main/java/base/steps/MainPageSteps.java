package base.steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class MainPageSteps {
    private final PageManager pageManager = PageManager.getInstance();

    @И("Проверить наличие на странице заголовка Панель быстрого запуска")
    public void checkTitle() {
        pageManager.getMainPage().checkTitle();
    }

    @И("В выплывающем окне раздела Расходы нажать на Командировки")
    public void goToBusinessTrips(){
        pageManager.getMainPage().goToBusinessTrips();
    }
}
