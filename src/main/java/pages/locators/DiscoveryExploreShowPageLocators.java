package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DiscoveryExploreShowPageLocators {

	
	
	@FindBy(how=How.XPATH, using="//button[@class='episodeList__showMoreButton']")
	public static WebElement ShowMore;
	
	
	
	@FindBy(how=How.XPATH, using="//p[@class='episodeTitle']")
	public static List<WebElement> EpisodeTitle;
	
	
	@FindBy(how=How.XPATH, using="//p[@class='minutes']")
	public static List<WebElement> Minutes;
	
	
	
	
}
