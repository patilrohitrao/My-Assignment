package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import BaseClass.BaseClass;
import Helper.SelectDropDown;


public class RegisterNewUser extends BaseClass {

	WebDriver driver;
	SoftAssert softAssert=new SoftAssert();
	
	public RegisterNewUser(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(xpath="//a[text()=\"Login or register\"]")
		WebElement register;
     
     @FindBy(xpath="//button[@title=\"Continue\"]")
        WebElement newContnue;
     
     //Personal Details
     @FindBy(xpath="//input[@name=\"firstname\"]")
        WebElement firstName;
     
     @FindBy(xpath="//input[@name=\"lastname\"]")
        WebElement lastName;
     
     @FindBy(xpath="//input[@id=\"AccountFrm_email\"]")
        WebElement email;
     
     //Address
     @FindBy(xpath="//input[@name=\"address_1\"]")
        WebElement address;
     
     @FindBy(xpath="//input[@name=\"city\"]")
        WebElement city;
     
     @FindBy(xpath="//select[@name=\"zone_id\"]")
        WebElement state;
     
     @FindBy(xpath="//input[@name=\"postcode\"]")
        WebElement zipCode;
     
     @FindBy(xpath="//select[@name=\"country_id\"]")
        WebElement country;
     
     // Login Details     
     @FindBy(xpath="//input[@name=\"loginname\"]")
        WebElement loginName;
     
     @FindBy(xpath="//input[@name=\"password\"]")
        WebElement password;
     
     @FindBy(xpath="//input[@name=\"confirm\"]")
        WebElement passConfirm;
    
     //Newsletter
     @FindBy(xpath="//input[@id=\"AccountFrm_newsletter1\"]")
        WebElement newsletterSubscribe;
     
     @FindBy(xpath="//input[@name=\"agree\"]")
        WebElement agreePolicy;
     
     @FindBy(xpath="//button[@title=\"Continue\"]")
        WebElement submit;
     
     public void personalDetails(String lstNam,String fstNam,String emailID,String addre,String cityName,String stateName,
    		              String zipCod,String countryName) throws InterruptedException {
    	 
    	 register.click();
    	 softAssert.assertEquals(driver.getTitle(), "Account Login");
    	 
    	 newContnue.click();
    	 softAssert.assertEquals(driver.getTitle(), "Create Account");
    	
    	 softAssert.assertTrue(firstName.isSelected());
    	 firstName.sendKeys(fstNam);
    	 lastName.sendKeys(lstNam);
    	 email.sendKeys(emailID);
    	 address.sendKeys(addre);
    	 city.sendKeys(cityName);
    	 Thread.sleep(3000);
         SelectDropDown.selectByVisibleText(country, countryName);
    	 zipCode.sendKeys(zipCod);
    	 Thread.sleep(3000);
    	 SelectDropDown.selectByVisibleText(state, stateName);
      }
     
     public void loginDetails(String logName, String pass, String confPass) {
    	 
    	 loginName.sendKeys(logName);
    	 password.sendKeys(pass);
    	 passConfirm.sendKeys(confPass);
    	 newsletterSubscribe.click();
    	 agreePolicy.click();
    	 submit.click();
     }
	}


