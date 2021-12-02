@Feature
Feature: Subscription Prompt feature
  As a user, I want to veridy that subscription prompt appears and disappear from the page

  @promptAppearTest
  Scenario: Verify the Subscription prompt appears on the page on 
    Given user go to South China Sea article page on AFR site
    When user scroll at the bottom of the page
    Then the subscription prompt appears at the page
    
  @promptDisappearTest
  Scenario Outline: Verify the Subscription prompt disappears on the page
    Given user go to South China Sea article page on AFR site
    And user scroll at the bottom of the page
    Then verify that the subscription prompt disappears on the page after 10 seconds
     