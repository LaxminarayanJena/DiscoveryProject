#Author: LaxmiNarayanJena
@FavoriteShows
Feature: To validate Favorite Shows feature is working

  @Favorite-Shows
  Scenario: Validate Favorite Shows Page
    Given I am on the Home Page "https://go.discovery.com/" of Discovery Website
    When I click on "Shows" tab
    And I click on "See All Shows" link
    And select show as "apollo"
    And verify the favorites status
    And goto myVideos Page "https://go.discovery.com/my-videos" of Discovery Website
    Then I should see the favorite or unfavorite titles under “FAVORITE SHOWS”
