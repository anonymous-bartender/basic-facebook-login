Feature: Verify the login feature in facebook

        Scenario: Add a post in facebook
            Given user load xxx in browser
            When user provide login credential
                | username  | password  |
                | guest     | gguest    |
            And user add a new post
            ""
            This is a sample post which I am adding in facebook. have a nice day.
            ""
            Then post is successfully added.


