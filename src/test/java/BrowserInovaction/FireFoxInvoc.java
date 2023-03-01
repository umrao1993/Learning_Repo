package BrowserInovaction;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxInvoc {

	
	public static void main(String[] args) {

		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");

		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 

		
		driver.get("https://www.google.co.in");
		String pageTitle = driver.getTitle();

		
		if(pageTitle.equals("Google"))
		{
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
		}

		
		driver.quit();
		
	}
}
