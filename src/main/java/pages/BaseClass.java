package pages;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    protected PageWaits waits;
    protected WebDriver webDriver;
    protected PageActions actions;

    public BaseClass(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.waits = new PageWaits(webDriver);
        this.actions = new PageActions(webDriver);
    }
}
