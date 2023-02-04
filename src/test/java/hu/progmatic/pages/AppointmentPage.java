package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppointmentPage {

    WebDriver driver;

    By applyForHospitalCheckBoxBy = By.id("chk_hospotal_readmission");
    By datePickerFieldBy = By.id("txt_visit_date");

    By commentFieldBy = By.id("txt_comment");
    By bookAppointmentButtonBy = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void makeAppointmentFunctionCheck() throws InterruptedException {
        WebElement applyForHospitalCheckBox = driver.findElement(applyForHospitalCheckBoxBy);
        applyForHospitalCheckBox.click();
        WebElement datePickerField = driver.findElement(datePickerFieldBy);
        datePickerField.click();
        datePickerField.sendKeys("12/02/2023");
        WebElement commentField = driver.findElement(commentFieldBy);
        commentField.sendKeys("I need medical help urgently.");
        WebElement bookAppointmentButton = driver.findElement(bookAppointmentButtonBy);
        bookAppointmentButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
    }
}
