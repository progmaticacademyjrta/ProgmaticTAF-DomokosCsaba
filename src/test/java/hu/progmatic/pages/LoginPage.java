package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By usernameBy = By.id("txt-username");

    By passwordBy = By.id("txt-password");

    By loginButtonBy = By.id("btn-login");

    By failLoginTextBy = By.className("text-danger");

    public LoginPage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void wrongSignInDataCheck(){
        WebElement usernameInput = driver.findElement(usernameBy);
        usernameInput.sendKeys("Whatever Username");
        WebElement passwordInput = driver.findElement(passwordBy);
        passwordInput.sendKeys("whateverpassword");
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();

        WebElement failLoginText = driver.findElement(failLoginTextBy);

        Assert.assertEquals(failLoginText.getText(), "Login failed! Please ensure the username and password are valid.");
    }

    public void correctSignInData(){
        WebElement usernameInput = driver.findElement(usernameBy);
        usernameInput.sendKeys("John Doe");
        WebElement passwordInput = driver.findElement(passwordBy);
        passwordInput.sendKeys("ThisIsNotAPassword");
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();
    }
}
