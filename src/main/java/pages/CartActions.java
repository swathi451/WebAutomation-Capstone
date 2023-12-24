package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartActions {
    private WebDriver driver;

    public CartActions(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart(String product) {
        // Implementation of cart actions
        driver.findElement(By.id("addToCartButton")).click();
    }
}
