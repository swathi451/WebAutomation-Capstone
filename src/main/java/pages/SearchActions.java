package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchActions {
    private WebDriver driver;

    public SearchActions(WebDriver driver) {
        this.driver = driver;
    }

    public void performSearch(String productName) {
        // Implementation of search actions
        driver.findElement(By.id("searchInput")).sendKeys(productName);
        driver.findElement(By.id("searchButton")).click();
    }
}
