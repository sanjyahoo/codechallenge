package org.chl.testcases;

import org.testng.annotations.Test;
import org.chl.base.CreateDriver;
import org.chl.pages.LandingPage;


public class Landing_page_test extends CreateDriver{

	@Test
	public void tc001()
	{
		LandingPage land = new LandingPage(driver);
		land.click_london("london");
		land.click_search();
	}
}
