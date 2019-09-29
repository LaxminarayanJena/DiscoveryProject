package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DiscoveryTVShowsPageLocators {

	
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Shows')]")
	public static WebElement Shows;
	
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'See All Shows')]")
	public static WebElement SeeAllShows;
	
}
