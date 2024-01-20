import base.BaseTests;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

import static data.LoginForm.CORRECT_LOGIN;
import static data.LoginForm.CORRECT_PASSWORD;

public class Tests extends BaseTests {
    @Test
    @Tag("1")
    public void wrongEmail() {
        pageManager.getLoginPage()
                .successLogin(CORRECT_LOGIN.toString(), CORRECT_PASSWORD.toString())
                .checkTitle()
                .goToBusinessTrips()
                .goToCreateTripPage()
                .fillNotAllFields();
    }

}
