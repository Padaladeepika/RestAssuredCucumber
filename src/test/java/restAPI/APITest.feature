Feature: Perform the CRUD Operations

  Scenario: To Perform the GET Operation on Employee DB
    Given The base URI is "http://localhost:3000/employees"
    When I Perform the Get Operation
    Then Response code should be 200
