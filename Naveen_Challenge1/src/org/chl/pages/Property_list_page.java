package org.chl.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_list_page {

	ChromeDriver driver;
	public Property_list_page(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public void property_list()
	{
		
		List<WebElement> list = driver.findElementsByXPath("//a[@class='listing-results-price text-price']");	
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
	}
}

		