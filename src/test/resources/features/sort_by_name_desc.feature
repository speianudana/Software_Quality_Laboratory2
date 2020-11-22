Feature: Sort by name in descending order

  Background: The user must be on men's clothes page
    Given Open Men's clothes page

  Scenario:Sort by name in descending order
    When Select Sort By Name Z-A
    Then Products sorted by name Z-A