Feature: Cucumber can convert Gherkin data tables to a list of a type you specify.

  Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 15 |
      | 25 |
      | 70 |
    When I summarize them
    Then should I get 110
