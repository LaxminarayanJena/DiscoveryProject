package pages.actions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DiscoveryExploreShowPageLocators;
import utils.SeleniumDriver;

public class DiscoveryExploreShowPageActions {

	DiscoveryExploreShowPageLocators discoveryExploreShowPageLocators = null;

	public DiscoveryExploreShowPageActions() {
		this.discoveryExploreShowPageLocators = new DiscoveryExploreShowPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), discoveryExploreShowPageLocators);

	}

	public void ShowMore() throws InterruptedException {
		DiscoveryExploreShowPageLocators.ShowMore.click();
		Thread.sleep(1500);
		DiscoveryExploreShowPageLocators.ShowMore.click();
	}

	public void PrintTitlesAndDuration() {

		List<WebElement> allTitles =DiscoveryExploreShowPageLocators.EpisodeTitle;
		List<WebElement> TotalTime = DiscoveryExploreShowPageLocators.Minutes;

		if (allTitles.size() == TotalTime.size()) {
			
			Map<String, String> output = new LinkedHashMap<String, String>();

			for (int i = 0; i < allTitles.size(); i++) {
				output.put(allTitles.get(i).getText(), TotalTime.get(i).getText());

			}
			Set<Entry<String, String>> s = output.entrySet();

			for (Entry<String, String> entry : s) {
				System.out.println(entry.getKey() + " duration is - " + entry.getValue());

			}
		}

	}

}
