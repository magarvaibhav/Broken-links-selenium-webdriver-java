package steps;

import java.net.*;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLink extends WebDriverMethods {

	List<String> links=null;
	HttpURLConnection huc;
	
	public List<String> getAllLinkFromPage() {
		links=new ArrayList<String>();
		System.out.println(driver);
		List<WebElement> allLink=driver.findElements(By.xpath("//a"));
		System.out.println("Total Links "+allLink.size());
		for(WebElement element:allLink)
		{
			String url=element.getAttribute("href");
			  if(url == null || url.isEmpty())
			  {
				  System.out.println("URL is null or Empty");
				  continue;  
			  }
			  else
			  {
					links.add(url);
			  }
		}
		return links;
	}

	public void displayBrokenAndUnbrokenLink(List<String> links) {
		int counter=0;
		for(String url:links)
		{
			try
			{
				 counter++;
				 huc = (HttpURLConnection)(new URL(url).openConnection());
	             huc.setRequestMethod("HEAD");  
	             huc.connect();            
	             int respCode = huc.getResponseCode();   
	             if(respCode >= 400)
	             {
	                 System.out.println(counter+" :"+url+" : is a broken link");
	             }
	             else
	             {
	                 System.out.println(counter+" :"+url+" : is a valid link");
	             }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
