Feature: feature to test login

  Scenario Outline: test login with valid data
    Given user is on login page
    When user enter valid <username> and <password>
    And click on login button
    Then redirect to home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
