Feature: Login to sauce demo site
  The user should able to login successfully logged in
  The give credentials must be valid

  Scenario: User must be logged in to sauce site
    Given Navigate to sauce demo app
    When User enter valid username "standard_user" given filed
    And User enter valid password "secret_sauce" given filed
    And User click on Login button
    Then User navigate to product page

  Scenario Outline: User must be logged in to sauce site
    Given Navigate to sauce demo app
    When User enter valid username "<username>" given filed
    And User enter valid password "<password>" given filed
    And User click on Login button
    Then User navigate to product page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
