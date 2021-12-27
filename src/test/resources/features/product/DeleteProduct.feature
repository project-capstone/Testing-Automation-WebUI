Feature: Delete Product
  as a admin
  i want to delete product
  so that i am success delete product

  #TC_3 (+) admin ingin menghapus produk
  Scenario: admin want to delete product
    Given I am logged as admin
    When I am click button more info on product unexist group product
      And I am click button delete product
      And I am click button OK delete product
    Then I am success delete product
      And show success message "Success Operation" for delete product

  #TC_2 (-) admin ingin menghapus produk namun ada group product
  Scenario: admin want to delete product when group product exist
    Given I am logged as admin
    When I am click button more info the product for delete product
      And I am click button delete product
      And I am click button OK delete product
    Then I am success delete product
      And show failed message "Access is denied ID data is in the group product" for delete product


