package UI_Automation;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageClasses.CheckoutFlow;

public class FragranceProductCheckoutTest extends BaseClass {

	@Test
	@Parameters({"URL","LoginName","Password"})
	public void checkoutFlow(String url,String loginName,String password) throws InterruptedException {
		
		driver.get(url);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
		
		CheckoutFlow ch=new CheckoutFlow(driver);
		ch.login(loginName,password);
		Thread.sleep(3000);
		ch.fragrancePoduct();
	}
}
