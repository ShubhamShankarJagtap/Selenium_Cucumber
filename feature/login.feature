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