@register
Feature: User should be able to register successfully

  Scenario: As a user i should be able to register successfully

    Given user is on homepage
    When user enters all required details
    Then user should be able to register successfully