Feature: Delete Group Product
  As a admin
  I want to delete group product
  So that i am success to delete group product

  #TC_1 (+) admin ingin delete group product
  Scenario: I want to delete group product
    Given I am logged as admin
    When I am click button more info the product for delete group product
    And I am click button delete
    And I am click button confirm delete
    Then I am success delete group product
    And Show success message "Success Operation" for delete group product

  @test #TC_2 (-) admin ingin delete group product yang sudah ada member
  Scenario: I want to delete group product on member exist
    Given I am logged as admin
    When I am click button more info the product for delete group product
    And I am click button delete group product on member exist
    And I am click button confirm delete
    Then I am success delete group product
    And Show failed message "Access is denied ID data is in the order" for delete group product