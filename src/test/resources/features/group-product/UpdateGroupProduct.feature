Feature: Update Group Product
  As a admin
  I want send data account to member group product
  So that i success send data account

  #TC_1 (+) admin ingin kirim data account ke group product yang full
  Scenario: I want send data account to member group product
    Given I am logged as admin
    When I am click button more info the product for update group product
    And I am click button info
    And I am click icon button update group product
    And I am fill email "netflix@gmail.com"
    And I am fill password "netflix123"
    And I am click button update group product
    Then I am success update group product
    And Show message success "Success Operation" for update group product

  @test #TC_2 (-) admin ingin kirim data account ke group yang belum full
  Scenario: I want send data account to member group product but not full
    Given I am logged as admin
    When I am click button more info the products for update group product
    And I am clicks button info
    And I am clicks button icon button update group product
    Then I am failed update group product
    And Show message failed "can't update! status != Full" for update group product

