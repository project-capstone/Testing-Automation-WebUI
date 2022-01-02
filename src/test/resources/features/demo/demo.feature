Feature: Demonstrasi Needed

  #Background:
    #Given I am open login page in barengin
    #And I am enter valid email "admin@admin.com"
    #And I am enter valid password "admin123"
    #And I am click button SignIn
    #Then I am success login
    #And Show success message "Login Success"

  @post # (+) admin berhasil menambahkan produk // feature create product
  Scenario: admin want to create new product
    #Given I am logged as admin
    When I am already in add new product page
      And I am enter in field product name "IQIYI"
      And I am enter in field detail product "IQIYI adalah layanan streaming online film anime dan drakor"
      And I am enter in field capacity 4 orang
      And I am enter in field price product 100000
      And I am upload a image product "gambar/iqiyi.jpg"
      And I am click button add products
    Then I am success add products
      And Show success message "Success Operation" for add new products

  @postfailed # (-) admin gagal menambahkan produk // feature create product
  Scenario: admin want to post new product without fill any data
    Given I am logged as admin
    When I am already in add new product page
      And I am click button add products
    Then I am failed add products
      And Show error message in field price detail "cannot be blank!"
      And Show error message in field product picture "cannot be blank!"
      And Show error message in field product name "cannot be blank!"
      And Show error message in field product detail "cannot be blank!"
    And Show error message in field limit "cannot be blank!"

  @update # (+) admin ingin update produk yang diinginkan // feature update product
  Scenario: admin want to update product
    Given I am logged as admin
    When I am click button more info the product for update product
      And I am click icon button update product
      #And I am enter in field product name "Tiktok" for update
      #And I am enter in field detail product "Netflix adalah layanan streaming online berbayar" for update
      And I am enter in field capacity 2 orang for update
      #And I am enter in field price product 100000 for update
      #And I am upload a image product "gambar/tiktok.png" for update
      And I am click button save changes
      And I am click button YES
    Then I am success update product
      And Show success message "Success Operation" for update product

  @delete # (+) admin ingin menghapus produk // feature delete product
  Scenario: admin want to delete product
    When I am click button more info on product unexist group product
    And I am click button delete product
    And I am click button OK delete product
    Then I am success delete product
    And show success message "Success Operation" for delete product