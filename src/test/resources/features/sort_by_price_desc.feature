Feature: Sort by price from Low to High

  Background: The user must be on men's clothes page
    Given Open Men's clothes page

  Scenario:
    When Select Sort By Price Low-High
    And Scroll to Men's clothes items area
    Then Products sorted by price Low-High