package managers;

import base.pages.BusinessTripPage;
import base.pages.CreateTripPage;
import base.pages.LoginPage;
import base.pages.MainPage;

public class PageManager {
    private static PageManager INSTANCE = null;

    private LoginPage loginPage;
    private MainPage mainPage;

    private BusinessTripPage businessTripPage;
    private CreateTripPage createTripPage;


    private PageManager() {
    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public BusinessTripPage getBusinessTripPage() {
        if (businessTripPage == null) {
            businessTripPage = new BusinessTripPage();
        }
        return businessTripPage;
    }

    public CreateTripPage getCreateTripPage() {
        if (createTripPage == null) {
            createTripPage = new CreateTripPage();
        }
        return createTripPage;
    }


}
