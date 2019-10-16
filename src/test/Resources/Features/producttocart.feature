@addtocart
Feature: Registered User should Be Able To Buy Product Successfully

  Scenario:  Registered User should Be Able To Buy Product Successfully

    Given user is on homepage

    When user enter all compulsory details for registration
    And  user should get message about registered successfully
    And  clicks on noppcommerecelogo
    And  selects the product
    And click on add to card button
    And enter all details of shipping address
    And enter continue on shipping method
    And click on credit card
    And enter all payment information details
    And click on checkout confirmation
    Then user should see the order has been placed successfully