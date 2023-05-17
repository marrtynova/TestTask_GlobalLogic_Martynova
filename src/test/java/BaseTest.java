import aquality.selenium.core.logging.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;

public class BaseTest {
    BrowserUtils browser = new BrowserUtils();

    @BeforeMethod
    public void setup() {
        Logger.getInstance().info("Test is starting");
        browser.maximizeBrowser();
    }

    @AfterMethod
    public void tearDown() {
        Logger.getInstance().info("Test is ending");
        browser.quitBrowser();
    }
}