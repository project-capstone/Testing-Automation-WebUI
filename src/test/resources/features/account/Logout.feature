Feature: Logout Functionality
  As a user
  I want to do activities related to the product
  So that i am success operation with product

  #TC_1 # (+) admin ingin melihat product
  Scenario: I want to log out as admin
    Given I am logged as admin
    When I am click menu dropdown account
    And I am click button logout
    Then I am success logout

  #TC_2 # (-) customer ingin melihat product
  Scenario: I want to log out as customer
    Given I am logged as customer
    When I am click menu dropdown account
    And I am click button logout
    Then I am success logout















