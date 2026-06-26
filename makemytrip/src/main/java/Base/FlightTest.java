package Base;

import Base.BaseTest;
import Page.FlightPage;
import org.testng.annotations.Test;

public class FlightTest extends BaseTest {

    @Test
    public void searchFlight() {

        FlightPage flightPage = new FlightPage(driver);

        flightPage.closePopup();
        flightPage.selectFromCity("Bhubaneswar");
        flightPage.selectToCity("Delhi");
        flightPage.clickSearch();
    }
}