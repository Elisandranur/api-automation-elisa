Feature: User Data
  As an admin
  I want to see list of data user
  So that I can create new data user

  Scenario: GET ALL data user
    Given set the GET ALL user data endpoint
    When send the HTTP Request GET ALL user
    Then i got verify code 200
    And I try to check content of get all by id 1