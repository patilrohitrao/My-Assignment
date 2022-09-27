package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import Helper.ActionClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutFlow extends BaseClass {

	Actions act = new Actions(driver);

	public CheckoutFlow(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Login or register\"]")
	WebElement login;

	@FindBy(xpath = "//input[@name=\"loginname\"]")
	WebElement loginName;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@title=\"Login\"]")
	WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[5]/a")
	WebElement fragrance;

	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[5]/div/ul[1]/li[1]/a")
	WebElement men;

	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[1]/div/a")
	WebElement deodorant;

	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[4]/ul/li/a")
	WebElement addToCart;

	@FindBy(xpath = "//a[@id='cart_checkout2']")
	WebElement checkout;

	@FindBy(xpath = "//button[@title='Confirm Order']")
	WebElement confirmOrder;

	public void login(String logName, String pWord) {

		login.click();
		loginName.sendKeys(logName);
		password.sendKeys(pWord);
		loginButton.click();
	}
	
	public void fragrancePoduct() {

		ActionClass.moveToElement(fragrance);
		men.click();
		deodorant.click();
		addToCart.click();
		checkout.click();
		confirmOrder.click();
		
	}

}
