package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiSearch {

	public static WebDriver driver;
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.wikipedia.org");
		 System.out.println("The website has been opened");
		
		
	}

}
