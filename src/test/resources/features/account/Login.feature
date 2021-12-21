@login
Feature: Login Functionality
  As a user
  I want to be able to Login in barengin.site
  So that I am success Login

  #Success TC_1 tanya validasi pesan action setelah login
  Scenario: I am login with valid email and password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am enter valid password "wahyu123"
    And I am click button SignIn
    Then I am success login

  #Failed TC_2
  Scenario Outline: I am login with invalid email and valid password
    Given I am open login page in barengin
    When I am enter invalid email "<email>"
    And I am enter valid password "user123"
    And I am click button SignIn
    Then I am failed login
    Examples:
      | email                     |
      | wahyunusantara48gmail.com |
      | wahyunusantara48@gmailcom |
      | wahyunusantara48gmailcom  |
      | @gmail.com                |

  #failed TC_3
  Scenario Outline: I am login with valid email and invalid password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am enter invalid password "<password>"
    And I am click button SignIn
    Then I am failed login
    Examples:
      | password   |
      | password   |
      | password98 |
      | Pas98      |
      | Password   |
      | PASSWORD   |

  #failed TC_4
  Scenario Outline: I am login with invalid email and invalid password
    Given I am open login page in barengin
    When I am enter invalid email "<email>"
    And I am enter invalid password "<password>"
    And I am click button SignIn
    Then I am failed login
    Examples:
      | email                     | password   |
      | wahyunusantara48gmail.com | password   |
      | wahyunusantara48@gmailcom | password98 |
      | wahyunusantara48gmailcom  | Pas98      |
      | @gmail.com                | Password   |
      | whyf@gmadi.fdsa           | PASSWORD   |

  #failed TC_5 contoh tanya ini validasi alert in field
  Scenario: I am login with empty email and valid password
    Given I am open login page in barengin
    When I am left email field blank
    And I am enter valid password "user123"
    And I am click button SignIn
    Then I am failed login
    And Show error message field email cannot be blank

  #Success TC_6 contoh tanya ini validasi alert in field
  Scenario: I am login with valid email and empty password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am left password field blank
    And I am click button SignIn
    Then I am failed login

  #Success TC_7 contoh tanya ini validasi alert in field
  Scenario: I am login with empty email and empty password
    Given I am open login page in barengin
    When I am left email field blank
    And I am left password field blank
    And I am click button SignIn
    Then I am failed login