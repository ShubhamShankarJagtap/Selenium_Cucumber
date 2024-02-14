Feature: Login

  Scenario: Verify the login functionality with all valid credentials.

    Given I launch the "chrome" browser.
    When I enter the url "https://admin-demo.nopcommerce.com/login"
    Then page title should be "Your store. Login"
    And I enter the email as "admin@yourstore.com"
    And I enter the password as "admin"
    When I click on log in button
    Then page title should be "Dashboard / nopCommerce administration"
    When I click on logout button
    Then page title should be "Your store. Login"

    Scenario Outline: Verify the login functionality with invalid credentials
      Given I launch the "chrome" browser.
      When I enter the url "https://admin-demo.nopcommerce.com/login"
      Then page title should be "Your store. Login"
      And I enter the email as "<email>"
      And I enter the password as "<password>"
      When I click on log in button
      Then An error message should be displayed "<errorMessage>"

      Examples:
        |      email              |   password   |   errorMessage   |
        |     test1@gmail.com     |              |   Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect |
        |                         |   admin@123  |   Please enter your email                                                                                |
        |      11111111           |      hcjsd   |   Wrong email  |