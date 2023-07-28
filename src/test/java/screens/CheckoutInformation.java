/**
 * @author: Navdeep
 * Date: 2023-07-27
 * Time: 10:27 p.m.
 */
package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

public class CheckoutInformation extends SeleniumWebDriver {
    private static WebElement isAtCheckoutUserInformation() {
        return driver.findElement(By.xpath("//span[@class='title' and text()='Checkout: Your Information']"));
    }

    private static WebElement firstName() {
        return driver.findElement(By.id("first-name"));
    }

    private static WebElement lastName() {
        return driver.findElement(By.id("last-name"));
    }

    private static WebElement postalCode() {
        return driver.findElement(By.id("postal-code"));
    }

    private static WebElement buttonContinue() {
        return driver.findElement(By.id("continue"));
    }

    public static void isAt() {
        isAtCheckoutUserInformation().isDisplayed();
    }

    public static void setText_firstName() {
        firstName().sendKeys("myFirstName");
    }

    public static void setText_lastName() {
        lastName().sendKeys("myLastName");
    }

    public static void setText_postalCode() {
        postalCode().sendKeys("123456");
    }

    public static void clickButton_continue() {
        buttonContinue().click();
    }
}
