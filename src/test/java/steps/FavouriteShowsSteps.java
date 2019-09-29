package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DiscoveryAppoloPageActions;
import pages.actions.DiscoveryHomePageActions;
import pages.actions.DiscoveryMyVideosPageActions;
import pages.actions.DiscoveryTVShowsPageActions;
import utils.SeleniumDriver;

public class FavouriteShowsSteps {
	
	DiscoveryHomePageActions discoveryHomePageActions = new DiscoveryHomePageActions();
	DiscoveryAppoloPageActions discoveryAppoloPageActions = new DiscoveryAppoloPageActions();
	DiscoveryMyVideosPageActions discoveryMyVideosPageActions = new DiscoveryMyVideosPageActions();
	DiscoveryTVShowsPageActions discoveryTVShowsPageActions = new DiscoveryTVShowsPageActions();
	
	@Given("I am on the Home Page {string} of Discovery Website")
	public void i_am_on_the_Home_Page_of_Discovery_Website(String WebSiteUrl) {
		 SeleniumDriver.openPage(WebSiteUrl);
	}

	@When("I click on {string} tab")
	public void i_click_on_tab(String string) throws InterruptedException {
	  
		 discoveryHomePageActions.SeeAllShowsMenu();
	}

	@When("I click on {string} link")
	public void i_click_on_link(String string) {
	   
	}

	@When("select show as {string}")
	public void select_show_as(String show) throws InterruptedException {
		discoveryTVShowsPageActions.AppoloLinks(show);
	}

	@When("verify the favorites status")
	public void verify_the_favorites_status() throws InterruptedException {
		discoveryAppoloPageActions.VerifyFavoritesStatus();
	}

	@When("goto myVideos Page {string} of Discovery Website")
	public void goto_myVideos_Page_of_Discovery_Website(String MyVideosPageUrl) {
		 SeleniumDriver.openPage(MyVideosPageUrl);
	}


	@Then("I should see the favorite or unfavorite titles under “FAVORITE SHOWS”")
	public void i_should_see_the_favorite_or_unfavorite_titles_under_FAVORITE_SHOWS() throws InterruptedException {
		discoveryMyVideosPageActions.MyFavouriteShows();
	}



}
