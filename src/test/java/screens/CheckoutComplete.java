/**
 * @author: Navdeep
 * Date: 2023-07-27
 * Time: 10:57 p.m.
 */
package screens;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;

public class CheckoutComplete extends SeleniumWebDriver {
    private static WebElement isAtCheckoutComplete() {
        return driver.findElement(By.xpath("//span[@class='title' and text()='Checkout: Complete!']"));
    }

    private static WebElement thankYouMessage() {
        return driver.findElement(By.xpath("//h2[@class='complete-header']"));
    }

    private static WebElement buttonBackHome() {
        return driver.findElement(By.id("back-to-products"));
    }

    public static void isAt() {
        isAtCheckoutComplete().isDisplayed();
    }

    public static void verify_thankYouMessage() {
        thankYouMessage().getText().equals("Thank you for your order!");
    }

    public static void clickButton_backToHome() {
        buttonBackHome().click();
    }
}
