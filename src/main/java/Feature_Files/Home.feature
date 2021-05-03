Feature: User must be able to Login to the Homepage

  Scenario: Validate that the user is navigated to Welcome page
    Given Browser is open
    And User clicks on Welcome Login button

  Scenario: Validate that the user is able to Login with valid data
    When User enters valid phonenumber and password and User click on login

  Scenario: Validate that the user is in Home page
    When Click on Wallet tab and should be navigated to Payment manage page
