package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    //  private static final Object lock = new Object();
    private static DriverFactory instance = new DriverFactory();

    private DriverFactory() {

    }

    public static DriverFactory getInstance() {
        return instance;
    }

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            setWebDriver();
        }
        return webDriver.get();
    }

    private static void setWebDriver() {
        // String browser = System.getProperty("browser", "chrome").toLowerCase();
        String browser = System.getProperty("browser", "chrome").toLowerCase();

        switch (browser) {
            case "chrome":
                // Set the path to your ChromeDriver executable
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                webDriver.set(new ChromeDriver());
                break;
            case "firefox":
                // Set the path to your GeckoDriver executable
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                FirefoxOptions options = new FirefoxOptions();
                // Add any Firefox options if needed
                webDriver.set(new FirefoxDriver(options));
                break;
            // Add more cases for other browsers as needed
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    //    public static void quitDriver() {
//        if (webDriver.get() != null) {
//            webDriver.get().quit();
//            webDriver.remove();
//        }
//    }
    public void addToCart() {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        // Test implementation
        driver.quit();
    }
    public void cleanUp() {
        quitDriver();
    }
    private void quitDriver() {
        if (webDriver.get() != null) {
            webDriver.get().quit();
            webDriver.remove();
        }
    }
//    private Map<String, WebDriverFactory> factoryMap = new HashMap<>();
//
//    public WebDriver getDriver(String browser) {
//        if (!factoryMap.containsKey(browser)) {
//            throw new IllegalArgumentException("No factory found for browser: " + browser);
//        }
//        return factoryMap.get(browser).createWebDriver();
//    }

}
