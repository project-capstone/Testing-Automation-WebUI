Feature: Order Product
  As a customer
  I want to order product
  So that i am success order

  @test #TC_1 (+) customer ingin pesan di group product yang masih available
  Scenario: I want to order in product group available
    Given I am logged as customer
    When I am click button more info for order product
    And I am click button order group product available
    And I am enter valid phone number "082114161323"
    And I am click button order payment
    Then I am success order product
    And Show success message "Success Payment" for order product

  #TC_2 (-) customer ingin pesan di group product yang masih available
  Scenario: I want to order in product group available with fill invalid phone number
    Given I am logged as customer
    When I am click button more info for order product
    And I am click button order group product available
    And I am enter valid phone number "54645638768364"
    And I am click button order payment
    Then I am success order product
    And Show failed message "Invalid phone number!" for order product

