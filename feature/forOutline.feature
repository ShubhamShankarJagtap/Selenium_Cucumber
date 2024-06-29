Feature: Registration

  @Outlines
  Scenario Outline: verify the register functionality.
    Given I launch the browser "chrome".
    And navigate to the url "https://www.opencart.com/"
    When I click on register button.
    And I enter the username as "<username>"
    And I enter the firstname as "<firstname>"
    And I enter the lastname as "<lastname>"
    And I enter the mail as "<email>"
    And I enter the country as "<country>"
    And I enter the password as "<password>"

    Examples:
      | username | firstname | lastname | email                    | country | password |
      | Sam      | steve     | smith    | shush.jagtap14@gmail.com | India   | 12334    |