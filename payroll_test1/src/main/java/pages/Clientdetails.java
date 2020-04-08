package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Clientdetails {
	WebDriver driver;
	public Clientdetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[href='/payrollapp/client/index']")
	static WebElement clientpage;
	
	public static String text()
	{
		String r =clientpage.getText();
		PageUtility.sleep(1000);
		return r;
	}

}
