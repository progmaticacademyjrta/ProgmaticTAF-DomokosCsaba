package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilPage {

    WebDriver driver;

    By menuBadgeBy = By.id("menu-toggle");

    By profileButtonBy = By.xpath("//*[contains(text(),'Profile')]");

    public ProfilPage(WebDriver driver) {
        this.driver = driver;
    }

    public void profilPageSuccessfullyLogged() {
        WebElement menuBadge = driver.findElement(menuBadgeBy);
        menuBadge.click();
        WebElement profileButton = driver.findElement(profileButtonBy);
        profileButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#profile");
    }
}
