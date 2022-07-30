Feature: Main page
  These tests verify the functionality of the main page

  Scenario: Click on enrollment button
    Given I am on the main page
    When I click on enrollment button
    Then the page title should start with "software testing | enrollment"

  Scenario: Click on hybrid button
    Given I am on the main page
    When I click on hybrid button
    Then the page should start with "hybrid"

  Scenario: Click on In person button
    Given I am on the main page
    When  I click on In page button
    Then the page should start with "in person"

  Scenario: click on twitter's page of John Doe
    Given I'm on john Doe's page
    When I click on twitter icon
    Then twitter page is opened




