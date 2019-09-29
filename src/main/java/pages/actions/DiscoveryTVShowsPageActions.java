package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DiscoveryTVShowsPageLocators;
import utils.SeleniumDriver;

public class DiscoveryTVShowsPageActions {

	DiscoveryTVShowsPageLocators discoveryTVShowsPageLocators = null;

	public DiscoveryTVShowsPageActions() {
		this.discoveryTVShowsPageLocators = new DiscoveryTVShowsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), discoveryTVShowsPageLocators);

	}

	public void AppoloLinks(String show) throws InterruptedException {
		Thread.sleep(4000);
		List<WebElement> allLinks = SeleniumDriver.getDriver().findElements(By.tagName("a"));
		for (WebElement link : allLinks) {

			if ((link.getAttribute("href")).contains(show)) {

				System.out.println(("shows which contain-") + show + "-" + (link.getAttribute("href")));
				SeleniumDriver.getDriver().get(link.getAttribute("href"));
				break;
			}

		}
	}

}
