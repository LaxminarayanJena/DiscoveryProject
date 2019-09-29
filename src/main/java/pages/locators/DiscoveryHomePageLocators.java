package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DiscoveryHomePageLocators {

	
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Shows')]")
	public static WebElement Shows;
	
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'See All Shows')]")
	public static WebElement SeeAllShows;
	
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'Popular Shows')]")
	public static WebElement PopularShows;
	
	
	@FindBy(how=How.XPATH, using="//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//i[@class='icon-arrow-right']")
	public static WebElement RightArrow;
	
	
	@FindBy(how=How.XPATH, using="(//button[contains(text(),'Explore the Show')])[last()]")
	public static WebElement LastShow;
	
	@FindBy(how=How.XPATH, using="//ul[@class='popularShowsCarousel__dotsPager']")
	public static WebElement CarousalBlock;
	
	
	
	
}
