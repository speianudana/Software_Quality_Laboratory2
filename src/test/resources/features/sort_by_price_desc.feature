Feature: Sort by price from High to Low

  Background: User must be on men's clothes page
    Given Open Men's clothes page

  Scenario:Sort by price from High to Low
    When Select Sort By Price High-Low
    Then Products sorted by price High-Low