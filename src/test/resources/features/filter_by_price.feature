Feature: Filter By price is filtering correctly

  Background: User is on men's clothing page
    Given Open Men's clothes page


  Scenario: Test if the products are filtered correctly by price
    When Move slider
    Then Are displayed only filtered products