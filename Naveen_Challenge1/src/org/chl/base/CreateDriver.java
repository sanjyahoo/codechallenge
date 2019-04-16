package org.chl.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CreateDriver {

	
	public ChromeDriver driver;

	@BeforeSuite
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
}
