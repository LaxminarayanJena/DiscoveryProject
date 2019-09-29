package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	static WebDriver driver;
	public static boolean isElementPresent(String xpath1)
	{
		try {
			driver.findElement(By.xpath(xpath1));
			return true;
			
		} catch (Exception e) {
			return false;	
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://go.discovery.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Shows')]")).click();
		
		WebElement Element = driver.findElement(By.xpath("//*[contains(text(),'See All Shows')]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;    			
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2500);
        Element.click();
        
        Thread.sleep(4000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));	
		for(WebElement link:allLinks){
			
			if((link.getAttribute("href")).contains("apollo"))
					{
				System.out.println("shows which contain “APOLLO” -"+ (link.getAttribute("href")));
				driver.get(link.getAttribute("href"));
				break;
					}
								
		}
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-750)");
		
		
		if(isElementPresent("//i[contains(@class,'flipIconCore__icon icon-minus')]"))
		{
			System.out.println("Favorites  status is -");
		}
		else 
			{
				System.out.println("Favorites  status is +");
			}
		
		driver.findElement(By.xpath("//i[contains(@class,'flipIconCore__icon icon-plus')]")).click();
		driver.get("https://go.discovery.com/my-videos");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,450)");
		
		List<WebElement> MyVideoLinks = driver.findElements(By.tagName("a"));
         for(WebElement link:MyVideoLinks){
        			
			if((link.getAttribute("href")).contains("apollo"))
					{
				System.out.println("Favourites title under favourite shows” -"+ (link.getAttribute("href")));				
				break;
					}
								
		}

	}

}
