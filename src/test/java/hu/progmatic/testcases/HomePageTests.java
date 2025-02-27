package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(groups = "page element test", description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }

    @Test(groups = "page element test", description = "TC02 - Test to check if Make appointment navigates to an other page.")
    public void makeAppointmentButtonTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppointmentButtonCheck();
    }
}
