package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DiscoveryAppoloPageLocators {

	
	
	@FindBy(how=How.XPATH, using="//i[contains(@class,'flipIconCore__icon icon-minus')]")
	public static WebElement FavouritesMinus;
	
	@FindBy(how=How.XPATH, using="//i[contains(@class,'flipIconCore__icon icon-plus')]")
	public static WebElement FavouritesPlus;
	
	
}
