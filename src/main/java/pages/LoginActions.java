package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginActions {
    private WebDriver driver;
    LoginActions(WebDriver driver){
        this.driver=driver;
    }
    public void performLogin(String username, String password) {
        driver.findElement(By.xpath("//input[@id=\"CustomerEmail\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id=\"CustomerPassword\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

}
