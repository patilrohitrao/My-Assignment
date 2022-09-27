package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseClass;

public class ActionClass extends BaseClass {

	 static Actions act= new Actions(driver);
	
	public static void moveToElement(WebElement element) {
		
	
	    act.moveToElement(element).build().perform();
	}
}
