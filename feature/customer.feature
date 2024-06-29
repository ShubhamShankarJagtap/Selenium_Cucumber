Feature: customer
  
  Scenario: Verify the create customer functionality
    Given I launch the "chrome" browser.
    When I enter the url "https://admin-demo.nopcommerce.com/login"
    Then page title should be "Your store. Login"
    And I enter the email as "admin@yourstore.com"
    And I enter the password as "admin"
    When I click on log in button
    Then page title should be "Dashboard / nopCommerce administration"
    When I click on the customers menu.
    And I click om the customers link.
    Then page title should be "Customers / nopCommerce administration"
    When I click on Add new button
    Then page title should be "Add a new customer / nopCommerce administration"
    When I enter the Email as "Test1@gmail.com"
    And I enter the PassWord as "user"
    And I enter the firstname as "Bill"
    And I enter the lastname as "Goldberg"
    And I select the gender as "Male"
    And I enter the date of birth as "14/04/1996"
    And I enter the company name as "World Wrestling Entertainment"
    And I click on tax exemption checkbox
    And I click the Newsletter and select first option
    Then I verify the Newsletter option "Test store 2"
    And I click on Customer roles dropdown and select guests
    And I click on Manager of vendors dropdown and select "vendor 1"
    And I click on the Active checkbox
    When I enter the admin comment.
    Then I click on Save button