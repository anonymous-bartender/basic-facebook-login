Feature: Verify the login feature in facebook



    Scenario: Add a post in facebook
    Given user load https://www.facebook.com in browser
    When user provide login credential
        | username  | password  |
        | guest     | gguest    |
    And user add a new post
        | post                                                          |
        | This is a sample post which I am adding in facebook.          |
    Then post is successfully added.


