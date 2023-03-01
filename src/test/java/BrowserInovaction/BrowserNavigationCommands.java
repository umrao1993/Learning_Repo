package BrowserInovaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws InterruptedException  {

		// Set the path of browser driver 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

		// Topcasting/Upcasting - Object of chromedriver class with webdriver interface
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window 
		driver.manage().deleteAllCookies(); // delete all cookies
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // set a maximum timeout for searching out the WebElements before throwing an exception 

		// Invoking the browser with given URL
		driver.get("https://www.google.co.in");
		System.out.println("Page title is : " + driver.getTitle());

		Thread.sleep(2000);

		// Navigating the browser with following url
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Page title is after navigating to new URL: " + driver.getTitle());

		Thread.sleep(2000);

		// Navigating to the back page
		driver.navigate().back();
		System.out.println("Page title is after navigating to previous page URL: " + driver.getTitle());
		
		Thread.sleep(2000);
		
		
		
		
		driver.navigate().forward();
		System.out.println("Page title is after navigating forward to the URL: " + driver.getTitle());
		
		
		Thread.sleep(2000);
		
		// Refreshing the current page
		driver.navigate().refresh();
		System.out.println("Page Title After refreshing currect URL is: " + driver.getTitle());
				
		Thread.sleep(2000);

		// Closing the browser
		driver.quit();

	}
}
