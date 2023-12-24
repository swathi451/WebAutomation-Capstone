package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript {
    private WebDriver driver;
    private LoginActions loginActions;
    private SearchActions searchActions;
    private CartActions cartActions;

   @BeforeMethod
    public void setUp() {
        // Initialize WebDriver and action classes before each test method
        driver = new ChromeDriver();
        loginActions = new LoginActions(driver);
        searchActions = new SearchActions(driver);
        cartActions = new CartActions(driver);
    }

 @Test
    public void testLoginAndSearch() {
        loginActions.performLogin("username", "password");
        searchActions.performSearch("Laptop");

        // Test implementation
    }

    @Test
    public void testAddToCart() {
        searchActions.performSearch("Mouse");
        cartActions.addToCart("Mouse");

        // Test implementation
    }

   @AfterMethod
    public void tearDown() {
        // Close the WebDriver after each test method
        if (driver != null) {
            driver.quit();
        }
    }
}
