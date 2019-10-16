@guestcheckout
Feature: Guest User Should Be Able To Checkout As Guest Successfully

  Scenario: Guest User Should Be Able To Checkout As Guest

    Given user is on homepage

    When user click on books
    And user clicks on add to card button
    And click on shopping cart button
    And click on checkout
    And click on checkout as guest
    And enter personal details
    And enter details of shipping address
    And click continue on shipping method
    And click on credit card and continue
    And enter details of  payment information
    And clicks on checkout confirmation
    Then user should see the message order has been placed successfully

