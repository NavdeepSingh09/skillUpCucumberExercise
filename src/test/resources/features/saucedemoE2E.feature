Feature: Verify end to end functionality of sauce demo site


  Scenario:Verify error message without enter any credentials
    Given Navigate to sauce demo app
    And User click on Login button
    Then Verify error message without any credentials


  Scenario: User must be logged in to sauce site
    When User enter valid username "standard_user" given filed
    And User enter valid password "secret_sauce" given filed
    And User click on Login button
    Then User navigate to product page

  Scenario: Add Items to the cart
    When Add Sauce Labs Backpack to the cart and store price in the object to verify in future
    And Verify the remove button for first item
    When Add Sauce Labs Fleece Jacket to the cart and store price in the object to verify in future
    And Verify the remove button for second item
    Then Click on the shopping cart icon

  Scenario:Verify the prices are same in cart screen for both items
    When Verify the price of first item
    When Verify the price of second item
    Then click on checkout button
    And verify that you are on checkout information screen

  Scenario: Fill the checkout information
    When Enter your first name
    When Enter your last name
    And Enter your postal code
    Then click on continue button

  Scenario: Verify tax and total price on checkout overview screen
    When Verify you are on checkout overview screen
    When Verify subtotal price
    When Verify Grand total
    Then Click on finish button
    Then Verify you are on Checkout complete screen
    And Verify thank you message
    And click on back to home button
    Then User navigate to product page