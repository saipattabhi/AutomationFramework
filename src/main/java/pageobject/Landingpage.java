package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	public Landingpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	}
 
@FindBy(xpath="//a[@title='My Account']")
private	WebElement myAccountDropdown;
	
	
	public WebElement myAccountDropdown()
	{
		return myAccountDropdown;
	}
	@FindBy(linkText="Login")
private	WebElement loginoption;
	
	public WebElement loginoption()
	{
		return loginoption;
	}
	
	
}