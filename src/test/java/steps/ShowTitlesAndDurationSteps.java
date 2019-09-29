package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DiscoveryExploreShowPageActions;
import pages.actions.DiscoveryHomePageActions;
import utils.SeleniumDriver;

public class ShowTitlesAndDurationSteps {
	
	DiscoveryHomePageActions discoveryHomePageActions = new DiscoveryHomePageActions();
	DiscoveryExploreShowPageActions discoveryExploreShowsPageActions = new DiscoveryExploreShowPageActions();


	@Given("I navigate to the Home Page {string} of Discovery Website")
	public void i_navigate_to_the_Home_Page_of_Discovery_Website(String WebSiteUrl) {
		 SeleniumDriver.openPage(WebSiteUrl);
	}

	@When("I scroll down till Popular shows")
	public void i_scroll_down_till_Popular_shows() throws InterruptedException {
		discoveryHomePageActions.PopularShows();
		
		
	}

	@When("I go to the last video by pressing right icon")
	public void i_go_to_the_last_video_by_pressing_right_icon() {
		discoveryHomePageActions.RightIcon();
	}

	@When("click on explore the show")
	public void click_on_explore_the_show() {
		discoveryHomePageActions.ExploreShow();
	}

	@When("click on show more")
	public void click_on_show_more() throws InterruptedException {
	    
		discoveryExploreShowsPageActions.ShowMore();
	}

	@When("again click on show more")
	public void again_click_on_show_more() {
	   
	}

	@Then("I should able to extract all showtitles and duration")
	public void i_should_able_to_extract_all_showtitles_and_duration() {
		discoveryExploreShowsPageActions.PrintTitlesAndDuration();
	}



	

}
