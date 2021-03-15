#Cucumber Feature file to test application features.

Feature: General reduced price products functionality
  
  Scenario: Get List of Reduced Products
    When a user makes a call to get list of reduced products 
    Then the user receives status code of 200
    And reduced products are successfully retrieved
    And the products are sorted by highest reduction price first

  Scenario: Get List of Reduced Products with reduction in percentage discount
    When a user makes a call to get list of reduced products with query parameter labelType as 'ShowPercDscount'
    Then the user receives status code of 200
    And reduced products are successfully retrieved with price label of percentage discount 
    
  Scenario: Get List of Reduced Products with reduction in was, then, now label
    When a user makes a call to get list of reduced products with query parameter labelType as 'ShowWasThenNow'
    Then the user receives status code of 200
    And reduced products are successfully retrieved with price label as Show Was Then     