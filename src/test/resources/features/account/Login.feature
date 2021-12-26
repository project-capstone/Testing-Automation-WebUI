@login
Feature: Login Functionality
  As a user
  I want to be able to Login in barengin.site
  So that I am success Login


  Scenario: I am login with valid email and password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am enter valid password "wahyu123"
    And I am click button SignIn
    Then I am success login
    And Show success message "Login Success"


  Scenario: I am login with invalid email and valid password
    Given I am open login page in barengin
    When I am enter invalid email "nusantarawahyu@gmail.com"
    And I am enter valid password "wahyu123"
    And I am click button SignIn
    Then I am failed login
    And Show failed message "Email or Password Incorrect"


  Scenario: I am login with valid email and invalid password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am enter invalid password "bukanpassword98"
    And I am click button SignIn
    Then I am failed login
    And Show failed message "Email or Password Incorrect"


  Scenario: I am login with invalid email and invalid password
    Given I am open login page in barengin
    When I am enter invalid email "nusantarawahyu@gmail.com"
    And I am enter invalid password "bukanpassword98"
    And I am click button SignIn
    Then I am failed login
    And Show failed message "Email or Password Incorrect"


  Scenario: I am login with empty email and valid password
    Given I am open login page in barengin
    When I am left email field blank
    And I am enter valid password "wahyu123"
    And I am click button SignIn
    Then I am failed login
    And Show error message in field email "cannot be blank!"


  Scenario: I am login with valid email and empty password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am left password field blank
    And I am click button SignIn
    Then I am failed login
    And Show error message in field password "cannot be blank!"


  Scenario: I am login with empty email and empty password
    Given I am open login page in barengin
    When I am left email field blank
    And I am left password field blank
    And I am click button SignIn
    Then I am failed login
    And Show error message in field email "cannot be blank!"
    And Show error message in field password "cannot be blank!"


  Scenario Outline: I am login with invalid format email and valid password
    Given I am open login page in barengin
    When I am enter invalid email "<email>"
    And I am enter valid password "wahyu123"
    And I am click button SignIn
    Then I am failed login
    And Show error message in field email "email is not valid!"
    Examples:
      | email                     |
      | wahyunusantara48gmail.com |
      | wahyunusantara48@gmailcom |
      | wahyunusantara48gmailcom  |
      | @gmail.com                |


  Scenario Outline: I am login with valid email and invalid format password
    Given I am open login page in barengin
    When I am enter valid email "wahyu@gmail.com"
    And I am enter invalid password "<password>"
    And I am click button SignIn
    Then I am failed login
    And Show error message in field password "password is too short!"
    Examples:
      | password |
      | p        |
      | Pa       |
      | pas      |
      | Pass     |
      | passs    |


  Scenario Outline: I am login with invalid format email and password
    Given I am open login page in barengin
    When I am enter invalid email "<email>"
    And I am enter invalid password "<password>"
    And I am click button SignIn
    Then I am failed login
    And Show error message in field email "email is not valid!"
    And Show error message in field password "password is too short!"

    Examples:
      | email                     | password |
      | wahyunusantara48gmail.com | p        |
      | wahyunusantara48@gmailcom | pa       |
      | wahyunusantara48gmailcom  | Pas      |
      | @gmail.com                | Poss     |
      | wahyunusantara48gmail.com | PA$SS    |

  Scenario: I didn't log in by clicking the cancel button
    Given I am open login page in barengin
    When I am click button cancel in login page
    Then I am success cancel

    #auto accept pop up ok
    #kalau double kata login