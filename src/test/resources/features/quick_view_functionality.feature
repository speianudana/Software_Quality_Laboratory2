Feature: Click on Quick View is directing to the correct product page

  Background: User is on men's clothing page
    Given Open Men's clothes page

  Scenario:
    When Scroll to men's clothes items area
    And Click on element "Quick View" button
    Then The correct product page is opened