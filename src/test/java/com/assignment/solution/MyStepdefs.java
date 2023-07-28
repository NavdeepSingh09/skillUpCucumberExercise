package com.assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.*;

import static screens.Login.*;

/**
 * @author: Navdeep
 * Date: 2023-07-17
 * Time: 11:06 p.m.
 */

public class MyStepdefs {
    @Given("Navigate to sauce demo app")
    public void navigateToSauceDemoApp() {
        Login.navigateLoginPage();
    }

    @When("User enter valid username {string} given filed")
    public void userEnterValidUsernameGivenFiled(String name) {
        System.out.println("User name ="+name);
        Login.sendText_userName(name);
    }

    @And("User enter valid password {string} given filed")
    public void userEnterValidPasswordGivenFiled(String password) {
        Login.sendText_password(password);
    }

    @And("User click on Login button")
    public void userClickOnLoginButton() {
        Login.clickButton_login();
    }

    @Then("User navigate to product page")
    public void userNavigateToProductPage() {
        Product.isAt();
    }

    @Then("Verify error message without any credentials")
    public void verifyErrorMessageWithoutAnyCredentials() {
        Login.verifyErrorMessage();
    }

    @When("Add Sauce Labs Backpack to the cart and store price in the object to verify in future")
    public void addSauceLabsBackpackToTheCartAndStorePriceInTheObjectToVerifyInFuture() {
        Product.addFirstItemToTheCart();
    }

    @And("Verify the remove button for first item")
    public void verifyTheRemoveButtonForFirstItem() {
        Product.verifyButton_removeFirstItem();
    }

    @When("Add Sauce Labs Fleece Jacket to the cart and store price in the object to verify in future")
    public void addSauceLabsFleeceJacketToTheCartAndStorePriceInTheObjectToVerifyInFuture() {
        Product.addSecondItemToCart();
    }

    @And("Verify the remove button for second item")
    public void verifyRemoveButtonForSecondItem() {
        Product.verifyButton_removeSecondItem();
    }

    @Then("Click on the shopping cart icon")
    public void clickOnTheShoppingCartIcon() {
        Product.clickIcon_cart();
    }

    @When("Verify the price of first item")
    public void verifyThePriceOfFirstItem() {
        Cart.verifyPrice_firstItem();
    }

    @When("Verify the price of second item")
    public void verifyThePriceOfSecondItem() {
        Cart.verifyPrice_secondItem();
    }

    @Then("click on checkout button")
    public void clickOnCheckoutButton() {
        Cart.clickButton_checkout();
    }

    @And("verify that you are on checkout information screen")
    public void verifyThatYouAreOnCheckoutInformationScreen() {
        CheckoutInformation.isAt();
    }

    @When("Enter your first name")
    public void enterYourFirstName() {
        CheckoutInformation.setText_firstName();
    }

    @When("Enter your last name")
    public void enterYourLastName() {
        CheckoutInformation.setText_lastName();
    }

    @And("Enter your postal code")
    public void enterYourPostalCode() {
        CheckoutInformation.setText_postalCode();
    }

    @Then("click on continue button")
    public void clickOnContinueButton() {
        CheckoutInformation.clickButton_continue();
    }

    @When("Verify subtotal price")
    public void verifySubtotalPrice() {
        CheckoutOverview.verify_subTotalPriceCorrect();
    }

    @When("Verify Grand total")
    public void verifyGrandTotal() {
        CheckoutOverview.verify_grandTotalPrice();
    }

    @Then("Click on finish button")
    public void clickOnFinishButton() {
        CheckoutOverview.clickButton_finish();
    }

    @When("Verify you are on checkout overview screen")
    public void verifyYouAreOnCheckoutOverviewScreen() {
        CheckoutOverview.isAt();
    }

    @And("Verify thank you message")
    public void verifyThankYouMessage() {
        CheckoutComplete.verify_thankYouMessage();
    }

    @Then("Verify you are on Checkout complete screen")
    public void verifyYouAreOnCheckoutCompleteScreen() {
        CheckoutComplete.isAt();
    }

    @And("click on back to home button")
    public void clickOnBackToHomeButton() {
        CheckoutComplete.clickButton_backToHome();
    }


}
