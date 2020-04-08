package testscript;

import org.testng.annotations.Test;

import pages.Clientdetails;
import pages.Homepage;
import pages.Login;

import java.io.IOException;

import org.testng.Assert;

public class RegressionTest extends TestHelper {
  @Test
  public void logintest()throws IOException
  {
	  Login obj= new Login(driver);
	  obj.login("carol", "1q2w3e4r");
  }
  @Test
  public void clientpage()
  {
	  Login obj= new Login(driver);
	  obj.login("carol", "1q2w3e4r");
	  Homepage ob =new Homepage(driver);
	  ob.click();
	  
	  Clientdetails ob1 =new Clientdetails(driver);
	  ob1.text();
	  Assert.assertEquals(Clientdetails.text(), "CLient");
	  System.out.println("client page loaded");
	  
	  
	  
  }
}