package rough;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static WebDriver driver;
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
		WebElement Element = driver.findElement(By.xpath("//*[contains(text(),'Popular Shows')]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;    			
        js.executeScript("arguments[0].scrollIntoView();", Element);
       
       
								
	WebElement rightarrow=driver.findElement(By.xpath("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//i[@class='icon-arrow-right']"));
	
	for(int i=1;i<50;i++)
	{
		if(isElementPresent("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//i[@class='icon-arrow-right']"))
		{
			driver.findElement(By.xpath("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//i[@class='icon-arrow-right']"));
			rightarrow.click();
		}
		else
		{
			System.out.println("no more popular shows ");
			break;
		}
	}
	
	
	driver.findElement(By.xpath("(//button[contains(text(),'Explore the Show')])[last()]")).click();
	
	driver.findElement(By.xpath("//button[@class='episodeList__showMoreButton']")).click();
	driver.findElement(By.xpath("//button[@class='episodeList__showMoreButton']")).click();
	
	
	List<WebElement> allTitles = driver.findElements(By.xpath("//p[@class='episodeTitle']"));	
	List<WebElement> TotalTime = driver.findElements(By.xpath("//p[@class='minutes']"));
	
	if(allTitles.size() == TotalTime.size())
	{
		Map<String, String> output= new LinkedHashMap<String, String>();
		
		for (int i = 0; i < allTitles.size(); i++) {
			output.put(allTitles.get(i).getText(), TotalTime.get(i).getText());
			
		}
		Set<Entry<String, String>> s=output.entrySet();
		
		for (Entry<String, String> entry : s) {
			System.out.println(entry.getKey()+ " duration is - "+entry.getValue());
			
		}
	}
	
	
	
	}

}
