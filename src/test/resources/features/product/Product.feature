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
    When I am enter product name "Nord VPN"
    And I am enter detail product "NordVPN adalah penyedia layanan jaringan pribadi virtual."
    And I am enter limit 2 orang
    And I am enter price product 120000
    And I am upload image product "gambar/nordvpn.png"
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

  #TC_7 #admin ingin mengubah informasi produk yang diinginkan
  Scenario: admin want to update product
    Given I am login as admin
    When I am click menu product
    And I am choose product with click button more info
    And I am click icon button update product
    And I am enter product name "Disney+ Hotstar"
    And I am enter detail product "Disney+ Hotstar memudahkan Anda menemukan variety show, drama TV, animasi, dan film terpopuler!"
    And I am click button save changes
    And I am click button YES
    Then I am success update product
    And Show success message "Success Operation" for update product

  #TC_8 #admin ingin delete product
  Scenario: admin want to delete product
    Given I am login as admin
    When I am click menu product
    And I am choose product with click button more info
    And I am click button delete product
    And I am click button OK delete product
    Then I am success delete product
    And show success message "Success Operation" for delete product

  #TC_9 #customer ingin lihat group product dari sebuah product
  Scenario: customer want to see group product
    Given I am login as customer
    When I am click menu product
    And I am choose product with click button more info for get group product
    Then Show group product page

  #TC_10 #customer ingin lihat group product dari
  Scenario: customer want to add new group product
    Given I am login as customer
    When I am click menu product
    And I am choose product with click button more info for create group product
    And I am click button create new group
    Then I am success create group product
    And Show success message "success add group product" for create new group

  @test #TC_11 #customer ingin menambahkan grup product ketika ada grup product yang belum full
  Scenario: customer adds a new group product but there are incomplete group products
    Given I am login as customer
    When I am click menu product to Product
    Then I am click button create new group is disable

  #TC_12 #user tidak login namun ingin menambahkan group product
  Scenario: visitor adds a new group product but there are incomplete group products
    Given I am not login
    When I am click menu product to Product
    Then I am click button create new group is disable













