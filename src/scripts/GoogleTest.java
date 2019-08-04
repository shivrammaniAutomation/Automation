package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static WebDriver driver;

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
	
			System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
			 driver = new ChromeDriver();
			 driver.get("https://www.google.co.in");
			 System.out.println("The website google has been opened");
			 driver.findElement(By.name("q")).sendKeys("Automation");
			 driver.findElement(By.name("btnK")).click();
			 System.out.println("Test completed");
			
			
	

	}

}
