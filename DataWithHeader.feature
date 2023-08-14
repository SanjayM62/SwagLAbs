
Feature: login feature of Sauce Lab

  
  Scenario: login scenario with valid credentials
  
    Given Go to the webpage
    When enter the below credentials
      |Username | Password|
      |standard_user | secret_sauce|
    
    
    And  click login btn

     
   
   