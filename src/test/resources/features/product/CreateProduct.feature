Feature: Create Product
  as a admin
  i want to create a product
  so that i am success create product

  #TC_1 #admin ingin ke halaman add new product +
  Scenario: admin want to add new product page
    Given I am logged as admin
    When I am click menu dropdown icon profile
    And I am click menu add product
    Then I am redirected to add new product page

  #TC_2 #customer ingin ke halaman add new product -
  Scenario: customer want to add new product page
    Given I am logged as customer
    When I am click menu dropdown icon profile
    Then menu add product not exist

  @test #TC_3 #admin ingin menambahkan product baru
  Scenario: admin want to create new product
    Given I am logged as admin
      And I am already in add new product page
    When I am enter in field product name "IQIYI"
      And I am enter in field detail product "IQIYI adalah layanan streaming online film anime dan drakor"
      And I am enter in field capacity 2 orang
      And I am enter in field price product 100000
      And I am upload a image product "gambar/iqiyi.jpg"
      And I am click button add products
    Then I am success add products
      And Show success message "Success Operation" for add new products

  #TC_4 #admin ingin menambahkan product baru
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

    #kurang validasi create product isi capacity kurang dari 1
