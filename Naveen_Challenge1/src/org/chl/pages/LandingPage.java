package org.chl.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage 
{
	ChromeDriver driver;
	public LandingPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_london(String s_term)
	{
		driver.findElementByXPath("//input[@id='search-input-location']").sendKeys(s_term);
	}
	
	public void click_search()
	{
		driver.findElementByXPath("//button[@id='search-submit']").click();
	}

	

}
