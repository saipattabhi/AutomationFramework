package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	private  WebElement emailAdressField;
	
public WebElement emailAdressField()
{
return emailAdressField;	
}
@FindBy(id="input-password")
  private WebElement passwordField;

public WebElement passwordField() {
	return passwordField;
}

@FindBy(css="input[value='Login']")
 private  WebElement loginButton;

public WebElement loginButton()
{
	return loginButton;
}


}
