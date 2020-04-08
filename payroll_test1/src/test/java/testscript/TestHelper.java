package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestHelper 
{
	WebDriver driver;
	
  
  @BeforeMethod
	  public void beforeMethod()
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.qabible.in/payrollapp");
		driver.manage().window().maximize();
		}
  
		

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
