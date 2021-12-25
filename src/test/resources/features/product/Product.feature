Feature: Product Functionality
  As a user
  I want to do activities related to the product
  So that i am success operation with product

  #TC_1 #admin ingin melihat product +
  Scenario: I want to see product list as admin
    Given I am login as admin
    When I am click menu product
    Then show product list

  #TC_2 #customer ingin melihat product +
  Scenario: I want to see product list as customer
    Given I am login as customer
    When I am click menu product
    Then show product list

  #TC_3 #admin ingin ke halaman add new product +
  Scenario: admin want to add new product page
    Given I am login as admin
    When I am click menu dropdown icon profile
    And I am click menu add product
    Then I am redirected to add new product page

  #TC_4 #customer ingin ke halaman add new product -
  Scenario: customer want to add new product page
    Given I am login as customer
    When I am click menu dropdown icon profile
    Then menu add product not exist

  #TC_5 #admin ingin menambahkan product baru #beloman bisa upload file
  Scenario: admin want to post new product
    Given I am login as admin
    And I am already in add new product page
    When I am enter product name "IQIYI"
    And I am enter detail product "aplikasi untuk nonton anime dan drama korea"
    And I am enter limit 2 orang
    And I am enter price product 1000
    And I am upload image product "gambar/iqiyi.jpg"
    And I am click button add product
    Then I am success add product
    And Show success message "Success Operation" for add new product

  #TC_6 #admin ingin menambahkan product tanpa mengisi data apapun
  Scenario: admin want to post new product without fill any data
    Given I am login as admin
    And I am already in add new product page
    When I am click button add product
    Then I am success add product
    And Show error message in field product name "cannot be blank!"
    And Show error message in field product detail "cannot be blank!"
    And Show error message in field limit "cannot be blank!"
    And Show error message in field price detail "cannot be blank!"
    And Show error message in field product picture "cannot be blank!"



    #And Show error message in field product name ""

  #TC_11 #admin ingin delte product
  Scenario: admin want to delete product
    Given I am login as admin
    When I am click menu product
    And I am choose product with click button more info
    And I am click button delete product
    And I am click button OK delete product
    Then I am success delete product
    And show success message "Success Operation" for delete product











