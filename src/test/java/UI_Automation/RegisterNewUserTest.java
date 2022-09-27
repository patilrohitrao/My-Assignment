package UI_Automation;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import BaseClass.BaseClass;
import PageClasses.RegisterNewUser;

public class RegisterNewUserTest extends BaseClass {

	@Test
	@Parameters("URL")
	public void loginTest(String url) throws InterruptedException {
		
		driver.get(url);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
		RegisterNewUser us=new RegisterNewUser(driver);
		us.personalDetails("Rohit","Patil","rohit1234@gmail.com","A/p:Kavathe-ekand, Tal.:Tasgaon","Sangli","Maharashtra","416307","India");
		us.loginDetails("Rohitpatil","Rohit@123", "Rohit@123");
   }
}
