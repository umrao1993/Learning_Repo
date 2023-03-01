package xpath;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathithJnet {
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazone.in/");
		
	}
	@Test
	public void validateTitle()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.", actualTitle);
	}
	@After

	public void tearDown() 
	{
		driver.quit();
	}
}
