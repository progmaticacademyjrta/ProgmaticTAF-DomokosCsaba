package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverBaseTest {

    HomePage homepage;
    LoginPage loginPage;

    AppointmentPage appointmentPage;

    @Test(groups = "page element test", description = "TC04 - Appointment Booking Test showing that booking works with the manual insertion of the date.")
    public void appointmentBookingTest() throws InterruptedException {
        homepage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver);

        homepage.loadHomePage();
        homepage.makeAppointmentButtonCheck();
        loginPage.correctSignInData();
        appointmentPage.makeAppointmentFunctionCheck();

        System.out.println("Appointment booking done.");

    }
}
