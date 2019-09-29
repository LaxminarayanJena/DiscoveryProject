package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DiscoveryMyVideosPageLocators;
import utils.SeleniumDriver;

public class DiscoveryMyVideosPageActions {

	DiscoveryMyVideosPageLocators discoveryMyvideosPageLocators = null;

	public DiscoveryMyVideosPageActions() {
		this.discoveryMyvideosPageLocators = new DiscoveryMyVideosPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), discoveryMyvideosPageLocators);

	}

	public void MyFavouriteShows() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,450)");

		List<WebElement> MyVideoLinks = SeleniumDriver.getDriver().findElements(By.tagName("a"));
		for (WebElement link : MyVideoLinks) {

			if ((link.getAttribute("href")).contains("apollo")) {
				System.out.println("Favourites title under favourite shows” -" + (link.getAttribute("href")));
				break;
			}

		}

	}

}
