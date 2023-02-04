package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Test(groups = "page element test", description = "TC03 - Check Wrong Sign In Data Test showing that the use of wrong username and password does not allow signing in.")
    public void checkWrongSignInDataTest() {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppointmentButtonCheck();
        loginPage.wrongSignInDataCheck();

        System.out.println("attempt to sign in with wrong username and password done.");
    }
}
