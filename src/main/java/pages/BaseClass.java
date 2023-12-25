package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

//    protected PageWaits waits;
   protected WebDriver webDriver;
//    protected PageActions actions;
//
//    public BaseClass(WebDriver webDriver) {
//
//        this.webDriver = webDriver;
//        this.waits = new PageWaits(webDriver);
//        this.actions = new PageActions(webDriver);
//    }
@BeforeMethod
public void setUp() {
   // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    WebDriver driver = new ChromeDriver();
}

    @AfterMethod
    public void tearDown() {
        if (webDriver!= null) {
           webDriver.quit();
        }
    }
}
