package example.core.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import example.core.*;
import example.core.config.ConfigProperties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class RgsBeforeAfter {
    public static Properties properties = ConfigProperties.getInstance().getProperties();

   @Before
    public static void beforeEach() {
        System.out.println("1. Открываем website Росгострах");
        String driverName = properties.getProperty("driverPropertyName");
        String parh = properties.getProperty("pathToDriver");
        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");
        if (browser == null || "".equals(browser))
            browser = Config.CHROME;
        System.setProperty(driverName, parh);
        Init.setBrowser(browser);
        switch (browser) {
            case Config.FIREFOX:
                Init.setDriver(new FirefoxDriver());
                break;
            case Config.IE:
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.requireWindowFocus();
                Init.setDriver(new InternetExplorerDriver());
                break;
            default:
                Init.setDriver(new ChromeDriver());
        }
        Init.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Init.getDriver().manage().window().maximize();
        Init.getDriver().get(url);
        }

    @After
    public static void afterEach() {
        System.out.println("close");
        Init.getDriver().close();
        Init.getDriver().quit();
    }
}
