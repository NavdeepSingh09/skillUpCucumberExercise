/**
 * @author: Navdeep
 * Date: 2023-07-27
 * Time: 10:16 p.m.
 */
package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;
import static screens.Product.priceItem1;
import static screens.Product.priceItem2;

public class Cart extends SeleniumWebDriver {
    private static WebElement priceBackpackCart() {
        return driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/preceding-sibling::div[@class='inventory_item_price']"));
    }

    private static WebElement priceFleeceJacketCart() {
        return driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']/preceding-sibling::div[@class='inventory_item_price']"));
    }

    private static WebElement checkout() {
        return driver.findElement(By.id("checkout"));
    }

    public static void verifyPrice_firstItem() {
        assertTrue(priceBackpackCart().getText().contains(String.valueOf(priceItem1)));
    }

    public static void verifyPrice_secondItem() {
        assertTrue(priceFleeceJacketCart().getText().contains(String.valueOf(priceItem2)));
    }

    public static void clickButton_checkout() {
        checkout().click();
    }
}
