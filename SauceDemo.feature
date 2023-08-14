Feature: To Validate the Login Page

  Scenario Outline: User login using valid credentials
    Given user launch the url "<url>"
    When user enter the valid username "<username>"
    And user enter the vaild password "<password>"
    And user click on login button
    Then user able to login application
    And user get name and price of fifth availaible item
    And user click on add to cart button
    And user navigate to cart
    And user continue to checkout the item
    And user fill the details for delivery
    And user enter the firstname "<firstname>"
    And user enter the lastname "<lastname>"
    And user enter the postalcode "<postalcode>"
    And user click on continue
    And user validate the actual name "<productname>" and price "<productprice>"
    And user click on finish button
    Then user verfiy the confirmation message "<Expectedmessage>"

    Examples: 
      |url|username|password|firstname|lastname|postalcode|productname|productprice|Expectedmessage|
      |https://www.saucedemo.com/|standard_user|secret_sauce|Sanjay|M|641687|Sauce Labs Backpack|$29.99|Thank you for your order!|
      |https://www.saucedemo.com/|standard_user|secret_sauce|Mannivannan|S|666000|Sauce Labs Backpack|$29.99|Thank you for your order!|

  Scenario Outline: User login using Invalid credentials
   	Given user launch the url "<url>"
   	When user enter the Invalid username "<username>"
   	And user enter the Invalid password "<password>"
   	And user click on login button
   	Then user should failed to login and showing Error
   	
   	Examples: 
   		|url|username|password|
   		|https://www.saucedemo.com/|Stephen Fleming|Fletcher|