Feature: Getting first and last name to print the full name

  Scenario Outline: User enters firstname and lastname to get the full name
    Given User enters first and last name
    When user enters firstname <first> and lastname <last>
    Then system prints fullname <full>

    @Regression
    Examples: 
      | first     | last        | full                |
      | "Bob" | "Anderson" | "Bob Anderson" |
