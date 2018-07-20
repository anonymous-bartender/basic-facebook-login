Feature: Verify the login feature in facebook



    Scenario: Add a post in facebook
    Given user load https://www.facebook.com in browser
    When user provide login credential
        | argha.bh@gmail.com     | Argha@2016    |
    And user add a new post
        | kahskdhkahhkahjkjdh asdadas   |
    Then post is successfully added