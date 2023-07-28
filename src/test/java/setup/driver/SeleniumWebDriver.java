/**
 * @author: Navdeep
 * Date: 2023-07-25
 * Time: 10:22 p.m.
 */
package setup.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static WebDriver initChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/sukhdeep/Desktop/IT/Chrome/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

}
