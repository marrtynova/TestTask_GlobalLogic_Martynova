package utils;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.SessionId;

public class BrowserUtils {

    private Browser browser = AqualityServices.getBrowser();





    public void maximizeBrowser() {
        browser.maximize();
    }

    public void quitBrowser() {
        browser.quit();
    }

    public void refresh() {
        browser.refresh();
    }

    public void goTo(String url) {
        browser.goTo(url);
    }

    public void waitForPageToLoad() {
        browser.waitForPageToLoad();
    }
}