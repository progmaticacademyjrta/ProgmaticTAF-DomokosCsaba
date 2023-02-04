package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FullAppointmentBookingWithHistoryCheckTest extends DriverBaseTest {

    WebDriver driver = new ChromeDriver();
    By makeAppointmentButtonBy = By.id("btn-make-appointment");
    By usernameBy = By.id("txt-username");
    By passwordBy = By.id("txt-password");
    By loginButtonBy = By.id("btn-login");
    By applyForHospitalCheckBoxBy = By.id("chk_hospotal_readmission");
    By datePickerFieldBy = By.id("txt_visit_date");
    By commentFieldBy = By.id("txt_comment");
    By bookAppointmentButtonBy = By.id("btn-book-appointment");
    By menuBadgeBy = By.id("menu-toggle");
    By historyButtonBy = By.xpath("//*[contains(text(),'History')]");

    By panelDateBy = By.className("panel-heading");

    @Test(groups = "E2E test", description = "TC06 - CURA Booking Test testing the whole process of booking with final check in History menu.")
    public void curaBookingCheckedInHistoryTest() {

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentButton = driver.findElement(makeAppointmentButtonBy);
        makeAppointmentButton.click();
        WebElement usernameInput = driver.findElement(usernameBy);
        usernameInput.sendKeys("John Doe");
        WebElement passwordInput = driver.findElement(passwordBy);
        passwordInput.sendKeys("ThisIsNotAPassword");
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();
        WebElement applyForHospitalCheckBox = driver.findElement(applyForHospitalCheckBoxBy);
        applyForHospitalCheckBox.click();
        WebElement datePickerField = driver.findElement(datePickerFieldBy);
        datePickerField.click();
        datePickerField.sendKeys("12/02/2023");
        WebElement commentField = driver.findElement(commentFieldBy);
        commentField.sendKeys("I need medical help urgently.");
        WebElement bookAppointmentButton = driver.findElement(bookAppointmentButtonBy);
        bookAppointmentButton.click();
        WebElement menuBadge = driver.findElement(menuBadgeBy);
        menuBadge.click();
        WebElement historyButton = driver.findElement(historyButtonBy);
        historyButton.click();
        WebElement panelDate = driver.findElement(panelDateBy);



        Assert.assertEquals(panelDate.getText(), "12/02/2023");

        System.out.println("Appointment booking registered in history.");

    }


}