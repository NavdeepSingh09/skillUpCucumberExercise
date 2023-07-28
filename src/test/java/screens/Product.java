/**
 * @author: Navdeep
 * Date: 2023-07-25
 * Time: 10:55 p.m.
 */
package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;

public class Product extends SeleniumWebDriver {
    static Double totalItemPrice;
    static Double priceItem1;
    static Double priceItem2;

    private static WebElement removeSauceLabsBackpack() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    private static WebElement removeSauceLabsFleeceJacket() {
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }

    private static WebElement cart() {
        return driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    }

    private static WebElement addToCartSauceLabsBackpack() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    private static WebElement addToCartSauceLabsFleeceJacket() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    private static WebElement pageTitle() {
        return driver.findElement(By.xpath("//span[@class='title' and text()='Products']"));
    }

    private static WebElement priceBackpack() {
        return driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/preceding::div[@class='inventory_item_price']"));
    }

    private static WebElement priceFleeceJacket() {
        return driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']/preceding-sibling::div[@class='inventory_item_price']"));
    }

    public static void isAt() {
        pageTitle().isDisplayed();
    }

    private static double priceItem(WebElement itemLocator) {
        String price = itemLocator.getText();
        String splitPrice = price.replaceAll("\\$", "");
        return Double.parseDouble(splitPrice);
    }

    public static void addFirstItemToTheCart() {
        priceItem1 = priceItem(priceBackpack());
        addToCartSauceLabsBackpack().click();
    }

    public static void verifyButton_removeFirstItem() {
        assertTrue(removeSauceLabsBackpack().isDisplayed());
    }

    public static void verifyButton_removeSecondItem() {
        assertTrue(removeSauceLabsFleeceJacket().isDisplayed());
    }

    public static void clickIcon_cart() {
        cart().click();
    }

    /**
     * Here I am calculating the price of first and second item
     * @return price total of first and last
     */
    public static double totalPrice() {
        return totalItemPrice = priceItem1 + priceItem2;
    }

    public static void addSecondItemToCart() {
        priceItem2 = priceItem(priceFleeceJacket());
        addToCartSauceLabsFleeceJacket().click();
    }
}
