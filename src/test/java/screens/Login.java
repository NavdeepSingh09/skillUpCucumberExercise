/**
 * @author: Navdeep
 * Date: 2023-07-25
 * Time: 10:07 p.m.
 */
package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;

public class Login extends SeleniumWebDriver {

    private static WebElement textField_userName() {
        return driver.findElement(By.id("user-name"));
    }

    private static WebElement textField_password() {
        return driver.findElement(By.id("password"));
    }

    private static WebElement button_login() {
        return driver.findElement(By.id("login-button"));
    }

    private static WebElement text_errorMessage() {
        return driver.findElement(By.xpath("//h3"));
    }

    public static void navigateLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public static void sendText_userName(String userName) {
        textField_userName().sendKeys(userName);
    }

    public static void sendText_password(String password) {
        textField_password().sendKeys(password);
    }

    public static void clickButton_login() {
        button_login().click();
    }

    public static void verifyErrorMessage() {
        assertTrue(text_errorMessage().getText().contains("Username is required"));
    }
}
