@registration
Feature: Registration Functionality
  As a visitor
  I want to be able to registration in barengin
  So that I have account in barengin and to be a user

  @TC_1 #Success sudah dirun ada di report
  Scenario: I am registration by filling in the required fields with valid data
    Given I am open registration page in barengin
    When I am enter valid name "pengguna1" in signup page
    And I am enter valid email "pengguna1@gmail.com" in signup page
    And I am enter valid password "pengguna1" in signup page
    And I am enter valid phone "6287600189437" in signup page
    And I am click button SignUp in signup page
    Then I am success registration
    And Show success registration message "succes register"

  @TC_2 #Failed sudah dirun ada di report
  Scenario: I am registration with invalid name using symbols
    Given I am open registration page in barengin
    When I am enter invalid name "@pengguna2" in signup page
    And I am enter valid email "pengguna2@gmail.com" in signup page
    And I am enter valid password "pengguna2" in signup page
    And I am enter valid phone "6287654894373" in signup page
    And I am click button SignUp in signup page
    Then I am failed registration
    And Show error registration message "Name can only contains alphanumeric"

  @TC_3 #Failed sudah dirun ada di report
  Scenario Outline: I am registration with invalid emails
    Given I am open registration page in barengin
    When I am enter valid name "pengguna3" in signup page
    And I am enter invalid email "<email>" in signup page
    And I am enter valid password "pengguna3" in signup page
    And I am enter valid phone "6287654845356" in signup page
    And I am click button SignUp in signup page
    Then I am failed registration
    And Show error registration message in field email "email is not valid!"
    Examples:
      | email              |
      | pengguna3gmail.com |
      | pengguna3@gmailcom |
      | pengguna3gmailcom  |
      | @gmail.com         |

  @TC_4 #Failed sudah dirun ada di report
  Scenario: I am registration with invalid password
    Given I am open registration page in barengin
    When I am enter valid name "@pengguna4" in signup page
    And I am enter valid email "pengguna4@gmail.com" in signup page
    And I am enter invalid password "12345" in signup page
    And I am enter valid phone "6287654867373" in signup page
    And I am click button SignUp in signup page
    Then I am failed registration
    And Show error registration message in field password "password is too short!"

  @TC_5 #Failed sudah dirun ada di report
  Scenario: I leave all data blank
    Given I am open registration page in barengin
    When I am left name field blank in signup page
    And I am left email field blank in signup page
    And I am left password field blank in signup page
    And I am left phone field blank in signup page
    And I am click button SignUp in signup page
    Then I am failed registration
    And Show error registration message empty name "cannot be blank!"
    And Show error registration message empty email "cannot be blank!"
    And Show error registration message empty password "cannot be blank!"
    And Show error registration message empty phone "cannot be blank!"

  @TC_6
  Scenario: I didn't register by clicking the cancel button
    Given I am open registration page in barengin
    When I am click button cancel in registration page
    Then I am success cancel

  @TC_7
  Scenario: I'm on the registration page but want to login
    Given I am open registration page in barengin
    When I am click text button Sign In
    Then I am redirected to login page
    #FUNGSI TEXT BUTTON SIGN IN