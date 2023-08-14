Feature: SwagLab feature

  Scenario: Validate SwagLAb feature
    Given user launch the application
    When user enter username and password as "standard_user" and "secret_sauce"
    And user click on login button
    Then user get namd and price of first availaible item
    And user click on add to cart btn
    And user navigate to cart
    And user continue to checkout teh item
    And user fill the details for delivery
    Then user verfiy the confirmation message
 