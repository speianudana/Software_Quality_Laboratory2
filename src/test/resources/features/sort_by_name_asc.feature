Feature: Sort by name in ascending order

  Background: The user must be on men's clothes page
    Given Open Men's clothes page

  Scenario:Sort by name in ascending order
    When Select Sort By Name A-Z
    Then Products sorted by name A-Z