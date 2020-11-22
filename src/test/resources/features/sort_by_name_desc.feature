Feature: Sort by name in ascending order

  Background: The user must be on men's clothes page
    Given Open Men's clothes page

  Scenario:
    When Select Sort By Name A-Z
    And Scroll to Men's clothes items area
    Then Products sorted by name A-Z