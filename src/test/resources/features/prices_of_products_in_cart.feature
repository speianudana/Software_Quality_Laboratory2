Feature: Price of the item cart corresponds with the price from the page

  Background: User is on men's clothing page
    Given Open Men's clothes page

  Scenario:Price of the item cart corresponds with the price from the page
    When Scroll to clothes items area
    And Click on element "Add to Cart" button
    Then The price from cart is equal with price item from the page
