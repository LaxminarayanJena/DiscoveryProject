package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DiscoveryAppoloPageLocators;
import utils.SeleniumDriver;

public class DiscoveryAppoloPageActions {

	DiscoveryAppoloPageLocators discoveryAppoloPageLocators = null;

	public DiscoveryAppoloPageActions() {
		this.discoveryAppoloPageLocators = new DiscoveryAppoloPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), discoveryAppoloPageLocators);

	}

	public void VerifyFavoritesStatus() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("window.scrollBy(0,-750)");

		if (SeleniumDriver.isElementPresent("//i[contains(@class,'flipIconCore__icon icon-plus')]")) {
			System.out.println("Favorites  status is +");
		} else {
			System.out.println("Favorites  status is -");
		}

		DiscoveryAppoloPageLocators.FavouritesPlus.click();

	}

}
