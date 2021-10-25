package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import resources.base;

public class TwoTest extends base{
	public WebDriver driver;
	@Test
	public void twoTest() throws IOException, InterruptedException
	{
		
		System.out.println("SaiPattbhi back to form");
		System.out.println("inside two test");
		
	 driver = intializeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		Assert.assertTrue(false);
		driver.close();
		
	}
@AfterMethod
public void closeBrowser()
{
	driver.close();
}
}
