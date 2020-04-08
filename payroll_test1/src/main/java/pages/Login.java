package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="loginform-username")
	WebElement name;
	@FindBy(id="loginform-password")
	WebElement pass;
	@FindBy(name="login-button")
	WebElement submit;
	public void login(String username,String password)
	{
		name.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
		PageUtility.sleep(5000);
		
		
	}
	
	
	

}
