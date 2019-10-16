@emailafriend
  Feature: Register User Should be able to refer product to friend

    Scenario: Register user should be able to refer a product to friend

      Given user is on homepage

      When user enters all compulsory details

      And user should get message registered successfully

      And click on noppcommerecelogo

      And click on applemacbook product

      And click on emailfriend

      And enter all details to email friend

      Then user is able to refer product to friend
