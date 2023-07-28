/**
 * @author: Navdeep
 * Date: 2023-07-27
 * Time: 10:45 p.m.
 */
package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import java.text.DecimalFormat;


public class CheckoutOverview extends SeleniumWebDriver {

    private static WebElement isAtCheckoutOverview() {
        return driver.findElement(By.xpath("//span[@class='title' and text()='Checkout: Overview']"));
    }

    private static WebElement subTotal() {
        return driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
    }

    private static WebElement tax() {
        return driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
    }

    private static WebElement total() {
        return driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
    }

    private static WebElement finish() {
        return driver.findElement(By.id("finish"));
    }

    public static void isAt() {
        isAtCheckoutOverview().isDisplayed();
    }

    public static void verify_subTotalPriceCorrect() {
        subTotal().getText().contains(String.valueOf(Product.totalPrice()));
    }

    public static void verify_grandTotalPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        total().getText().contains(String.valueOf(df.format(taxDouble(tax()) + Product.totalPrice())));
    }

    public static void clickButton_finish() {
        finish().click();
    }

    public static double taxDouble(WebElement itemLocator) {
        String price = itemLocator.getText();
        String[] splitPrice = price.split("\\$");
        return Double.parseDouble(splitPrice[1]);
    }
}
