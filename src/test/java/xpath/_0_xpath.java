package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _0_xpath{

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		driver.get("http://demo.automationtesting.in/Register.html");
		

		
		WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		if (firstNameTextBox.isDisplayed()) 
		{
			
			firstNameTextBox.sendKeys("Tom");
		}
		else 
		{
			System.out.println("WebElement with name firstNameTextBox is not found");
		}

		
		WebElement genderMaleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
		
		if (genderMaleRadioButton.isEnabled()) 
		{
			genderMaleRadioButton.click();
		}
		else 
		{
			System.out.println("WebElement with name genderMaleRadioButton is not found");
		}

		
		Thread.sleep(4000);
		
		
		driver.quit();
		
		
	}

}