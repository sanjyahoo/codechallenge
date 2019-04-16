package org.chl.testcases;

import org.testng.annotations.Test;
import org.chl.base.CreateDriver;
import org.chl.pages.Property_list_page;

public class Property_List_page_test extends CreateDriver{
	@Test
	public void tc001()
	{
		Property_list_page property = new Property_list_page(driver);
		property.property_list();
	}

}
