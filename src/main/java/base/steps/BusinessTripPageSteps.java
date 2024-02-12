package base.steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class BusinessTripPageSteps {
    private final PageManager pageManager = PageManager.getInstance();

    @И("Нажать на  Создать командировку")
    public void goToCreateTripPage() {
        pageManager.getBusinessTripPage().goToCreateTripPage();
    }

}
