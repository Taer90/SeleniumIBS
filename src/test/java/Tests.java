import base.BaseTests;
//import org.junit.Test;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

import project.properties.TestProperties;

import java.util.Properties;

public class Tests extends BaseTests {
    private Properties properties = TestProperties.getInstance().getProperties();

    @Test
    @Tag("1")
    public void fillTripRequest() {
        pageManager.getLoginPage()
                .successLogin(properties.getProperty("LOGIN"), properties.getProperty("PASSWORD"))
                .checkTitle()
                .goToBusinessTrips()
                .goToCreateTripPage()
                .fillNotAllFields();
    }

}
