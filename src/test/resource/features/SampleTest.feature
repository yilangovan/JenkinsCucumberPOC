Feature: Cucumber can convert Gherkin data tables to a list of a type you specify.

  Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 15 |
      | 25 |
      | 60 |
    When I summarize them
    Then should I get 100
