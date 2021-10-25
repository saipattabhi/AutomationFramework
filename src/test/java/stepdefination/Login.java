package stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AccountPage;
import pageobject.Landingpage;
import pageobject.Loginpage;
import resources.base;

public class Login extends base{
	
	WebDriver driver;
	Landingpage landingpage;
	Loginpage loginpage;
	 AccountPage accountPage;
    @Given("^Open any Browser$")
    public void open_any_browser() throws IOException  {
    	driver=  intializeDriver();
       
    }
    @And("^Navigate to Login page$")
    public void navigate_to_login_page() throws InterruptedException  {
    	 driver.get(prop.getProperty("url"));
    	 landingpage=new Landingpage(driver);
         landingpage.myAccountDropdown().click();
         landingpage.loginoption().click();
         Thread.sleep(3000);
        
        
    }

    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password)  {
        loginpage=new Loginpage(driver);
        loginpage.emailAdressField().sendKeys(email);
        loginpage.passwordField().sendKeys(password);
      
    	
    }

    @Then("^Verify user is able to successfully login$")
    public void verify_user_is_able_to_successfully_login()  {
    	
    	 accountPage=new AccountPage(driver);
     Assert.assertTrue(accountPage.editAccountInformation().isDisplayed());
    }

 

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button()  {
    	loginpage.loginButton().click();
        
    }
    
    
    @After
    public void closeBrowser()
    {
    	driver.close();
    }

}


