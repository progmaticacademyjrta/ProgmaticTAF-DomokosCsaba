package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilPage;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {

    HomePage homepage;

    ProfilPage profilPage;

    LoginPage loginPage;

    @Test(groups = "page element test", description = "TC05 - Profile Page Successfully Logged Test checks if the profile button opens the rpofile page.")
    public void profilePageSuccessfullyLoggedTest() {
        homepage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        profilPage = new ProfilPage(driver);

        homepage.loadHomePage();
        homepage.makeAppointmentButtonCheck();
        loginPage.correctSignInData();
        profilPage.profilPageSuccessfullyLogged();

        System.out.println("Profile page successfully loaded.");

    }
}
