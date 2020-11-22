Feature: Sort by price from Low to High

  Background: The user must be on men's clothes page
    Given Open Men's clothes page

  Scenario:Sort by price from Low to High
    When Select Sort By Price Low-High
    Then Products sorted by price Low-High