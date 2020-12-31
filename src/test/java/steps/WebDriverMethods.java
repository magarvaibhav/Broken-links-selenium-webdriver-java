package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Locators;

public class WebDriverMethods {
	
	public static WebDriver driver=null; 
	public Locators objLocators=new Locators();
	public String URL="https://phptravels.com/demo/";
	
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A714978\\github_workspace\\WebDriverMethods\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	public void closebrowser()
	{
		driver.quit();
	}
}
