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
    Given I am on the main page
    When I click on twitter icon
    Then twitter page is opened

  Scenario: Read Frequently Asked Questions
    Given I am on the main page
    When I click on the Question button
    Then The maine page scroll down to Frequently Asked Questions
    And I click on the How much does cost to attend? Question
    Then The answer appear below the question

  Scenario: Read Frequently Asked Question
    Given I am on the main page
    When I click on the Question button
    Then The maine page scroll down to Frequently Asked Questions
    And I click on the Where is your institution located? Question
    Then The answer appear below the question

  Scenario: Read Frequently Asked Questio
    Given I am on the main page
    When I click on the Question button
    Then The maine page scroll down to Frequently Asked Questions
    And I click on the What do I need to know before hand? Question
    Then The answer appear below the question


  Scenario: Read  Asked Question
    Given I am on the main page
    When I click on the Question button
    Then The maine page scroll down to Frequently Asked Questions
    And I click on the How do I signed up? Question
    Then The answer appear below the question

  Scenario: Read  Asked Questio
    Given I am on the main page
    When I click on the Question button
    Then The maine page scroll down to Frequently Asked Questions
    And I click on the Will your organisation help me find a job Question? Question
    Then The answer appear below the question

  Scenario: click on facebook's page of John Doe
    Given I am on the main page
    When I click on facebook icon
    Then facebook page is opened



