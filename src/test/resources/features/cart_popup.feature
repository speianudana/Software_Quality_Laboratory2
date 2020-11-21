Feature: Cart Pop-Up is displayed correctly

  Background: User is on men's clothing page
    Given Open Men's clothes page


  Scenario: Test if cart pop-up is not overlapped by New label
    When Scroll to products area
    And Click on element ADD TO CART button
    Then Delete button is clickable
