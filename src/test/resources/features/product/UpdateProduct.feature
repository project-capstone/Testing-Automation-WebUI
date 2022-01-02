Feature: Update Product
  as a admin
  i want to update information product
  so that iam success update

  @test #TC_7 #admin ingin update produk yang diinginkan
  Scenario: admin want to update product
    Given I am logged as admin
    When I am click button more info the product for update product
    And I am click icon button update product
      #And I am enter in field product name "Netflix" for update
      #And I am enter in field detail product "Netflix adalah layanan streaming online berbayar" for update
      And I am enter in field capacity 2 orang for update
      #And I am enter in field price product 100000 for update
      #And I am upload a image product "gambar/tiktok.png" for update
      And I am click button save changes
      And I am click button YES
    Then I am success update product
      And Show success message "Success Operation" for update product

