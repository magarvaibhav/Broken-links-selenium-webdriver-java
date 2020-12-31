package test;

import java.util.List;

import steps.BrokenLink;
import steps.WebDriverMethods;

public class BrokenLinkHandler{

	public static void main(String[] args) 
	{
		BrokenLink objBrokenLink=new BrokenLink();
		WebDriverMethods objWebDriverMethods=new WebDriverMethods();
		objWebDriverMethods.launchChromeBrowser();
		List<String> links=objBrokenLink.getAllLinkFromPage();
		objBrokenLink.displayBrokenAndUnbrokenLink(links);
		objWebDriverMethods.closebrowser();
	}
}
