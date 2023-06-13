Feature: Test sign up functionaliy

  Background: 
    Given user is on OrangeHRM login page

  @TC_01
  Scenario: Check the login functionality with valid credentials
    And user enters username as "Admin" and password as "admin123"
    When user click on login button
    Then user is navigated to the home page

  @TC_2
  Scenario: Check the login functionality with valid username and invalid password
    And user enters username as "Admin" and password as "admin12"
    When user click on login button
    Then invalid credentials message should be displayed

  @TC_03
  Scenario: Check the login functionality with invalid username and valid password
    And user enters username as "Admii" and password as "admin123"
    When user click on login button
    Then invalid credentials message should be displayed

  @TC_04
  Scenario: Check the login functionality with invalid username and invalid password
    And user enters username as "Admins" and password as "admin1234"
    When user click on login button
    Then invalid credentials message should be displayed
