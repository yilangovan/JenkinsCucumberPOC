Feature: Printing full name of the user by getting first and last name as input

  Scenario Outline: User enters firstname and lastname to print the full name
    Given User enters first and last name
    When user enters firstname <first> and lastname <last>
    Then system prints fullname <full>

    @Regression
    Examples: 
      | first     | last        | full                |
      | "Agile" | "Trailblazers" | "Agile Trailblazers" |
