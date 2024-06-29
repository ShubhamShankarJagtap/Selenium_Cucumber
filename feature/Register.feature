Feature: Register

  Scenario: Verify the dataTable
    Given I navigate to the website.
    When  I enter the user details
    | SHUBHAM| JAGTAP  | Shubh.JagTap21@Gmail.com | 123445 | KHANDALA|
    | Manoj  | KULKARNI| manojKul372@gmail.com  | 123    |Nashik   |
    | Peter  | parker  | peter12@gmail.com      | 3552   |  london  |
    |   Sam  | bahadur |sam@gmail.com           | 35621  |  lisbon |
    |  maddy  |  gates | maddy69@gmail.com      |  343443 |  thailand |
    Then User registration is successful.

    @withMap
  Scenario: Verify the dataTable with the map.
    Given I navigate to the website.
    When  I enter the user details with map.
      |Firstname|lastname|         email            |password|city|
      | SHUBHAM| JAGTAP  | Shubh.JagTap21@Gmail.com | 123445 | KHANDALA|
      | Manoj  | KULKARNI| manojKul372@gmail.com  | 123    |Nashik   |
      | Peter  | parker  | peter12@gmail.com      | 3552   |  london  |
      |   Sam  | bahadur |sam@gmail.com           | 35621  |  lisbon |
      |  maddy  |  gates | maddy69@gmail.com      |  343443 |  thailand |
    Then User registration is successful.

