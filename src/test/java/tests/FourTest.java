package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class FourTest extends base {
public	WebDriver driver;
	@Test
	public void fourTest() throws IOException, InterruptedException
	{
		
		System.out.println("Sai has updated code right now");
		System.out.println("inside test four");
	 driver = intializeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.close();
		
		System.out.println("Today is republic day");
		System.out.println("Today is wedesday");
	}

}
