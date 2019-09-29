#Author: LaxmiNarayanJena
@AllShows
Feature: To validate and extract all  Showstitles and duration

  @All-Shows
  Scenario: Validate All shows List
    Given I navigate to the Home Page "https://go.discovery.com/" of Discovery Website
    When I scroll down till Popular shows
    And I go to the last video by pressing right icon
    And click on explore the show
    And click on show more
    And again click on show more
    Then I should able to extract all showtitles and duration
