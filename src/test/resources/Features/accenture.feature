Feature: Submit insurance Quotation

  Scenario: Enter on website
    Given browser is open
    Then user navigate to homepage

  Scenario: Fill first page - Enter Vehicle data
    When user fill vehicle data info
    And counter is zero
    Then user click on next button

  Scenario: Fill page - Insurant data
    When user fill insurant data info
    And counter is zero - insurant page
    Then user click on next button - insurant page

  Scenario: Fill page - Product data
    When user fill product data info
    And counter is zero  - product page
    Then user click on next button  - product page

  Scenario: Select price Option on Price Option Page
    When user select price option
    And counter is zero - price page
    Then user click on next button - price page

  Scenario: Fill page - Send Quote
    When user fill quote info
    And counter is zero  - quote page
    Then user click on send button

  Scenario: Waiting for E-mail Success
    When user receive email success message
