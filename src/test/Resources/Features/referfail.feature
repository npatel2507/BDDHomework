@referfail
Feature: Unregisterd User should Not Able To Refer Product To A Friend

  Scenario: Unregisterd user should get error message when refer product to friend
    Given user is on homepage

    When user select the product
    And click on emailafriend
    And enter all details to email a friend
    Then user should get error message





