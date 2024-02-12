package base.steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class CreateTripPageSteps {
    private final PageManager pageManager = PageManager.getInstance();

    @И("На странице создания командировки заполнить или выбрать поля")
    public void fillNotAllFields() {
        pageManager.getCreateTripPage().fillNotAllFields();
    }

    @И("Проверить, что на странице появилось сообщение: Список командируемых сотрудников не может быть пустым")
    public void checkError() {
        pageManager.getCreateTripPage().checkError();
    }

}
