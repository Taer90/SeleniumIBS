package base.steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class CreateTripPage {
    private final PageManager pageManager = PageManager.getInstance();

    @И("Проверить, что на странице появилось сообщение: Список командируемых сотрудников не может быть пустым")
    public void fillNotAllFields() {
        pageManager.getCreateTripPage().fillNotAllFields();
    }

}
