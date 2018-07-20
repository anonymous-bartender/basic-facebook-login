Scenario: Verify that user can add a review successfully.
    Background: User log into the system
        Given user load xxx in browser
        When click on login button
        And user provide login credential
        Then User is logged in successfully

    Given user navigate to page xxx
    When user add 5 stars
    And user select Health in dropdown category
    And user add following note in review
    And click submit
    Then review is added successfully into the system.