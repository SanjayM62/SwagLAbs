
Feature: This is to test google search
  

  @tag1
  Scenario: Google search scenario
    Given user is entering google.co.in
    When user is typing the name "Selenium"
    And enters the return key
    Then the user should see the search results

