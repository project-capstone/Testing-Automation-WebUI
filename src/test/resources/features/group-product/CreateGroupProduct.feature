Feature: Create Group Product
  As a Customer
  I want to create group product in product
  So that i am success group product in product

  Scenario: customer want to see group product
    Given I am logged as customer
    When I am choose product with click button more info for get group product
    Then Show group product page

  # (+) customer ingin menambahkan group product
  Scenario: customer want to add new group product
    Given I am logged as customer
    And I am choose product with click button more info for create group product
    And I am click button create new group
    Then I am success create group product
    And Show success message "success add group product" for create new group

  # (-) customer ingin menambahkan group product ketika masih ada group product yang belum full
  Scenario: customer adds a new group product but there are incomplete group products
    Given I am logged as customer
    And I am choose product there are incomplete group product
    Then I am failed create group product
    And I am click button create new group is disable
