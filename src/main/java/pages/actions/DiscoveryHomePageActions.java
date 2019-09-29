package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DiscoveryHomePageLocators;
import utils.SeleniumDriver;

public class DiscoveryHomePageActions {

	DiscoveryHomePageLocators discoveryHomePageLocators = null;
	JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();

	public DiscoveryHomePageActions() {
		this.discoveryHomePageLocators = new DiscoveryHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), discoveryHomePageLocators);

	}

	public DiscoveryTVShowsPageActions SeeAllShowsMenu() throws InterruptedException {
		DiscoveryHomePageLocators.Shows.click();

		js.executeScript("arguments[0].scrollIntoView();", DiscoveryHomePageLocators.SeeAllShows);
		Thread.sleep(2500);
		DiscoveryHomePageLocators.SeeAllShows.click();
		return new DiscoveryTVShowsPageActions();
	}

	public void PopularShows() throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView();", DiscoveryHomePageLocators.PopularShows);

	}

	public void RightIcon() {
		List<WebElement> CarouselDots = DiscoveryHomePageLocators.CarousalBlock.findElements(By.tagName("li"));

		for (int i = 0; i < CarouselDots.size(); i++) {
			if (SeleniumDriver.isElementPresent(
					"//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//i[@class='icon-arrow-right']")) {
				DiscoveryHomePageLocators.RightArrow.click();
			} else {
				System.out.println("no more popular shows ");
				break;
			}
		}
	}

	public void ExploreShow() {
		DiscoveryHomePageLocators.LastShow.click();
	}

}
