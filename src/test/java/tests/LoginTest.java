package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.AccountPage;
import pageobject.Landingpage;
import pageobject.Loginpage;
import resources.base;

public class LoginTest extends base {
	
	public WebDriver driver;
	 public Logger log;
	
	@Test(dataProvider = "getLoginData")
	public void login(String email,String password,String expectedresult) throws IOException, Exception
	{
        

     Landingpage landingpage=new Landingpage(driver);
     landingpage.myAccountDropdown().click();
     log.debug("Clicked on myaccount dropdown");
     landingpage.loginoption().click();
     log.debug("Clicked on login option");
     Thread.sleep(3000);
     
     Loginpage loginpage=new Loginpage(driver);
     loginpage.emailAdressField().sendKeys(email);
   log.debug("Email adress got entered");
     loginpage.passwordField().sendKeys(password);
     log.debug("Password got entered");
     loginpage.loginButton().click();
     log.debug("Login button got entered");
    AccountPage accountPage=new AccountPage(driver);
   
    
    String actualresult=null;
    try {
    	if(accountPage.editAccountInformation().isDisplayed()) {
    		log.debug("Login test got passed");
    		actualresult="Sucessfull";
    	}
    	} catch(Exception e) {
    		log.debug("Login test got failed");
    	actualresult= "Failure";
    	}
    		
    Assert.assertEquals(expectedresult, actualresult);
   
 
	}
	@BeforeMethod
   public void openApplication() throws IOException
   {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver=  intializeDriver();
		
	log.debug("The browser got launched");
	     driver.get(prop.getProperty("url"));
	     log.debug("Navigated to application url");
   }
	
	@AfterMethod
	public void closure()
	{
		driver.close();
		log.debug("Browser got closed");
	}
	@DataProvider
	public Object getLoginData()
	{
		Object[][] data={{"saipattabhi18@gmail.com","sai@2255","Sucessfull"}};
		return data;
	}
 
}
