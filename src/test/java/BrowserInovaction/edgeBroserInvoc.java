package BrowserInovaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeBroserInvoc {

	
	
/*	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.google.co.in");
	
	driver.close();
	}*/
	
public static void main(String[] args) {
		
		// Set the path of browser driver 
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/msedgedriver.exe");

		// Topcasting/Upcasting - Object of chromedriver class with webdriver interface
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // maximize browser window 
		driver.manage().deleteAllCookies(); // delete all cookies

		// entering url to open
		driver.get("https://www.google.co.in");
		
		System.out.println("The Current page title is -> " + driver.getTitle());

		// closing the current opened browser window
		driver.quit();
	}
	
}
