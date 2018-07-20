Feature: Verify the login feature in facebook



    Scenario: Add a post in facebook
    Given user load https://www.facebook.com in browser
    When user provide login credential
        | guest	| guest	|
    And user add a new post
        | kahskdhkahhkahjkjdh asdadas   |
    Then post is successfully added
